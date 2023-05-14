package com.example.sb_homework;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Endpoint(id = "my-actuator")
@Component
public class MyActuator {

    @ReadOperation
    public String myOperation() {
        String message = "My actuator was called at " + LocalDateTime.now();
        System.out.println(message);
        return message;
    }
}
