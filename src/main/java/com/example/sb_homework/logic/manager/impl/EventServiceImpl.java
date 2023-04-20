package com.example.sb_homework.logic.manager.impl;

import com.example.sb_homework.dal.event.EventDal;
import com.example.sb_homework.dal.event.repository.EventRepository;
import com.example.sb_homework.logic.manager.EventService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class EventServiceImpl implements EventService {

    EventRepository eventRepository;

    @Override
    public EventDal create(EventDal dal) {
        return eventRepository.save(dal);
    }

    @Override
    @Transactional
    public EventDal get(Long id) {
        return null;
    }

    @Override
    public void update(EventDal dal) {

    }

    @Override
    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}
