package pe.edu.p20242118.civacore.interfaces.api.rest.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import pe.edu.p20242118.civacore.domain.models.enums.EstadoBus;

@Getter
@Builder
public class BusDto {
  
  private UUID id;
  
  private String numero;
  
  private String placa;
  
  private LocalDateTime fechaCreacion;
  
  private String caracteristicas;
  
  private UUID marcaId;
  
  private String nombreMarca;
  
  private EstadoBus estado;
  
}
