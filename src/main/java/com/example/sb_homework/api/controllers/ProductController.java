package com.example.sb_homework.api.controllers;

import com.example.sb_homework.api.controllers.dto.request.CreateProductModelRequest;
import com.example.sb_homework.api.controllers.dto.response.ProductModelResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductController {
    @PostMapping("products/add")
    public ResponseEntity<ProductModelResponse> createProduct(@RequestBody @Valid CreateProductModelRequest model) {
        return new ResponseEntity<>(new ProductModelResponse(model), HttpStatus.OK);
    }
}