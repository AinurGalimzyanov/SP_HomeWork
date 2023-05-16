package com.example.sb_homework.api.controllers;

import com.example.sb_homework.api.annotation.AdminApiV1;
import com.example.sb_homework.api.controllers.dto.request.CreateProductModelRequest;
import com.example.sb_homework.api.controllers.dto.response.ProductModelResponse;
import com.example.sb_homework.api.exaptions.BadGatewayException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@AdminApiV1
public class ProductController {
    @PostMapping("products/add")
    public ResponseEntity<ProductModelResponse> createProduct(@RequestBody CreateProductModelRequest model) {
        return new ResponseEntity<>(new ProductModelResponse(model), HttpStatus.OK);
    }

    @GetMapping(value = "/exception", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getBadGateway(@RequestParam(required = false, defaultValue = "false") boolean exception) throws BadGatewayException {
        if (exception){
            throw new BadGatewayException("Bad Gateway Exception");
        }
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

}
