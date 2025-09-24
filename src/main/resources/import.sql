CREATE TABLE IF NOT EXISTS producto (
  id BIGSERIAL PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  descripcion TEXT,
  precio NUMERIC(12,2) NOT NULL,
  stock INTEGER NOT NULL,
  foto VARCHAR(512)
);

CREATE TABLE IF NOT EXISTS carro (
  id BIGSERIAL PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  descripcion TEXT,
  precio NUMERIC(12,2) NOT NULL,
  stock INTEGER NOT NULL,
  foto VARCHAR(512)
);

INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 1', 'Descripcion 1', 100, 2, 'foto1.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 2', 'Descripcion 2', 200, 4, 'foto2.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 3', 'Descripcion 3', 300, 6, 'foto3.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 4', 'Descripcion 4', 400, 8, 'foto4.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 5', 'Descripcion 5', 500, 10, 'foto5.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 6', 'Descripcion 6', 600, 12, 'foto6.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 7', 'Descripcion 7', 700, 14, 'foto7.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 8', 'Descripcion 8', 800, 16, 'foto8.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 9', 'Descripcion 9', 900, 18, 'foto9.jpg');
INSERT INTO producto (nombre, descripcion, precio, stock, foto) VALUES ('Producto 10', 'Descripcion 10', 1000, 20, 'foto10.jpg');

INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 1', 'Descripcion 1', 100, 2, 'foto1.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 2', 'Descripcion 2', 200, 4, 'foto2.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 3', 'Descripcion 3', 300, 6, 'foto3.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 4', 'Descripcion 4', 400, 8, 'foto4.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 5', 'Descripcion 5', 500, 10, 'foto5.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 6', 'Descripcion 6', 600, 12, 'foto6.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 7', 'Descripcion 7', 700, 14, 'foto7.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 8', 'Descripcion 8', 800, 16, 'foto8.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 9', 'Descripcion 9', 900, 18, 'foto9.jpg');
INSERT INTO carro (nombre, descripcion, precio, stock, foto) VALUES ('Carro 10', 'Descripcion 10', 1000, 20, 'foto10.jpg');

