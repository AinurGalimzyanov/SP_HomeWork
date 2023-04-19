package com.example.sb_homework.api.controllers.dto.response;

import com.example.sb_homework.api.controllers.dto.request.CreateProductModelRequest;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductModelResponse {

    public double price;

    public String name;

    public String text;

    public ProductModelResponse(CreateProductModelRequest model){
        this.price = model.price;
        this.name = model.name;
        this.text = model.text;
    }
}