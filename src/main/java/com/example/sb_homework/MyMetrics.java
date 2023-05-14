package com.example.sb_homework;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.stereotype.Component;

@Component
public class MyMetrics {
    private final Counter successCounter = Metrics.counter("myapp.success");

    public void recordSuccess() {
        successCounter.increment();
    }
}
