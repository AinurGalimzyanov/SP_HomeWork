package com.example.sb_homework.api.controller;

import com.example.sb_homework.api.config.properties.ProdProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigController {
    final ProdProperties prodProperties;
    @GetMapping("check/config")
    public HashMap<String, String> getConfigInfo() {
        HashMap<String, String> profileInfo = new HashMap<>();
        profileInfo.put("env", prodProperties.getEvn());
        profileInfo.put("app", prodProperties.getApp());
        profileInfo.put("list", prodProperties.getListValue().toString());
        return profileInfo;
    }
}