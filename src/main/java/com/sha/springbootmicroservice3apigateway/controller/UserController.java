package com.sha.springbootmicroservice3apigateway.controller;

import com.sha.springbootmicroservice3apigateway.model.Role;
import com.sha.springbootmicroservice3apigateway.security.UserPrincipal;
import com.sha.springbootmicroservice3apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("change/{role}")
    public ResponseEntity<?> changeRoler(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role){
        userService.changeRole(role, userPrincipal.getUsername());

        return ResponseEntity.ok(true);
    }

}
