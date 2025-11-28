package com.devoir.microservicecommandes.health;

import com.devoir.microservicecommandes.service.CommandeService;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CommandeHealthIndicator implements HealthIndicator {

    private final CommandeService service;
    public CommandeHealthIndicator(CommandeService service) { this.service = service; }

    @Override
    public Health health() {
        long count = service.count();
        if (count > 0) {
            return Health.up().withDetail("commandes", count).build();
        } else {
            return Health.down().withDetail("commandes", count).withDetail("reason", "no commandes found").build();
        }
    }
}
