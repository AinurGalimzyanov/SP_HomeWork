package com.example.sb_homework;

public class ApiLimitException extends RuntimeException{
    public ApiLimitException(String ex){
        super(ex);
    }
}
