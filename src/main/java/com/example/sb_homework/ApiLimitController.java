package com.example.sb_homework;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiLimitController {
    @ApiLimit
    @PostMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
