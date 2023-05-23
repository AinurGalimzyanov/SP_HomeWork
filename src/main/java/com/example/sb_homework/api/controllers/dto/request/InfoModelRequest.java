package com.example.sb_homework.api.controllers.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.Date;

@Value
public class InfoModelRequest {
    Date date;

    public Date getDate() {
        return date;
    }
}
