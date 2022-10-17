package com.sha.springbootmicroservice3apigateway.jwt;

import com.sha.springbootmicroservice3apigateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {

    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);

}
