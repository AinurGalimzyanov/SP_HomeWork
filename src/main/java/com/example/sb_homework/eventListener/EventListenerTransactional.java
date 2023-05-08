package com.example.sb_homework.eventListener;

import com.example.sb_homework.event.FourthEvent;
import com.example.sb_homework.event.ThirdEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Service
public class EventListenerTransactional {
    @EventListener
    public void thirdTransactionalListener(ThirdEvent thirdEvent)
    {
        log.info("The third event work!" + ' ' + thirdEvent.getMessage());
    }

    @TransactionalEventListener
    public void fourthTransactionalListener(FourthEvent fourthEvent ) {
        if(fourthEvent.shouldHandle()) {
            log.info("The fourth event work!" + ' ' + fourthEvent.getMessage());
        } else {
            log.info("The fourth event ignored!" + ' ' + fourthEvent.getMessage());
        }
    }
}
