package com.example.sb_homework.api.admin;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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

import javax.annotation.security.RolesAllowed;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/admin")
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class AdminController {

    InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @GetMapping( "getAdmin")
    @RolesAllowed("ADMIN")
    public ResponseEntity<String> GetAdmin() {
        var admin = inMemoryUserDetailsManager.loadUserByUsername("admin");
        return new ResponseEntity<>(admin.getUsername(), HttpStatus.OK);
    }
}
