package com.example.sb_homework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;

@Component
@Slf4j
@Endpoint(id = "datetime")
public class MyActuator{

    @ReadOperation
    public Instant dateTime() {
        Instant i = Instant.now();
        log.info(i.toString());
        return i;
    }
}
