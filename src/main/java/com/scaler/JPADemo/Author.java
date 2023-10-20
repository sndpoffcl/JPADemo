package com.scaler.JPADemo;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Demo-Author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
