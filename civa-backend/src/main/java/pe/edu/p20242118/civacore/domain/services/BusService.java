package pe.edu.p20242118.civacore.domain.services;

import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.edu.p20242118.civacore.domain.models.entities.Bus;

public interface BusService {
  
  Bus getById(UUID id);
  
  Page<Bus> getAll(Pageable pageable);
}
