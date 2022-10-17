package com.sha.springbootmicroservice3apigateway.authentication;

import com.sha.springbootmicroservice3apigateway.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
