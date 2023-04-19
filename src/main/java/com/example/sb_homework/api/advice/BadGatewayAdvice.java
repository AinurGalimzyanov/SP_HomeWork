package com.example.sb_homework.api.advice;

import com.example.sb_homework.api.annotation.ExaptionV1;
import com.example.sb_homework.api.exaptions.BadGatewayException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_GATEWAY;
import static org.springframework.http.ResponseEntity.status;

@ExaptionV1
public class BadGatewayAdvice {
    @ExceptionHandler({BadGatewayException.class})
    public ResponseEntity<String> badGateway(Exception e) {
        return status(BAD_GATEWAY).body(e.getMessage());
    }
}
