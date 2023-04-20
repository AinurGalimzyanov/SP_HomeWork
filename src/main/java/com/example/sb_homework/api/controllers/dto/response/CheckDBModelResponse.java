package com.example.sb_homework.api.controllers.dto.response;

import com.example.sb_homework.dal.my_list_events.MyListEventsDal;
import lombok.Value;

import java.util.List;

@Value
public class CheckDBModelResponse {
    String name;

    List<String> list;
}
