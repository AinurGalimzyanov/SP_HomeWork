package com.example.sb_homework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class FisrtEvent extends ApplicationEvent {
    String message;

    public FisrtEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
