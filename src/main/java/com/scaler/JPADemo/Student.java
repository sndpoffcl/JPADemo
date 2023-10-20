package com.scaler.JPADemo;

import jakarta.persistence.*;

@Entity(name = "Demo-Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
