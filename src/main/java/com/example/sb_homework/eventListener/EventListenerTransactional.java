package com.example.sb_homework.eventListener;

import com.example.sb_homework.event.CountEvent;
import com.example.sb_homework.event.NameEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventListenerTransactional {
    @EventListener
    public void transactionalListener(NameEvent nameEvent)
    {
        log.info("The transactional event worked for {}", nameEvent.getMessage());
    }
}
