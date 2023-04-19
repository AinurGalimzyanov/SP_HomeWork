package com.example.sb_homework.api.controllers.dto.request;

import com.example.sb_homework.api.validation.NameConstraint;
import com.example.sb_homework.api.validation.TextConstraint;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateProductModelRequest {
    public double price;

    @TextConstraint
    public String text;

    @NameConstraint
    public String name;
}