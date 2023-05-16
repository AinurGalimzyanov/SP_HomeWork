package com.example.sb_homework.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HeadersController {
    @GetMapping( "/all-headers")
    public Map<String, String> GetAllHeaders(@RequestHeader Map<String, String> headers) {
        return headers;
    }
}
