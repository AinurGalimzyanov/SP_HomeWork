package com.example.sb_homework.api.controller;

import com.example.sb_homework.api.config.properties.TestProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class ConfigController {
    TestProperties testProperties;
    @GetMapping("check/config")
    public HashMap<String, String> getConfigInfo() {
        HashMap<String, String> profileInfo = new HashMap<>();
        profileInfo.put("env", testProperties.getEvn());
        profileInfo.put("app", testProperties.getApp());
        profileInfo.put("list", testProperties.getListValue().toString());
        return profileInfo;
    }
}