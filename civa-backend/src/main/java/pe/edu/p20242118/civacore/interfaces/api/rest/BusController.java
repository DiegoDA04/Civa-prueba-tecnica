package pe.edu.p20242118.civacore.interfaces.api.rest;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.p20242118.civacore.domain.models.entities.Bus;
import pe.edu.p20242118.civacore.domain.services.BusService;
import pe.edu.p20242118.civacore.interfaces.api.rest.dto.BusDto;
import pe.edu.p20242118.civacore.interfaces.api.rest.transform.BusDtoFromEntityAssembler;

@RestController
@RequestMapping("/api/v1/buses")
@RequiredArgsConstructor
@Slf4j
public class BusController {
  
  private final BusService busService;

  @GetMapping
  public ResponseEntity<Page<BusDto>> getAllBuses(Pageable pageable) {
    log.info("Obteniendo todos los buses con parametros: {}", pageable);
    Page<Bus> busesPage = busService.getAll(pageable);
    return new ResponseEntity<>(BusDtoFromEntityAssembler.assemble(busesPage), HttpStatus.OK);
  }
  
  @GetMapping("{id}")
  public ResponseEntity<BusDto> getBuseById(@PathVariable UUID id) {
    log.info("Obteniendo un bus con ID: {}", id);
    Bus bus = busService.getById(id);
    return new ResponseEntity<>(BusDtoFromEntityAssembler.assemble(bus), HttpStatus.OK);
  }
  
}
