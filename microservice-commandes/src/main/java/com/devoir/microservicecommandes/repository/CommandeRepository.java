package com.devoir.microservicecommandes.repository;

import com.devoir.microservicecommandes.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    List<Commande> findByDateCommandeAfter(LocalDate date);
}
