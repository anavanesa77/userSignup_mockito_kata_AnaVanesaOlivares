package com.mock.user_signup_kata.infrastructure;

import com.mock.user_signup_kata.domain.User;

public interface EmailService {
    public void sendEmail(User user);
}
