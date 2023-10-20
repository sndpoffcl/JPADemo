package com.scaler.JPADemo;

import jakarta.persistence.*;

@Entity(name = "Demo-License")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String licenseNumber;
    @OneToOne(mappedBy = "license")
    private Driver driver;
}
