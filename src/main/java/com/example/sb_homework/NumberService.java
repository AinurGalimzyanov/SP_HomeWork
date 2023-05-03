package com.example.sb_homework;

import com.example.sb_homework.event.FisrtEvent;
import com.example.sb_homework.event.FourthEvent;
import com.example.sb_homework.event.SecondEvent;
import com.example.sb_homework.event.ThirdEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.SQLException;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class NumberService {

    ApplicationEventPublisher applicationEventPublisher;
    DataSource dataSource;

    public Integer getOne() {
        applicationEventPublisher.publishEvent(new FisrtEvent(this, "one"));
        return 1;
    }
    public Integer getTwo() {
        applicationEventPublisher.publishEvent(new SecondEvent(this, "two"));
        return 2;
    }

    public Integer getThree()  {
//        Connection connection = dataSource.getConnection();
//
//        try (connection) {
//            connection.setAutoCommit(false);
//            connection.commit();
//        } catch (SQLException e) {
//            connection.rollback();
//        }
        applicationEventPublisher.publishEvent(new ThirdEvent(this, "three"));
        return 3;
    }

    public Integer getFour() {
        applicationEventPublisher.publishEvent(new FourthEvent(this, "four"));
        return 4;
    }
}
