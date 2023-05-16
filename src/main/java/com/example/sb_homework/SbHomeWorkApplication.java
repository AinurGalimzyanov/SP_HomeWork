package com.example.sb_homework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
@Slf4j
public class SbHomeWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbHomeWorkApplication.class, args);
    }

    @StreamListener(target = Sink.INPUT)
    public void logfast(RequestModel model) {
        log.info("Name: " + model.getName());
        log.info("Age: " + model.getAge());
        log.info("Do уou like java?: " + model.getDoYouLikeJava());
    }
}
