package com.example.sb_homework.api.controllers;

import com.example.sb_homework.api.controllers.dto.request.CheckDBModelRequest;
import com.example.sb_homework.api.controllers.dto.response.CheckDBModelResponse;
import com.example.sb_homework.logic.manager.ListEventsService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class CheckController {
    ListEventsService listEventsManager;

    @GetMapping("/getList")
    public ResponseEntity<List<CheckDBModelResponse>> getEvents() {
        return new ResponseEntity<>(listEventsManager.getEvents(), HttpStatus.OK);
    }

    @PostMapping("/addEvent")
    public ResponseEntity<CheckDBModelResponse> addEvent(@RequestBody CheckDBModelRequest request) {
        return new ResponseEntity<>(listEventsManager.addEvents(request), HttpStatus.OK);
    }
}
