package com.muving.muving_backend_hexagonal.infrastructure;

import com.muving.muving_backend_hexagonal.domain.User;

import java.util.List;

public interface UserRepository {

    public void saverUser(User user);
    public List<User> getUserByEmail(User user);
}
