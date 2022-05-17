package ru.salyakhov.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.salyakhov.cinema.entities.Movie;
import ru.salyakhov.cinema.entities.Role;
import ru.salyakhov.cinema.entities.User;
import ru.salyakhov.cinema.service.AdminService;
import ru.salyakhov.cinema.service.MovieService;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final AdminService adminService;
    private final MovieService movieService;

    @Autowired
    public UserController(MovieService movieService, AdminService adminService) {
        this.movieService = movieService;
        this.adminService = adminService;
    }


    @GetMapping("/movies")
    public String getAllMovies(Model model){
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "/index";
    }

    @PostMapping("/user_new")
    public String createUser(@ModelAttribute("user-new") User user){
        user.setRoleSet(Collections.singleton(new Role(1L)));
        adminService.createUser(user);
        return "register-page";
    }
}
