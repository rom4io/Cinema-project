package ru.salyakhov.cinema.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String name;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;
    @Column(name = "description")
    private String description;

}
