package com.example.sb_homework;

import com.example.sb_homework.dto.request.TestModelRequest;
import com.example.sb_homework.dto.response.TestModelResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TestController {

    TestService testService;
    NumberService numberService;

    @GetMapping("test")
    private ResponseEntity<TestModelResponse> getTest()
    {
        var count = testService.getCount();
        var name = testService.getName();

        return new ResponseEntity<>(new TestModelResponse(name, count), HttpStatus.OK);
    }

    @GetMapping("/abc")
    public void abc() {
        Integer one = numberService.getOne();
        Integer two = numberService.getTwo();
        Integer three = numberService.getThree();

    }
}
