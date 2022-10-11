package com.sha.springbootmicroservice3apigateway.service;

import com.sha.springbootmicroservice3apigateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


}
