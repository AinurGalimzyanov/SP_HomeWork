package com.example.sb_homework.api.config.properties;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@Value
@ConstructorBinding
@ConfigurationProperties("dev")
public class DevProperties {
    String evn;
    String app;
    List<Integer> listValue;
}