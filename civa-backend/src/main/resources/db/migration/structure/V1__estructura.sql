CREATE TABLE `marcas_bus` (
  `id` binary(16) NOT NULL,
  `nombre` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `buses` (
  `id` binary(16) NOT NULL,
  `caracteristicas` VARCHAR(255) NOT NULL,
  `estado` VARCHAR(10) NOT NULL,
  `fecha_creacion` datetime(6) NOT NULL,
  `numero` VARCHAR(255) NOT NULL,
  `placa` VARCHAR(255) NOT NULL,
  `marca_bus_id` binary(16) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKb2eolhmkehh481el686dkwp4r` (`marca_bus_id`),
  CONSTRAINT `FKb2eolhmkehh481el686dkwp4r` FOREIGN KEY (`marca_bus_id`) REFERENCES `marcas_bus` (`id`)
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


