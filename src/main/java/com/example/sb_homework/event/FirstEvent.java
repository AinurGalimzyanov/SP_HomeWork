package com.example.sb_homework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


public class FirstEvent extends ApplicationEvent {
    String message;

    public FirstEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
