package com.example.sb_homework;

import io.micrometer.core.annotation.Timed;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class MyController {

    MetricsService metricsService;

    @GetMapping("/kitkat")
    public String getKitKat() {
        return metricsService.kitKat();
    }

    @GetMapping("/twix")
    public String getTwix() {
        return metricsService.twix();
    }

    @GetMapping("/snickers")
    public String getSnickers() {
        return metricsService.snickers();
    }
}
