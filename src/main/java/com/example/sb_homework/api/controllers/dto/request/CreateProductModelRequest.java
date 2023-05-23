package com.example.sb_homework.api.controllers.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
public class CreateProductModelRequest {
    double price;
    InfoModelRequest info;

    public InfoModelRequest getInfo() {
        return info;
    }

    public double getPrice() {
        return price;
    }
}