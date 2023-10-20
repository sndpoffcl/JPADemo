package com.scaler.JPADemo;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Demo-Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<Student> students;
}
