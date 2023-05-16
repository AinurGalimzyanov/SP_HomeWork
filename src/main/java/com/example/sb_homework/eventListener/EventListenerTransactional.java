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
@Component
public class EventListenerTransactional {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public FourthEvent thirdTransactionalListener(ThirdEvent thirdEvent)
    {
        log.info("The third event work!" + ' ' + thirdEvent.getMessage());
        return new FourthEvent(thirdEvent.getSource(), "4");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void fourthTransactionalListener(FourthEvent fourthEvent ) {
        log.info("The fourth event work!" + ' ' + fourthEvent.getMessage());
    }
}
