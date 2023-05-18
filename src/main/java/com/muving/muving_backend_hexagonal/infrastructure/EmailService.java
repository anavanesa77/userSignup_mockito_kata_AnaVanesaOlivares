package com.muving.muving_backend_hexagonal.infrastructure;

import com.muving.muving_backend_hexagonal.domain.User;

public interface EmailService {
    public void sendEmail(User user);
}
