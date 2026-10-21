package com.assessment.login.service;

import com.assessment.login.dto.SignupRequest;
import com.assessment.login.entity.User;
import com.assessment.login.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    public User registerNewUser(SignupRequest signUpRequest) {
        if (userRepo.existsById(signUpRequest.getUserName())) {
            throw new RuntimeException("User with username '" + signUpRequest.getUserName() + "' already exists");
        }

        User user = new User();
        user.setUserName(signUpRequest.getUserName());
        user.setUserPassword(getEncodedPassword(signUpRequest.getUserPassword()));
        user.setUserFirstName(signUpRequest.getUserFirstName());
        user.setUserLastName(signUpRequest.getUserLastName());

        return userRepo.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
