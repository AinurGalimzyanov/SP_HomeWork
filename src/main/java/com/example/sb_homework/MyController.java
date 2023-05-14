package com.example.sb_homework;

import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {
    @Autowired
    MetricsService metricsService;

    @GetMapping(value = "/metric")
    @ResponseBody
    public Map getStatusMetric() {
        return metricsService.getFullMetric();
    }
}
