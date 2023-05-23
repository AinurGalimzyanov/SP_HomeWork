package com.example.sb_homework.api.controllers.dto.response;

import com.example.sb_homework.api.controllers.dto.request.CreateProductModelRequest;
import lombok.Builder;
import lombok.Value;

@Value
public class ProductModelResponse {

    public double price;

    public InfoModelResponse info;

    public ProductModelResponse(CreateProductModelRequest request) {
        this.price = request.getPrice();
        this.info = new InfoModelResponse(request.getInfo());
    }
}