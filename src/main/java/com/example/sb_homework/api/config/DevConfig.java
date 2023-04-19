package com.example.sb_homework.api.config;

import com.example.sb_homework.api.config.properties.DevProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(DevProperties.class)
@Configuration
public class DevConfig {
}

