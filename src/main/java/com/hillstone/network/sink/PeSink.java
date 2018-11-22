package com.hillstone.network.sink;

import com.hillstone.network.event.PEThreatEvent;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

/**
 * @author lbqin
 * @ClassName: PeSink.java
 * @Description: sink function for PEThreatEvent
 * @Date 2018/11/7 14:11
 */
abstract public class PeSink extends RichSinkFunction<PEThreatEvent> {

}
