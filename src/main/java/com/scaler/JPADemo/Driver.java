package com.scaler.JPADemo;

import jakarta.persistence.*;

@Entity(name = "Demo-Driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private License license;
}

/*
        Driver - License -> 1:1
        Driver <-> License
 */