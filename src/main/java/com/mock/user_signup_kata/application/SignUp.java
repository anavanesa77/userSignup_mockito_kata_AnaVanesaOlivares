package com.mock.user_signup_kata.application;

import com.mock.user_signup_kata.domain.User;
import com.mock.user_signup_kata.infrastructure.EmailService;
import com.mock.user_signup_kata.infrastructure.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class SignUp {

    UserRepository userRepository;

    EmailService emailService;

    public SignUp(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void registerUser(User user) {
        List<User> users = new ArrayList<>();
        users = userRepository.getUserByEmail(user);
        if (users.isEmpty()) {
            userRepository.saverUser(user);
            emailService.sendEmail(user);
        }else{
            throw new IllegalArgumentException("That user is already registered");
        }
    }
}


