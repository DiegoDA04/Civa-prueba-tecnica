INSERT INTO marcas_bus (id, nombre) VALUES
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be001'), 'Volvo'),
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be002'), 'Scania'),
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be003'), 'Mercedes-Benz'),
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be004'), 'Hyundai'),
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be005'), 'MAN'),
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be006'), 'Iveco'),
(UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be007'), 'Fiat');


INSERT INTO buses (id, numero, placa, fecha_creacion, caracteristicas, marca_bus_id, estado) VALUES
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308001'), '001', 'ABC-123', NOW(), 'Bus de lujo con aire acondicionado', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be001'), 'ACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308002'), '002', 'DEF-456', NOW(), 'Bus semi-cama con wifi', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be002'), 'INACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308003'), '003', 'GHI-789', NOW(), 'Bus económico con capacidad para 50 pasajeros', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be003'), 'ACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308004'), '004', 'JKL-012', NOW(), 'Bus de dos pisos con asientos reclinables', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be004'), 'INACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308005'), '005', 'MNO-345', NOW(), 'Bus turístico con guía y servicio de catering', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be005'), 'ACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308006'), '006', 'PQR-678', NOW(), 'Bus cama con sistema de entretenimiento', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be001'), 'INACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308007'), '007', 'STU-901', NOW(), 'Bus interprovincial con baño y aire acondicionado', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be002'), 'ACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308008'), '008', 'VWX-234', NOW(), 'Bus urbano con espacio para sillas de ruedas', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be003'), 'INACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308009'), '009', 'YZA-567', NOW(), 'Bus de larga distancia con asientos reclinables y baño', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be004'), 'ACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308010'), '010', 'BCD-890', NOW(), 'Bus express con servicio de snacks', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be005'), 'INACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308011'), '011', 'EFG-234', NOW(), 'Bus escolar con cinturones de seguridad y sistema de frenado avanzado', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be006'), 'ACTIVO'),
(UUID_TO_BIN('f14fd151-d452-45a4-8cf3-7c9111308012'), '012', 'HIJ-567', NOW(), 'Bus turístico con amplios ventanales y aire acondicionado', UUID_TO_BIN('fd43eb04-83db-4cf7-a125-59c0c76be007'), 'INACTIVO');
