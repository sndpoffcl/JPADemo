package com.scaler.JPADemo;

import jakarta.persistence.*;

@Entity(name = "Demo-UserProfile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bio;
}