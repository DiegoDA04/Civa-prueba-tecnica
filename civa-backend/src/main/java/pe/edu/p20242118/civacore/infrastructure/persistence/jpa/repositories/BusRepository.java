package pe.edu.p20242118.civacore.infrastructure.persistence.jpa.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.p20242118.civacore.domain.models.entities.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, UUID> {
}
