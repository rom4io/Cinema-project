package ru.salyakhov.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.salyakhov.cinema.entities.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
}
