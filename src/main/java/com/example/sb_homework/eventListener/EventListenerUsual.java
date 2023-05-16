package com.example.sb_homework.eventListener;

import com.example.sb_homework.event.FirstEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class EventListenerUsual {
    @EventListener
    public void usualListener(FirstEvent fisrtEvent)
    {
        log.info("The first event work!" + ' ' + fisrtEvent.getMessage());
    }
}
