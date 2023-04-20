package com.example.sb_homework.logic.manager;

import com.example.sb_homework.api.controllers.dto.request.CheckDBModelRequest;
import com.example.sb_homework.api.controllers.dto.response.CheckDBModelResponse;
import com.example.sb_homework.dal.my_list_events.MyListEventsDal;

import java.util.List;

public interface ListEventsService extends BaseService<MyListEventsDal> {
    List<CheckDBModelResponse> getEvents();

    CheckDBModelResponse addEvents(CheckDBModelRequest request);
}
