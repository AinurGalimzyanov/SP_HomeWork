package com.example.sb_homework;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class MyMetrics {

    MeterRegistry meterRegistry;
    @Around("execution(* com.example.sb_homework.MetricsService.*(..))")
    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        meterRegistry.counter("requests.count").increment();
        long startAt = System.currentTimeMillis();
        try {
            return joinPoint.proceed();
        } finally {
            meterRegistry.timer("requests.timer").record(System.currentTimeMillis() - startAt, TimeUnit.MILLISECONDS);
        }
    }
}
