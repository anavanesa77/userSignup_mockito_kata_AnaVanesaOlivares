package com.mock.user_signup_kata.infrastructure;

import com.mock.user_signup_kata.domain.User;

import java.util.List;

public interface UserRepository {

    public void saverUser(User user);
    public List<User> getUserByEmail(User user);
}
