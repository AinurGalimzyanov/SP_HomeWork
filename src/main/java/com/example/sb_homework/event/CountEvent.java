package com.example.sb_homework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class CountEvent extends ApplicationEvent {
    private final String message;

    public CountEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
