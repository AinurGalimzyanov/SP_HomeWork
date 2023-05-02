package com.example.sb_homework.eventListener;

import com.example.sb_homework.event.CountEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventListenerUsual {
    @EventListener
    public void ordinaryHandler(CountEvent countEvent)
    {
        log.info("The ordinary event worked for {}", countEvent.getMessage());
    }
}
