package com.hillstone.network.source;

import com.hillstone.network.event.Event;
import com.hillstone.network.event.PEThreatEvent;
import com.hillstone.network.event.WinSystemLog;
import net.sf.json.JSONObject;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.typeutils.TypeExtractor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author lbqin
 * @ClassName: PEEventDeserializationSchema.java
 * @Description: deserialize threat event data from json to PEThreatEvent object
 * @Date 2018/11/5 14:04
 */
public class PEEventDeserializationSchema implements DeserializationSchema<Event> {

    private static final long serialVersionUID = 275586851494800931L;

    @Override
    public TypeInformation<Event> getProducedType() {
        return TypeExtractor.getForClass(Event.class);
    }

    @Override
    public Event deserialize(byte[] arg) throws IOException {
        String str = new String(arg, StandardCharsets.UTF_8);
        Event event;
        //JsonDecoder jsonDecoder = DecoderFactory.get().jsonDecoder(PEThreatEvent.getClassSchema(), str);
        //SpecificDatumReader<PEThreatEvent> reader = new SpecificDatumReader<PEThreatEvent>(PEThreatEvent.class);
        //PEThreatEvent event = reader.read(null, jsonDecoder);
        JSONObject jsonObject = JSONObject.fromObject(str);
        if(jsonObject.has("event_name")) {
             event = (PEThreatEvent) JSONObject.toBean(jsonObject, PEThreatEvent.class);
        } else {
            event = (WinSystemLog) JSONObject.toBean(jsonObject, WinSystemLog.class);
        }
        return event;

    }

    @Override
    public boolean isEndOfStream(Event arg) {
        return false;
    }
}
