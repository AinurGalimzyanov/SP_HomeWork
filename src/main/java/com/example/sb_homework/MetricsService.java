package com.example.sb_homework;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class MetricsService {
    MeterRegistry meterRegistry;

    private void countChocolateIncrement(String chocolateName) {
        Counter counter = meterRegistry.counter(chocolateName);
        counter.increment();
    }

    public String snickers() {
        countChocolateIncrement("snickers");
        return "Snickers";
    }

    public String twix() {
        countChocolateIncrement("twix");
        return "Twix";
    }

    public String kitKat() {
        countChocolateIncrement("kitKat");
        return "KitKat";
    }
}
