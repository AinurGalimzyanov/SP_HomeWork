package com.example.sb_homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SbHomeWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbHomeWorkApplication.class, args);
    }

}
