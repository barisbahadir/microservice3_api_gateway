package com.sha.springbootmicroservice3apigateway.request;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class FeignConfiguration {

    @Bean
    public BasicAuthenticationInterceptor basicAuthenticationInterceptor(
            @Value("${service.security-secure-key-username}") String username,
            @Value("${service.security-secure-key-password}") String password){

        return new BasicAuthenticationInterceptor(username, password);
    }



}
