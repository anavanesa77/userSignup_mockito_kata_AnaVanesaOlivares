package com.muving.muving_backend_hexagonal.application;

import com.muving.muving_backend_hexagonal.domain.User;
import com.muving.muving_backend_hexagonal.infrastructure.EmailService;

public class MockEmailService implements EmailService {
    @Override
    public void sendEmail(User user) {

    }

    public boolean sendEmailHasBeenCalledWith(User user) {
        return false;
    }
}
