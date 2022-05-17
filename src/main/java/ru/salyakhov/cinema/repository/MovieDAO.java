package ru.salyakhov.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.salyakhov.cinema.entities.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Long> {
}
