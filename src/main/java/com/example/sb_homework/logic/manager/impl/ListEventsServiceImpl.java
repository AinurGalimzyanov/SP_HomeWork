package com.example.sb_homework.logic.manager.impl;

import com.example.sb_homework.api.controllers.dto.request.CheckDBModelRequest;
import com.example.sb_homework.api.controllers.dto.response.CheckDBModelResponse;
import com.example.sb_homework.dal.event.EventDal;
import com.example.sb_homework.dal.my_list_events.MyListEventsDal;
import com.example.sb_homework.dal.my_list_events.repository.MyListEventsRepository;
import com.example.sb_homework.logic.manager.factory.ListEventFactory;
import com.example.sb_homework.logic.manager.ListEventsService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ListEventsServiceImpl implements ListEventsService {

    MyListEventsRepository myListEventsRepository;
    ListEventFactory listEventFactory;

    @Override
    public MyListEventsDal create(MyListEventsDal dal) {
        return myListEventsRepository.save(dal);
    }

    @Override
    public MyListEventsDal get(Long id) {
        return null;
    }

    @Override
    public void update(MyListEventsDal dal) {

    }

    @Override
    public void delete(Long id) {
        myListEventsRepository.deleteById(id);
    }


    @Override
    public List<CheckDBModelResponse> getEvents() {
        return myListEventsRepository.findAll().stream()
                .map(listEventFactory::createCheckDBModelResponseFrom).collect(Collectors.toList());
    }

    @Override
    public CheckDBModelResponse addEvents(CheckDBModelRequest request) {

        MyListEventsDal eventsDal = MyListEventsDal.createMyListEventsDalFrom(request);
        MyListEventsDal finalEvents = eventsDal;
        eventsDal.setEvents(request.getList()
                .stream()
                .map(event -> EventDal.createEventFrom(event, finalEvents))
                .collect(Collectors.toList()));
        eventsDal = myListEventsRepository.save(eventsDal);
        return listEventFactory.createCheckDBModelResponseFrom(eventsDal);
    }
}
