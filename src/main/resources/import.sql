INSERT INTO paises (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, pais) VALUES (1, '2024-09-08 19:46:24', '2024-09-12 19:46:24', 'admin', 'admin', 'México');
INSERT INTO paises (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, pais) VALUES (1, '2023-05-08 19:46:24', NULL, 'admin', NULL, 'España');
INSERT INTO paises (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, pais) VALUES (1, '2024-05-22 19:46:24', '2024-06-20 19:46:24', 'admin', 'admin', 'Argentina');
INSERT INTO paises (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, pais) VALUES (1, '2025-03-19 19:46:24', '2025-04-09 19:46:24', 'admin', 'admin', 'Estados Unidos');
INSERT INTO paises (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, pais) VALUES (1, '2023-10-23 19:46:24', '2023-11-30 19:46:24', 'admin', 'admin', 'Francia');



INSERT INTO idiomas (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, idioma) VALUES (1, '2023-08-28 19:46:24', '2023-10-08 19:46:24', 'admin', 'admin', 'Español');
INSERT INTO idiomas (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, idioma) VALUES (1, '2022-10-06 19:46:24', '2023-01-04 19:46:24', 'admin', 'admin', 'Inglés');
INSERT INTO idiomas (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, idioma) VALUES (1, '2023-11-27 19:46:24', NULL, 'admin', NULL, 'Francés');
INSERT INTO idiomas (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, idioma) VALUES (1, '2023-09-13 19:46:24', '2023-11-17 19:46:24', 'admin', 'admin', 'Alemán');
INSERT INTO idiomas (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, idioma) VALUES (1, '2024-01-23 19:46:24', NULL, 'admin', NULL, 'Italiano');

 
INSERT INTO tipo_operaciones (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, tipo_operacion) VALUES (1, '2024-06-10 19:46:24', '2024-09-09 19:46:24', 'admin', 'admin', 'Compra');
INSERT INTO tipo_operaciones (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, tipo_operacion) VALUES (1, '2022-10-29 19:46:24', NULL, 'admin', NULL, 'Préstamo');
INSERT INTO tipo_operaciones (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, tipo_operacion) VALUES (1, '2024-04-15 19:46:24', '2024-04-18 19:46:24', 'admin', 'admin', 'Devolución');


INSERT INTO clientes (autorizacion_prestamo, fecha_nac, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, apellido_materno, apellido_paterno, direccion, email, nombre, telefono) VALUES (1, '1985-06-01', 1, '2023-09-22 19:46:24', '2023-11-08 19:46:24', 'admin', 'admin', 'ApellidoM1', 'ApellidoP1', 'Calle 1 #123', 'cliente1@mail.com', 'Cliente1', '443-555-001');
INSERT INTO clientes (autorizacion_prestamo, fecha_nac, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, apellido_materno, apellido_paterno, direccion, email, nombre, telefono) VALUES (1, '1995-01-30', 1, '2023-07-19 19:46:24', '2023-08-26 19:46:24', 'admin', 'admin', 'ApellidoM2', 'ApellidoP2', 'Calle 2 #123', 'cliente2@mail.com', 'Cliente2', '443-555-002');
INSERT INTO clientes (autorizacion_prestamo, fecha_nac, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, apellido_materno, apellido_paterno, direccion, email, nombre, telefono) VALUES (0, '1973-07-24', 1, '2024-03-03 19:46:24', NULL, 'admin', NULL, 'ApellidoM3', 'ApellidoP3', 'Calle 3 #123', 'cliente3@mail.com', 'Cliente3', '443-555-003');
INSERT INTO clientes (autorizacion_prestamo, fecha_nac, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, apellido_materno, apellido_paterno, direccion, email, nombre, telefono) VALUES (1, '1973-10-20', 1, '2023-10-05 19:46:24', '2023-10-13 19:46:24', 'admin', 'admin', 'ApellidoM4', 'ApellidoP4', 'Calle 4 #123', 'cliente4@mail.com', 'Cliente4', '443-555-004');
INSERT INTO clientes (autorizacion_prestamo, fecha_nac, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, apellido_materno, apellido_paterno, direccion, email, nombre, telefono) VALUES (0, '1977-07-06', 1, '2023-08-19 19:46:24', NULL, 'admin', NULL, 'ApellidoM5', 'ApellidoP5', 'Calle 5 #123', 'cliente5@mail.com', 'Cliente5', '443-555-005');



INSERT INTO autores (fecha_nac, id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, email, nombre, website) VALUES ('1993-03-27', 3, 1, '2024-10-19 19:46:24', NULL, 'admin', NULL, 'autor1@mail.com', 'Autor1', 'https://autor1.com');
INSERT INTO autores (fecha_nac, id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, email, nombre, website) VALUES ('1973-10-10', 3, 1, '2024-07-19 19:46:24', '2024-09-27 19:46:24', 'admin', 'admin', 'autor2@mail.com', 'Autor2', 'https://autor2.com');
INSERT INTO autores (fecha_nac, id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, email, nombre, website) VALUES ('1986-04-11', 5, 1, '2023-03-12 19:46:24', '2023-05-07 19:46:24', 'admin', 'admin', 'autor3@mail.com', 'Autor3', 'https://autor3.com');
INSERT INTO autores (fecha_nac, id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, email, nombre, website) VALUES ('1995-03-03', 3, 1, '2025-01-26 19:46:24', '2025-03-26 19:46:24', 'admin', 'admin', 'autor4@mail.com', 'Autor4', 'https://autor4.com');
INSERT INTO autores (fecha_nac, id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, email, nombre, website) VALUES ('1981-07-06', 1, 1, '2025-05-07 19:46:24', '2025-06-17 19:46:24', 'admin', 'admin', 'autor5@mail.com', 'Autor5', 'https://autor5.com');


INSERT INTO editoriales (id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, direccion_fisica, email, nombre, telefono, website) VALUES (1, 1, '2024-07-12 19:46:24', '2024-10-19 19:46:24', 'admin', 'admin', 'Av Editorial 1', 'editorial1@mail.com', 'Editorial1', '443-111-001', 'https://editorial1.com');
INSERT INTO editoriales (id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, direccion_fisica, email, nombre, telefono, website) VALUES (2, 1, '2025-01-04 19:46:24', NULL, 'admin', NULL, 'Av Editorial 2', 'editorial2@mail.com', 'Editorial2', '443-111-002', 'https://editorial2.com');
INSERT INTO editoriales (id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, direccion_fisica, email, nombre, telefono, website) VALUES (5, 1, '2024-11-24 19:46:24', NULL, 'admin', NULL, 'Av Editorial 3', 'editorial3@mail.com', 'Editorial3', '443-111-003', 'https://editorial3.com');
INSERT INTO editoriales (id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, direccion_fisica, email, nombre, telefono, website) VALUES (5, 1, '2024-03-17 19:46:24', '2024-04-10 19:46:24', 'admin', 'admin', 'Av Editorial 4', 'editorial4@mail.com', 'Editorial4', '443-111-004', 'https://editorial4.com');
INSERT INTO editoriales (id_pais, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, direccion_fisica, email, nombre, telefono, website) VALUES (1, 1, '2023-08-20 19:46:24', '2023-11-19 19:46:24', 'admin', 'admin', 'Av Editorial 5', 'editorial5@mail.com', 'Editorial5', '443-111-005', 'https://editorial5.com');


INSERT INTO libros (año_publicacion, id_editorial, id_idioma, paginas, status, stock, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, descripcion, isbn, titulo) VALUES (2000, 1, 5, 365, 1, 7, '2023-05-16 19:46:24', NULL, 'admin', NULL, 'Descripción del libro 1', 'ISBN1-2024', 'Título Libro 1');
INSERT INTO libros (año_publicacion, id_editorial, id_idioma, paginas, status, stock, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, descripcion, isbn, titulo) VALUES (2008, 2, 2, 170, 1, 15, '2024-01-17 19:46:24', NULL, 'admin', NULL, 'Descripción del libro 2', 'ISBN2-2024', 'Título Libro 2');
INSERT INTO libros (año_publicacion, id_editorial, id_idioma, paginas, status, stock, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, descripcion, isbn, titulo) VALUES (2013, 3, 2, 156, 1, 13, '2024-12-11 19:46:24', '2024-12-23 19:46:24', 'admin', 'admin', 'Descripción del libro 3', 'ISBN3-2024', 'Título Libro 3');
INSERT INTO libros (año_publicacion, id_editorial, id_idioma, paginas, status, stock, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, descripcion, isbn, titulo) VALUES (2010, 4, 4, 877, 1, 6, '2023-06-26 19:46:24', '2023-06-30 19:46:24', 'admin', 'admin', 'Descripción del libro 4', 'ISBN4-2024', 'Título Libro 4');
INSERT INTO libros (año_publicacion, id_editorial, id_idioma, paginas, status, stock, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, descripcion, isbn, titulo) VALUES (1993, 5, 4, 634, 1, 6, '2024-01-17 19:46:24', '2024-03-17 19:46:24', 'admin', 'admin', 'Descripción del libro 5', 'ISBN5-2024', 'Título Libro 5');


INSERT INTO prestamos (devuelto, fecha_inicio, fecha_fin, id_cliente, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (0, '2025-04-23', '2025-05-04', 2, 3, 1, '2025-01-03 19:46:24', '2025-01-09 19:46:24', 'admin', 'admin');
INSERT INTO prestamos (devuelto, fecha_inicio, fecha_fin, id_cliente, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (0, '2025-04-07', '2025-04-25', 3, 5, 1, '2023-09-01 19:46:24', '2023-09-17 19:46:24', 'admin', 'admin');
INSERT INTO prestamos (devuelto, fecha_inicio, fecha_fin, id_cliente, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (0, '2025-05-27', '2025-06-12', 2, 5, 1, '2022-11-29 19:46:24', '2023-02-27 19:46:24', 'admin', 'admin');
INSERT INTO prestamos (devuelto, fecha_inicio, fecha_fin, id_cliente, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (1, '2025-03-19', '2025-04-01', 5, 2, 1, '2024-09-25 19:46:24', '2024-10-17 19:46:24', 'admin', 'admin');
INSERT INTO prestamos (devuelto, fecha_inicio, fecha_fin, id_cliente, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (1, '2025-04-23', '2025-05-21', 4, 4, 1, '2023-12-11 19:46:24', '2024-02-06 19:46:24', 'admin', 'admin');


INSERT INTO operaciones (cantidad, id_cliente, id_libro, id_tipo_operacion, monto, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (3, 2, 4, 3, 408.20, 1, '2023-06-04 19:46:24', NULL, 'admin', NULL);
INSERT INTO operaciones (cantidad, id_cliente, id_libro, id_tipo_operacion, monto, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (2, 4, 1, 2, 440.54, 1, '2024-11-17 19:46:24', '2024-12-09 19:46:24', 'admin', 'admin');
INSERT INTO operaciones (cantidad, id_cliente, id_libro, id_tipo_operacion, monto, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (3, 4, 5, 1, 443.83, 1, '2024-06-03 19:46:24', '2024-09-07 19:46:24', 'admin', 'admin');
INSERT INTO operaciones (cantidad, id_cliente, id_libro, id_tipo_operacion, monto, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (2, 3, 1, 1, 353.68, 1, '2023-01-18 19:46:24', NULL, 'admin', NULL);
INSERT INTO operaciones (cantidad, id_cliente, id_libro, id_tipo_operacion, monto, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (1, 5, 2, 3, 499.62, 1, '2024-07-09 19:46:24', NULL, 'admin', NULL);


INSERT INTO libro_autores (id_autor, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (1, 1, 1, '2023-05-21 19:46:24', NULL, 'admin', NULL);
INSERT INTO libro_autores (id_autor, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (2, 2, 1, '2024-03-06 19:46:24', '2024-04-30 19:46:24', 'admin', 'admin');
INSERT INTO libro_autores (id_autor, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (3, 3, 1, '2025-03-25 19:46:24', '2025-06-30 19:46:24', 'admin', 'admin');
INSERT INTO libro_autores (id_autor, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (4, 4, 1, '2025-02-23 19:46:24', '2025-05-18 19:46:24', 'admin', 'admin');
INSERT INTO libro_autores (id_autor, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (5, 5, 1, '2024-08-23 19:46:24', '2024-09-25 19:46:24', 'admin', 'admin');


INSERT INTO generos (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, genero) VALUES (1, '2024-11-12 19:46:24', '2025-01-24 19:46:24', 'admin', 'admin', 'Novela');
INSERT INTO generos (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, genero) VALUES (1, '2024-01-18 19:46:24', '2024-04-18 19:46:24', 'admin', 'admin', 'Ciencia Ficción');
INSERT INTO generos (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, genero) VALUES (1, '2024-12-12 19:46:24', '2025-02-17 19:46:24', 'admin', 'admin', 'Fantasía');
INSERT INTO generos (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, genero) VALUES (1, '2024-06-13 19:46:24', NULL, 'admin', NULL, 'Historia');
INSERT INTO generos (status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, genero) VALUES (1, '2023-06-27 19:46:24', NULL, 'admin', NULL, 'Romance');




INSERT INTO libro_generos (id_genero, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (1, 1, 1, '2024-07-14 19:46:24', '2024-08-27 19:46:24', 'admin', 'admin');
INSERT INTO libro_generos (id_genero, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (2, 2, 1, '2024-05-02 19:46:24', NULL, 'admin', NULL);
INSERT INTO libro_generos (id_genero, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (3, 3, 1, '2024-09-20 19:46:24', '2024-10-04 19:46:24', 'admin', 'admin');
INSERT INTO libro_generos (id_genero, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (4, 4, 1, '2023-09-15 19:46:24', '2023-11-24 19:46:24', 'admin', 'admin');
INSERT INTO libro_generos (id_genero, id_libro, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES (5, 5, 1, '2025-05-30 19:46:24', '2025-06-16 19:46:24', 'admin', 'admin');



INSERT INTO tipo_suscripcion (costo, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, tipo_suscripcion) VALUES (99.99, 1, '2024-01-01 12:00:00', NULL, 'admin', NULL, 'Básica');
INSERT INTO tipo_suscripcion (costo, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, tipo_suscripcion) VALUES (199.99, 1, '2024-01-01 12:00:00', NULL, 'admin', NULL, 'Estándar');
INSERT INTO tipo_suscripcion (costo, status, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion, tipo_suscripcion) VALUES (299.99, 1, '2024-01-01 12:00:00', NULL, 'admin', NULL, 'Premium');


INSERT INTO suscripciones (fecha_inicio, fecha_fin, id_cliente, id_tipo_suscripcion, status, suscripcion_valida, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES ('2025-04-17', '2026-04-17', 1, 2, 1, 1, '2024-08-21 19:46:24', '2024-10-31 19:46:24', 'admin', 'admin');
INSERT INTO suscripciones (fecha_inicio, fecha_fin, id_cliente, id_tipo_suscripcion, status, suscripcion_valida, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES ('2025-02-23', '2026-02-23', 2, 2, 1, 1, '2023-03-07 19:46:24', '2023-03-25 19:46:24', 'admin', 'admin');
INSERT INTO suscripciones (fecha_inicio, fecha_fin, id_cliente, id_tipo_suscripcion, status, suscripcion_valida, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES ('2025-05-08', '2026-05-08', 1, 1, 1, 1, '2025-01-19 19:46:24', '2025-03-16 19:46:24', 'admin', 'admin');
INSERT INTO suscripciones (fecha_inicio, fecha_fin, id_cliente, id_tipo_suscripcion, status, suscripcion_valida, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES ('2025-04-15', '2026-04-15', 5, 2, 1, 1, '2025-02-23 19:46:24', '2025-04-30 19:46:24', 'admin', 'admin');
INSERT INTO suscripciones (fecha_inicio, fecha_fin, id_cliente, id_tipo_suscripcion, status, suscripcion_valida, fecha_creacion, fecha_modificacion, usuario_creacion, usuario_modificacion) VALUES ('2024-12-18', '2025-12-18', 5, 1, 1, 1, '2025-01-26 19:46:24', NULL, 'admin', NULL);





