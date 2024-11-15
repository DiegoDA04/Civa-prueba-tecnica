package pe.edu.p20242118.civacore.domain.exceptions;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BusNotFoundException extends RuntimeException {
  
  public BusNotFoundException(UUID id) {
    super("No se ha encontrado un bus con el siguiente ID: " + id);
  }
  
}
