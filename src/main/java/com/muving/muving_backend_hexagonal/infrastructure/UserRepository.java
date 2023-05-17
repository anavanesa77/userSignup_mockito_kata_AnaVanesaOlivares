package com.muving.muving_backend_hexagonal.infrastructure;

import com.muving.muving_backend_hexagonal.domain.User;

public interface UserRepository {

    public void saverUser(User user);
    public User getUserByEmail(User user);
}
