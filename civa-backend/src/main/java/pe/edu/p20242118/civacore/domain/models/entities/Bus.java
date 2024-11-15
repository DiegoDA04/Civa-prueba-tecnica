package pe.edu.p20242118.civacore.domain.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pe.edu.p20242118.civacore.domain.models.enums.EstadoBus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "buses")
public class Bus {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  private String numero;
  
  @Column(nullable = false)
  private String placa;
  
  @CreatedDate
  private LocalDateTime fechaCreacion;
  
  private String caracteristicas;
  
  @ManyToOne
  @JoinColumn(name = "marca_bus_id", nullable = false)
  private MarcaBus marca;

  @Enumerated(EnumType.STRING)
  private EstadoBus estado;
  
}
