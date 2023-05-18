package com.mock.user_signup_kata.application;

import com.mock.user_signup_kata.domain.User;

import static org.mockito.Mockito.mock;

import com.mock.user_signup_kata.infrastructure.EmailService;
import com.mock.user_signup_kata.infrastructure.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

/*
userNoRegistered ->
UserRepository.getUserByEmail has been called = true
UserRepository.saverUser has been called = true
EmailService.sendEmail has been called = true

userRegistered ->
UserRepository.getUserByEmail has been called = true
SignUp -> thrown message (User is already register)
 */

@RunWith(MockitoJUnitRunner.class)
class SignUpShould {
    @Mock
    UserRepository mockUserRepository;
    EmailService mockEmailService;

    @InjectMocks
    SignUp signUp;

    @Test
    void register_a_user_when_not_registered() {
        User expectedUser = new User("Rocio", "Ramos", 000000, "Cognitive", "rocioramos@prueba.es");
        signUp.registerUser(expectedUser);

        Mockito.verify(mockUserRepository).getUserByEmail(expectedUser);
        Mockito.verify(mockUserRepository).saverUser(expectedUser);
        Mockito.verify(mockEmailService).sendEmail(expectedUser);
    }

}
