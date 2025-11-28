package com.devoir.microservicecommandes.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer quantite;
    private LocalDate dateCommande;
    private Double montant;
    private Long idProduit; // version 2

    public Commande() {}

    public Commande(String description, Integer quantite, LocalDate dateCommande, Double montant, Long idProduit) {
        this.description = description;
        this.quantite = quantite;
        this.dateCommande = dateCommande;
        this.montant = montant;
        this.idProduit = idProduit;
    }

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getQuantite() { return quantite; }
    public void setQuantite(Integer quantite) { this.quantite = quantite; }
    public LocalDate getDateCommande() { return dateCommande; }
    public void setDateCommande(LocalDate dateCommande) { this.dateCommande = dateCommande; }
    public Double getMontant() { return montant; }
    public void setMontant(Double montant) { this.montant = montant; }
    public Long getIdProduit() { return idProduit; }
    public void setIdProduit(Long idProduit) { this.idProduit = idProduit; }
}
