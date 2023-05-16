package com.example.sb_homework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


public class FourthEvent  extends ApplicationEvent {

    String message;

    public FourthEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
