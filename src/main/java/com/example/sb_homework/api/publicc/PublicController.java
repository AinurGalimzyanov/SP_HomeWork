package com.example.sb_homework.api.publicc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/public")
public class PublicController {

    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @GetMapping( "getUser")
    public ResponseEntity<String> GetUser() {
        var user = inMemoryUserDetailsManager.loadUserByUsername("user");
        return new ResponseEntity<>(user.getUsername(), HttpStatus.OK);
    }
}
