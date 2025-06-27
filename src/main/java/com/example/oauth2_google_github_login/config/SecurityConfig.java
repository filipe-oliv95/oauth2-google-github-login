package com.example.oauth2_google_github_login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import com.example.oauth2_google_github_login.service.CustomOAuth2UserService;
import com.example.oauth2_google_github_login.service.CustomOidcUserService;

@Configuration
public class SecurityConfig {

    private final CustomOidcUserService customOidcUserService;
    private final CustomOAuth2UserService customOAuth2UserService;

    public SecurityConfig(CustomOidcUserService customOidcUserService,
                          CustomOAuth2UserService customOAuth2UserService) {
        this.customOidcUserService = customOidcUserService;
        this.customOAuth2UserService = customOAuth2UserService;
    }
	
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll() 
                .anyRequest().authenticated()
            )
            .oauth2Login(oauth2 -> oauth2
                .userInfoEndpoint(userInfo -> userInfo
            		.oidcUserService(customOidcUserService) // for Google
                    .userService(customOAuth2UserService) //for GitHub and Others
                )
            )
            .headers(headers -> headers
                .frameOptions(frame -> frame.disable())
            )
            .sessionManagement(session -> session
                    .sessionFixation().none() 
            )
            .csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

}