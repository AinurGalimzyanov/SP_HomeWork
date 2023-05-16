package com.example.sb_homework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


public class SecondEvent extends ApplicationEvent {
    String message;

    public SecondEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
