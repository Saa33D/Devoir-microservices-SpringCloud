package com.devoir.microservicecommandes.service;

import com.devoir.microservicecommandes.model.Commande;
import com.devoir.microservicecommandes.repository.CommandeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {
    private final CommandeRepository repo;
    public CommandeService(CommandeRepository repo) { this.repo = repo; }

    public List<Commande> findAll() { return repo.findAll(); }
    public Optional<Commande> findById(Long id) { return repo.findById(id); }
    public Commande save(Commande c) { return repo.save(c); }
    public void delete(Long id) { repo.deleteById(id); }

    public List<Commande> findLastDays(int days) {
        LocalDate cutoff = LocalDate.now().minusDays(days);
        return repo.findByDateCommandeAfter(cutoff);
    }

    public long count() { return repo.count(); }
}
