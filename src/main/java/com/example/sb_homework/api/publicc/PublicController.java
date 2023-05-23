package com.example.sb_homework.api.publicc;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/public")
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class PublicController {

    InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @GetMapping( "getUser")
    @RolesAllowed({"ROLE_PUBLIC"})
    public ResponseEntity<String> GetUser() {
        var user = inMemoryUserDetailsManager.loadUserByUsername("user");
        return new ResponseEntity<>(user.getUsername(), HttpStatus.OK);
    }
}
