package com.example.kounetexpresse0_2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Clients {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nom;
    private String prenom;
    private String mail;
    private String confMail;
    private Double contact;
    private String paysDorigine;
}
