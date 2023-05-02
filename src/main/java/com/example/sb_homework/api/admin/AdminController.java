package com.example.sb_homework.api.admin;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {

    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;
    @GetMapping( "getAdmin")
    public ResponseEntity<String> GetAdmin() {
        var admin = inMemoryUserDetailsManager.loadUserByUsername("admin");
        return new ResponseEntity<>(admin.getUsername(), HttpStatus.OK);
    }
}
