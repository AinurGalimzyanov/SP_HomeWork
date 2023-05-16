package com.example.sb_homework.api.config;

import com.example.sb_homework.api.config.properties.TestProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestConfig {
    @Bean(name = "test")
    @Profile("test")
    public String tester1(){
        System.out.println("tester1");
        return "test1";
    }

    @Bean
    @ConditionalOnBean(name = "test")
    public String tester2(){
        System.out.println("tester2");
        return "test2";
    }

    @Bean
    @ConditionalOnExpression("'${test.evn}'.equals('default')")
    public String tester3() {
        System.out.println("tester3");
        return "test3";
    }
}
