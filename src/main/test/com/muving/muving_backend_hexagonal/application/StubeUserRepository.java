package com.muving.muving_backend_hexagonal.application;

import com.muving.muving_backend_hexagonal.domain.User;
import com.muving.muving_backend_hexagonal.infrastructure.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class StubeUserRepository implements UserRepository {

    User usuarioConsultado;

    User userSaved;

    List<User> users = new ArrayList<>();

    @Override
    public List<User> getUserByEmail(User userABuscar) {
        this.usuarioConsultado = userABuscar;
        users.add(userABuscar);
        return users;
    }

    public void saverUser(User user) {
        this.userSaved = user;
    }

    public boolean getUserByEmailHasBeenCalledWith(User user) {
        if (usuarioConsultado.equals(user)) {
            return true;
        }
        return false;
    }

    public boolean saverUserHasBeenCalledWith(User user) {
        if (userSaved.equals(user)) {
            return true;
        }
        return false;
    }

}
