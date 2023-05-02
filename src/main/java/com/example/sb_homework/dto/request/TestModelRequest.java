package com.example.sb_homework.dto.request;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TestModelRequest {
    String name;
    Integer count;
}
