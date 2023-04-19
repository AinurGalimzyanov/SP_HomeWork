package com.example.sb_homework.api.controllers.dto.request;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class InfoModelRequest {
    public Date date;
}
