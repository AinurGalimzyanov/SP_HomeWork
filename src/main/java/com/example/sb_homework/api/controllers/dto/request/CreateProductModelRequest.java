package com.example.sb_homework.api.controllers.dto.request;

import lombok.Builder;
import lombok.Value;

@Value
public class CreateProductModelRequest {
    public double price;
    public InfoModelRequest info;
}