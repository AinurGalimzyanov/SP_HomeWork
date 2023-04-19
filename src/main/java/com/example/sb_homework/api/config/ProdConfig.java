package com.example.sb_homework.api.config;

import com.example.sb_homework.api.config.properties.ProdProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(ProdProperties.class)
@Configuration
public class ProdConfig {
}