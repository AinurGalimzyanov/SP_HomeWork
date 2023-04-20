package com.example.sb_homework.logic.manager.factory;

import com.example.sb_homework.api.controllers.dto.response.CheckDBModelResponse;
import com.example.sb_homework.dal.my_list_events.MyListEventsDal;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ListEventFactory {
    public CheckDBModelResponse createCheckDBModelResponseFrom(MyListEventsDal myListEventsDal) {
        List<String> events = new LinkedList<>();
        myListEventsDal.getEvents().forEach(event -> events.add(event.getName()));
        return new CheckDBModelResponse(
                myListEventsDal.getName(),
                events
        );
    }
}
