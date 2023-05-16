package com.example.sb_homework.api.support;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/support")
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SupportController {

    InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @GetMapping( "getSupport")
    @RolesAllowed({"SUPPORT"})
    public ResponseEntity<String> GetSupport() {
        var support = inMemoryUserDetailsManager.loadUserByUsername("support");
        return new ResponseEntity<>(support.getUsername(), HttpStatus.OK);
    }
}
