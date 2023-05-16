package com.example.sb_homework.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.annotation.security.RolesAllowed;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/api/admin/**")
                .hasAnyRole("ADMIN")
                .antMatchers("/api/public/**")
                .permitAll()
                .antMatchers("/api/support/**")
                .hasAnyRole("ADMIN", "SUPPORT")
                .and()
                .formLogin()
                .and().httpBasic();
        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.withUsername("admin")
                .password(encoder().encode("123"))
                .roles("ADMIN")
                .build();
        UserDetails user = User.withUsername("user")
                .password(encoder().encode("123"))
                .roles("PUBLIC")
                .build();
        UserDetails support = User.withUsername("support")
                .password(encoder().encode("123"))
                .roles("SUPPORT")
                .build();
        return new InMemoryUserDetailsManager(admin, user, support);
    }
}
