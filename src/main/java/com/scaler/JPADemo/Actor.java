package com.scaler.JPADemo;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Demo-Actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private List<Movie> movies;
}