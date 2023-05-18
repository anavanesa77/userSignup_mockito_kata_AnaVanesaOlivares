package com.mock.user_signup_kata.application;

import com.mock.user_signup_kata.domain.User;
import static org.mockito.Mockito.mock;
import com.mock.user_signup_kata.infrastructure.EmailService;
import com.mock.user_signup_kata.infrastructure.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

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
    UserRepository mockedUserRepository = mock(UserRepository.class);
    EmailService mockedEmailRepository = mock(EmailService.class);
    SignUp signUp = new SignUp(mockedUserRepository,mockedEmailRepository);

    @Test
    void register_a_user_when_not_registered() {
        User expectedUser = new User("Rocio", "Ramos", 000000, "Cognitive", "rocioramos@prueba.es");

        Mockito.when(mockedUserRepository.getUserByEmail(expectedUser)).thenReturn(List.of());
        signUp.registerUser(expectedUser);

        Mockito.verify(mockedUserRepository).saverUser(expectedUser);
        Mockito.verify(mockedEmailRepository).sendEmail(expectedUser);
    }


    @Test
    void throw_error_when_user_is_alredy_registered() {
        User expectedUser = new User("Rocio", "Ramos", 000000, "Cognitive", "rocioramos@prueba.es");

        Mockito.when(mockedUserRepository.getUserByEmail(expectedUser)).thenThrow(new IllegalArgumentException());
        signUp.registerUser(expectedUser);

        Mockito.verify(mockedUserRepository).saverUser(expectedUser);
        Mockito.verify(mockedEmailRepository).sendEmail(expectedUser);

    }


}
