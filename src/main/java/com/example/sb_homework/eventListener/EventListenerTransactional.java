package com.example.sb_homework.eventListener;

import com.example.sb_homework.event.CountEvent;
import com.example.sb_homework.event.FourthEvent;
import com.example.sb_homework.event.NameEvent;
import com.example.sb_homework.event.ThirdEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@Slf4j
public class EventListenerTransactional {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public FourthEvent handleNameEvent(ThirdEvent thirdEvent)
    {
        log.info("The third event work!" + ' ' + thirdEvent.getMessage());
        return new FourthEvent(thirdEvent.getSource(), "four");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void handleCountName(FourthEvent fourthEvent) {
        log.info("The fourth event work!" + ' ' + fourthEvent.getMessage());
    }


}
