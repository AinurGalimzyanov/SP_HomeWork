package com.example.sb_homework;

import com.example.sb_homework.event.CountEvent;
import com.example.sb_homework.event.NameEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Random;


@Service
@RequiredArgsConstructor
public class TestService {

    private final ApplicationEventPublisher applicationEventPublisher;
    private TestRepository testRepository;

    public Integer getCount()
    {
        var count = new Random().nextInt(5000);
        applicationEventPublisher.publishEvent(new CountEvent(this, "CountEvent"));
        return count;
    }

    @Transactional
    public String getName()
    {
        var name = "test";
        applicationEventPublisher.publishEvent(new NameEvent(this, "NameEvent"));
        return name;
    }
}
