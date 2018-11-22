package com.hillstone.network.pe;

import com.hillstone.network.event.*;
import com.hillstone.network.sink.PeJDBCSink;
import com.hillstone.network.source.PEEventDeserializationSchema;
import com.hillstone.network.source.PEThreatEventWatermarkEmitter;
import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternSelectFunction;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.cep.pattern.Pattern;
import org.apache.flink.cep.pattern.conditions.IterativeCondition;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer011;

import javax.xml.crypto.Data;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;


/**
 * @author lbqin
 * @ClassName: PeRule1.java
 * @Description: main class of PE rule1
 * @Date 2018/11/2 16:55
 */
public class PeRule1 {

    public static String[] getClassFields(Class c) {
        Field[] fields = c.getDeclaredFields();
        int len = fields.length;
        String[] fieldNames = new String[len];
        for (int i = 0; i < len ; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty("group.id", "test");
        PeJDBCSink sink= new PeJDBCSink();
        String[] fields = getClassFields(PEThreatEvent.class);
        sink.setFields(fields);
        List<String> topicList = new ArrayList<String>();
        topicList.add("test");
        topicList.add("test1");
     //   DataStream<Event> sourceStream = env.addSource(new FlinkKafkaConsumer011<Event>(topicList, new PEEventDeserializationSchema(), properties))
     //                                               .assignTimestampsAndWatermarks(new PEThreatEventWatermarkEmitter());
        DataStream<Event> sourceStream1 = env.addSource(new FlinkKafkaConsumer011<Event>("test", new PEEventDeserializationSchema(), properties));
        //                                .assignTimestampsAndWatermarks(new PEThreatEventWatermarkEmitter());
        DataStream<Event> sourceStream2 = env.addSource(new FlinkKafkaConsumer011<Event>("test1", new PEEventDeserializationSchema(), properties));
        //        .assignTimestampsAndWatermarks(new PEThreatEventWatermarkEmitter());

        DataStream<Event> sourceStream = sourceStream1.union(sourceStream2).assignTimestampsAndWatermarks(new PEThreatEventWatermarkEmitter());

        /*define PE rule 1*/
        Pattern<Event, ?> warningPattern = Pattern.<Event>begin("first")
                .subtype(PEThreatEvent.class)
                .where(new IterativeCondition<PEThreatEvent>() {
                    private static final long serialVersionUID = 5932867018940203849L;

                    @Override
                    public boolean filter(PEThreatEvent peThreatEvent, Context<PEThreatEvent> context) throws Exception {
                        String eventName = peThreatEvent.getEvent_name();
                        int isIoc = peThreatEvent.getIs_ioc();
                        int eventInterv = peThreatEvent.getEvent_interv();
                        long hscc = peThreatEvent.getHscc();
                        return eventName.equals("\"HTTP Header Contain No Browser Information\"") && isIoc == 0
                                && eventInterv != 2 && eventInterv != 4 && hscc == 0;
                    }
                })
                .followedBy("second")
                .subtype(PEThreatEvent.class)
                .where(new IterativeCondition<PEThreatEvent>() {
                    private static final long serialVersionUID = -3607467302392177372L;

                    @Override
                    public boolean filter(PEThreatEvent peThreatEvent, Context<PEThreatEvent> context) throws Exception {
                        String eventName = peThreatEvent.getEvent_name();
                        long dstIp = peThreatEvent.getDst_ip();
                        long srcIp = peThreatEvent.getSrc_ip();
                        PEThreatEvent firstEvent = context.getEventsForPattern("first").iterator().next();
                        return eventName.equals("\"HTTP X-Sinkhole Response\"") && firstEvent.getDst_ip() == dstIp
                                && firstEvent.getSrc_ip() == srcIp;
                    }
                })
                .within(Time.seconds(300));

        /*define rule2*/
        Pattern<Event,?> warning2Pattern = Pattern.<Event>begin("threat")
                .subtype(PEThreatEvent.class)
                .where(new IterativeCondition<PEThreatEvent>() {
                    @Override
                    public boolean filter(PEThreatEvent peThreatEvent, Context<PEThreatEvent> context) throws Exception {
                        return peThreatEvent.getEvent_name().equals("xxxxx");
                    }
                })
                .followedBy("winlog")
                .where(new IterativeCondition<Event>() {

                    @Override
                    public boolean filter(Event winSystemLog, Context<Event> context) throws Exception {
                        int threatsp = ((PEThreatEvent) (context.getEventsForPattern("threat").iterator().next())).getSrc_port();
                        return winSystemLog instanceof WinSystemLog
                                && threatsp == Integer.parseInt(((WinSystemLog)winSystemLog).getSourcePort())
                                && ((WinSystemLog) winSystemLog).getImage().equals("qq");
                    }
                }).within(Time.seconds(300));


        PatternStream<Event> rule1Stream = CEP.pattern(sourceStream, warningPattern);
        PatternStream<Event> rule2Stream = CEP.pattern(sourceStream, warning2Pattern);

        DataStream<TestWarning> warnings = rule1Stream.select(new PatternSelectFunction<Event, TestWarning>() {

                                                                    private static final long serialVersionUID = 2658448361876254474L;

                                                                    @Override
                                                                    public TestWarning select(Map<String, List<Event>> map) throws Exception {
                                                                        PEThreatEvent first = (PEThreatEvent) map.get("first").get(0);
                                                                        PEThreatEvent second = (PEThreatEvent) map.get("second").get(0);
                                                                        return new TestWarning(first.getId(), second.getId()
                                                                                , first.getEvent_name()
                                                                                , second.getEvent_name()
                                                                                , "correlation rule1");
                                                                  }
                                                              }
        );
        DataStream<Test2Warning> warning2 = rule2Stream.select(new PatternSelectFunction<Event, Test2Warning>() {
            @Override
            public Test2Warning select(Map<String, List<Event>> map) throws Exception {
                PEThreatEvent threat = (PEThreatEvent) map.get("threat").get(0);
                WinSystemLog winlog = (WinSystemLog) map.get("winlog").get(0);

                return new Test2Warning(threat.getId(), winlog.getProcessGuid(), threat.getEvent_name(), winlog.getImage());
            }
        });

        sourceStream.print();
        //sourceStream.addSink(sink);
        warnings.print();
        warning2.print();
        env.execute("correlation rule1");
    }

}
