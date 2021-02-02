CREATE SCHEMA `TEST` ;

CREATE TABLE TEST.PROVEEDORES (
id_proveedor INT NOT NULL PRIMARY KEY,
nombre VARCHAR(200),
fecha_alta DATE,
id_cliente INT 
);

INSERT INTO TEST.PROVEEDORES (id_proveedor,nombre,fecha_alta,id_cliente) 
	VALUES (1,'Coca-cola',STR_TO_DATE('01/01/2021', '%d/%m/%Y'), 5),
		   (2,'Pepsi',STR_TO_DATE('01/01/2020', '%d/%m/%Y'), 5),
		   (3,'Redbull',STR_TO_DATE('31/05/2020', '%d/%m/%Y'), 6);