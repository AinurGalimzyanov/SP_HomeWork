package com.example.sb_homework.config;

import com.example.sb_homework.beans.tree.Maple;
import com.example.sb_homework.beans.tree.Oak;
import com.example.sb_homework.beans.tree.Tree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TreeConfig {

    @Bean
    @Scope(value = "prototype")
    public Tree maple() {

        return new Maple();
    }

    @Bean
    @Scope(value = "prototype")
    public Tree oak() {
        return new Oak();
    }

}