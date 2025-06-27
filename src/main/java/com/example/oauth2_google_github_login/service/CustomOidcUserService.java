package com.example.oauth2_google_github_login.service;

import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomOidcUserService extends OidcUserService {

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) {
        OidcUser oidcUser = super.loadUser(userRequest);

        Map<String, Object> attributes = oidcUser.getAttributes();
        System.out.println("Google OIDC user attributes:");
        attributes.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("ID Token claims:");
        oidcUser.getIdToken().getClaims().forEach((key, value) -> System.out.println(key + ": " + value));

        return oidcUser;
    }
}
