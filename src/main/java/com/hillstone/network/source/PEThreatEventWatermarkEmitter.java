package com.hillstone.network.source;

import com.hillstone.network.event.Event;
import com.hillstone.network.event.PEThreatEvent;
import com.hillstone.network.event.WinSystemLog;
import org.apache.flink.streaming.api.functions.AssignerWithPunctuatedWatermarks;
import org.apache.flink.streaming.api.watermark.Watermark;

/**
 * @author lbqin
 * @ClassName: PEThreatEventWatermarkEmitter.java
 * @Description: Extract Event time from PEThreatEvent and emit watermarks based on event time
 * @Date 2018/11/5 13:28
 */
public class PEThreatEventWatermarkEmitter implements AssignerWithPunctuatedWatermarks<Event> {

    private static final long serialVersionUID = 3316050930039306072L;

    @Override
    public long extractTimestamp(Event event, long timestamp) {
        long timeval;
        if (event != null) {
            if(event instanceof PEThreatEvent) {
                timeval =  1000 * ((PEThreatEvent) event).getEnd_time();
            } else {
                timeval = ((WinSystemLog) event).getTimestamp();
            }
            return timeval;
        }
        return 0;
    }

    @Override
    public Watermark checkAndGetNextWatermark(Event event, long timestamp) {
        if (event != null) {
            if (event instanceof PEThreatEvent) {
                return new Watermark(1000 * ((PEThreatEvent) event).getEnd_time() - 10000);
            } else {
                return new Watermark(((WinSystemLog) event).getTimestamp() - 10000);
            }
        }
        return null;
    }
}
