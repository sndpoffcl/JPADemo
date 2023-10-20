package com.scaler.JPADemo;

import jakarta.persistence.*;

@Entity(name = "Demo-Classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}