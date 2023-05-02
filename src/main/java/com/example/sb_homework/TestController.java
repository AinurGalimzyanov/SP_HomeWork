package com.example.sb_homework;

import com.example.sb_homework.dto.request.TestModelRequest;
import com.example.sb_homework.dto.response.TestModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    TestService testService;


    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("test")
    private ResponseEntity<TestModelResponse> getTest()
    {
        var count = testService.getCount();
        var name = testService.getName();

        return new ResponseEntity<>(new TestModelResponse(name, count), HttpStatus.OK);
    }
}
