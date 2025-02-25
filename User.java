package com.authblockchain.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String walletAddress;
    private String role;

    // Getters and Setters
}