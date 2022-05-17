package ru.salyakhov.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.salyakhov.cinema.repository.MovieDAO;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    private final MovieDAO movieDAO;

    @Autowired
    public MovieServiceImpl(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @Override
    public List getAllMovies() {

        return movieDAO.findAll();
    }
}
