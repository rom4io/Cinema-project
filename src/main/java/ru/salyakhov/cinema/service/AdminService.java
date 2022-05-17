package ru.salyakhov.cinema.service;

import org.springframework.stereotype.Service;
import ru.salyakhov.cinema.entities.User;

@Service
public interface AdminService {
    public void createUser(User user);
}
