package pe.edu.p20242118.civacore.application.services;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.edu.p20242118.civacore.domain.exceptions.BusNotFoundException;
import pe.edu.p20242118.civacore.domain.models.entities.Bus;
import pe.edu.p20242118.civacore.domain.services.BusService;
import pe.edu.p20242118.civacore.infrastructure.persistence.jpa.repositories.BusRepository;

@Service
@RequiredArgsConstructor
public class BusServiceImpl implements BusService {
  
  private final BusRepository busRepository;
  
  @Override
  public Bus getById(UUID id) {
    return busRepository.findById(id)
        .orElseThrow(() -> new BusNotFoundException(id));
  }
  
  @Override
  public Page<Bus> getAll(Pageable pageable) {
    return busRepository.findAll(pageable);
  }
}
