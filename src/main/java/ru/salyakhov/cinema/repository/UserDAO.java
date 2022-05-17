package ru.salyakhov.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.salyakhov.cinema.entities.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
