package com.example.sb_homework.api.controllers.dto.request;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateProductModelRequest {
    public double price;
    public InfoModelRequest info;
}