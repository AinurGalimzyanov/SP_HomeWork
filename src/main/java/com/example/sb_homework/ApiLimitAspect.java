package com.example.sb_homework;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Component
public class ApiLimitAspect {
    private Map<String, Integer> apiAccessMap = new ConcurrentHashMap<>();

    @Value("${api.limit}")
    private int apiLimit;

    @Pointcut("@annotation(com.example.sb_homework.ApiLimit)")
    public void apiLimitAnnotation(){}

    @Before("apiLimitAnnotation()")
    public void  beforeApiLimit(JoinPoint joinPoint) throws ApiLimitException{
        var methodName = joinPoint.getSignature().getName();
        var count = apiAccessMap.getOrDefault(methodName, 0) + 1;
        apiAccessMap.put(methodName, count);
        if (count > apiLimit) {
            throw new ApiLimitException("Limit Exception");
        }
    }
}
