package com.example.sb_homework.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/api/admin/**")
                .hasAnyRole(ClientRoles.ADMIN)
                .antMatchers("/api/public/**")
                .permitAll()
                .antMatchers("/api/support/**")
                .hasAnyRole(ClientRoles.ADMIN, ClientRoles.SUPPORT)
                .and()
                .formLogin()
                .and().httpBasic();
        return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.withUsername("admin")
                .password("123")
                .roles(ClientRoles.ADMIN)
                .build();
        UserDetails user = User.withUsername("user")
                .password("123")
                .roles(ClientRoles.USER)
                .build();
        UserDetails support = User.withUsername("support")
                .password("123")
                .roles(ClientRoles.SUPPORT)
                .build();
        return new InMemoryUserDetailsManager(admin, user, support);
    }
}
