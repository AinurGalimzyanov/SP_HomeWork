package com.example.sb_homework.api.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/support")
public class SupportController {

    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @GetMapping( "getSupport")
    public ResponseEntity<String> GetSupport() {
        var support = inMemoryUserDetailsManager.loadUserByUsername("support");
        return new ResponseEntity<>(support.getUsername(), HttpStatus.OK);
    }
}
