package ru.salyakhov.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.salyakhov.cinema.entities.User;
import ru.salyakhov.cinema.repository.UserDAO;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserDAO userDAO;

    public void createUser(User user){
        userDAO.save(user);
    }
}
