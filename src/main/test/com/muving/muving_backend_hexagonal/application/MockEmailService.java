package com.muving.muving_backend_hexagonal.application;

import com.muving.muving_backend_hexagonal.domain.User;
import com.muving.muving_backend_hexagonal.infrastructure.EmailService;

public class MockEmailService implements EmailService {

    String email;

    @Override
    public void sendEmail(User user) {
        this.email = user.getEmail();
    }

    public boolean sendEmailHasBeenCalledWith(User user) {
        if (email.equals(user.getEmail())) {
            return true;
        }
        return false;
    }
}
