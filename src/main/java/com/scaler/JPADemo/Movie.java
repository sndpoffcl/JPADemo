package com.scaler.JPADemo;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Demo-Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors;
}