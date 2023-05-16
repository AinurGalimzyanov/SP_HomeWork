package com.example.sb_homework.api.controllers.dto.response;

import com.example.sb_homework.api.controllers.dto.request.InfoModelRequest;
import lombok.Builder;
import lombok.Value;

import java.util.Date;
import java.util.Random;

@Value
public class InfoModelResponse {

    public int id;

    public Date date;

    public InfoModelResponse(InfoModelRequest request) {
        this.date = request.date;
        var r = new Random();
        this.id = r.nextInt(200);
    }
}