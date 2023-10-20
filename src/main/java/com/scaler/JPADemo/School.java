package com.scaler.JPADemo;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Demo-School")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    @JoinColumn(name = "school_id") // convention -> className_idField : school_id
    private List<Classroom> classrooms;
}