package com.assessment.login.controller;


import com.assessment.login.dto.LoginRequest;
import com.assessment.login.dto.LoginResponse;
import com.assessment.login.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authentication")
    public LoginResponse createJwtTokenAndLogin(@RequestBody LoginRequest loginRequest) throws Exception{

        return jwtService.createJwtToken(loginRequest);

    }

}
