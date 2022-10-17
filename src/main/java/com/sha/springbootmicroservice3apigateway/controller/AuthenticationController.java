package com.sha.springbootmicroservice3apigateway.controller;

import com.sha.springbootmicroservice3apigateway.authentication.AuthenticationService;
import com.sha.springbootmicroservice3apigateway.model.User;
import com.sha.springbootmicroservice3apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/authentication") //pre-path
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserService userService;

    @PostMapping("signIn") //api/authentication/signIn
    public ResponseEntity<?> signIn2(@RequestBody User user){

        if(userService.findUserByUsername(user.getUsername()).isPresent()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);

    }

    @PostMapping("sign-up") //api/authentication/sign-up
    public ResponseEntity<?> signUp(@RequestBody User user){

        if(userService.findUserByUsername(user.getUsername()).isPresent()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);

    }

    @PostMapping("sign-in") //api/authentication/sign-in
    public ResponseEntity<?> signIn(@RequestBody User user){
//
//        if(userService.findUserByUsername(user.getUsername()).isEmpty()){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }

        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);

    }
}
