package pe.edu.p20242118.civacore.interfaces.api.rest.transform;

import org.springframework.data.domain.Page;
import pe.edu.p20242118.civacore.domain.models.entities.Bus;
import pe.edu.p20242118.civacore.interfaces.api.rest.dto.BusDto;

public class BusDtoFromEntityAssembler {
  
  public static BusDto assemble(Bus bus) {
    return BusDto.builder()
        .id(bus.getId())
        .numero(bus.getNumero())
        .placa(bus.getPlaca())
        .caracteristicas(bus.getCaracteristicas())
        .fechaCreacion(bus.getFechaCreacion())
        .marcaId(bus.getMarca().getId())
        .nombreMarca(bus.getMarca().getNombre())
        .estado(bus.getEstado())
        .build();
  }
  
  public static Page<BusDto> assemble(Page<Bus> buses) {
    return buses.map(BusDtoFromEntityAssembler::assemble);
  }
}
