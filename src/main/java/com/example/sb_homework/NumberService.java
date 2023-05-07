package com.example.sb_homework;

import com.example.sb_homework.event.FirstEvent;
import com.example.sb_homework.event.FourthEvent;
import com.example.sb_homework.event.SecondEvent;
import com.example.sb_homework.event.ThirdEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.SQLException;

@Service
@Transactional
public class NumberService {

    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public NumberService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Integer getOne() {
        applicationEventPublisher.publishEvent(new FirstEvent(this, "one"));
        return 1;
    }
    public Integer getTwo() {
        applicationEventPublisher.publishEvent(new SecondEvent(this, "two"));
        return 2;
    }

    public Integer getThree()  {
        applicationEventPublisher.publishEvent(new ThirdEvent(this, "three"));
        return 3;
    }

    public Integer getFour() {
        applicationEventPublisher.publishEvent(new FourthEvent(this, "four"));
        return 4;
    }
}
