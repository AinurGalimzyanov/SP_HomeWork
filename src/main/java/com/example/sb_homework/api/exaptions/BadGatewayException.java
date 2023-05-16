package com.example.sb_homework.api.exaptions;

public class BadGatewayException extends Exception{
    public BadGatewayException(String msg) {
        super(msg);
    }
}
