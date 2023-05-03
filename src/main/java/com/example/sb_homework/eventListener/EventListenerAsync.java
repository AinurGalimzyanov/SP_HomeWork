package com.example.sb_homework.eventListener;

import com.example.sb_homework.event.CountEvent;
import com.example.sb_homework.event.SecondEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableAsync
public class EventListenerAsync {
    @SneakyThrows
    @EventListener
    @Async
    public void asyncListener(SecondEvent secondEvent)
    {
        Thread.sleep(4000);
        log.info("The second event worked" + ' ' + secondEvent.getMessage());
    }
}
