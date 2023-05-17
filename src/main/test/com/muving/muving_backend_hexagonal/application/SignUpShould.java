package com.muving.muving_backend_hexagonal.application;

import com.muving.muving_backend_hexagonal.domain.User;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
userNoRegistered ->
UserRepository.getUserByEmail has been called = true
UserRepository.saverUser has been called = true
EmailService.sendEmail has been called = true

userRegistered ->
UserRepository.getUserByEmail has been called = true
SignUp -> thrown message (User is already register)
 */

class SignUpShould {

    @Test
    void registerAUserWhenNotRegistered() {
        MockUserRepository userRepository = new MockUserRepository();
        MockEmailService emailService = new MockEmailService();

        SignUp signUp = new SignUp(userRepository, emailService);

        String name = "Rocio";
        String surname = "Ramos";
        int phoneNumber = 000000;
        String funcionalDiversity = "Cognitive";
        String email = "rocioramos@prueba.es";
        User user = new User(name, surname, phoneNumber, funcionalDiversity, email);

        signUp.registerUser(user);

        assertThat(userRepository.getUserByEmailHasBeenCalledWith(user)).isTrue();
        assertThat(userRepository.saverUserHasBeenCalledWith(user)).isTrue();
        assertThat(emailService.sendEmailHasBeenCalledWith(user)).isTrue();

    }
}