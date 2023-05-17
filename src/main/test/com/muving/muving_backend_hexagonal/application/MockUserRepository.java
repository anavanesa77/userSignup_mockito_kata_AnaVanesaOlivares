package com.muving.muving_backend_hexagonal.application;

import com.muving.muving_backend_hexagonal.domain.User;
import com.muving.muving_backend_hexagonal.infrastructure.UserRepository;

public class MockUserRepository implements UserRepository {
    @Override
    public void saverUser(User user) {

    }

    @Override
    public User getUserByEmail(User user) {
        return null;
    }

    public boolean getUserByEmailHasBeenCalledWith(User user) {
        return false;
    }

    public boolean saverUserHasBeenCalledWith(User user) {
        return false;
    }
}
