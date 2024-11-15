package pe.edu.p20242118.civacore.domain.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "marcas_bus")
public class MarcaBus {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  private String nombre;
}
