package pe.edu.p20242118.civacore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CivaCoreApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(CivaCoreApplication.class, args);
  }
  
}
