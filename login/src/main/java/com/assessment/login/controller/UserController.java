package com.assessment.login.controller;

import com.assessment.login.dto.SignupRequest;
import com.assessment.login.entity.User;
import com.assessment.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register-new-user")
    public User registerNewUser(@RequestBody SignupRequest signUpRequest) {
        return userService.registerNewUser(signUpRequest);
    }

    @GetMapping("/profile")
    public String getUserProfile(Authentication authentication) {
        String currentUsername = authentication != null ? authentication.getName() : "Anonymous";
        return "Welcome " + currentUsername + "! You have accessed a protected endpoint successfully.";
    }
}
