package com.example.sb_homework.api.controllers.dto.request;

import lombok.Value;

import java.util.List;

@Value
public class CheckDBModelRequest {
    String name;

    List<String> list;
}
