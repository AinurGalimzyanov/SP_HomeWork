package com.example.sb_homework;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    NumberService numberService;

    @GetMapping("/sum")
    public ResponseEntity<Integer> sum() {
        Integer one = numberService.getOne();
        Integer two = numberService.getTwo();
        Integer three = numberService.getThree();
        Integer fourth = numberService.getFour();
        var sum = one + two + three + fourth;
        return new ResponseEntity<>(sum, HttpStatus.OK);
    }
}
