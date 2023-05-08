package com.example.sb_homework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class FourthEvent  extends ApplicationEvent {

    String message;
    Boolean shouldHandle;

    public FourthEvent(Object source, String message, boolean shouldHandle) {
        super(source);
        this.message = message;
        this.shouldHandle = shouldHandle;
    }

    public boolean shouldHandle() {
        return shouldHandle;
    }

    public String getMessage(){
        return message;
    }
}
