package com.sha.springbootmicroservice3apigateway.util;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class SecurityUtils {
    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority convertToAuthority(String role){

        String formattedRoleName = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX;

        return new SimpleGrantedAuthority(formattedRoleName);
    }
}
