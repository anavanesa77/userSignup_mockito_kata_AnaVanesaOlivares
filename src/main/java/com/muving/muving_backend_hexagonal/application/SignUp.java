package com.muving.muving_backend_hexagonal.application;

import com.muving.muving_backend_hexagonal.domain.User;
import com.muving.muving_backend_hexagonal.infrastructure.EmailService;
import com.muving.muving_backend_hexagonal.infrastructure.UserRepository;

public class SignUp {

    UserRepository userRepository;

    EmailService emailService;

    public SignUp(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void registerUser(User user) {
    }
}
