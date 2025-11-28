package com.devoir.microserviceproduit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer quantite;
    private Double montant;

    public Produit() {}

    public Produit(String description, Integer quantite, Double montant) {
        this.description = description;
        this.quantite = quantite;
        this.montant = montant;
    }

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getQuantite() { return quantite; }
    public void setQuantite(Integer quantite) { this.quantite = quantite; }
    public Double getMontant() { return montant; }
    public void setMontant(Double montant) { this.montant = montant; }
}
