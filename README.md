# testIBM
Ejercicio obtener fichero proveedores

## Table of Contents
1. [Información General](#general-info)
2. [Tecnologías](#Tecnologías)
3. [Instalación](#Instalación)
4. [Ejecución](#Ejecución)

## Información General 📋
***
El cliente nos ha solicitado recibir un fichero plano con la información de sus proveedores, el reporte no debe de tener ningún formato especifico y únicamente hace falta que se genere de forma plana con sus respectivas cabeceras.

## Tecnologías 🛠️
***
Listado de tecnologías utilizadas en el proyecto/ejercicio:
* [MYSQL Server](https://https://dev.mysql.com/doc/relnotes/mysql/8.0/en/news-8-0-23.html): Version 8.0.23 
* [MYSQL Workbench](https://dev.mysql.com/doc/workbench/en/): Version 8.0.23
* [Connector/J](https://dev.mysql.com/doc/connector-j/8.0/en/): Version 8.0.23
* [JAVA](https://www.eclipse.org/downloads/packages/release/oxygen/3a): Version Oxygen.3a Release (4.7.3a)
* [Eclipse](https://www.java.com/es/download/ie_manual.jsp): Version 8.0.271

## Instalación 🔧
***
**Descargar MYSQL installer 8.0.23 e instalar:**

* MYSQL Server
* MYSQL Workbench

**Configurar MYSQL server 8.0.23:**
```
- Parámetros por defecto.
  -> Connectivity : TCP/IP
  -> Port: 3306
  -> User: root
  -> Host: 127.0.0.1
  -> Añadir una password, en mi caso: 1234 (en caso de no ser el mismo, habría que cambiarlo en el archivo .\test\bbdd\MySQLAccess.java)
```

**Ejecutar script en MYSQL Workbench 8.0.23:**
```
- Crear esquema
- Importar script.sql (Se encuentra en la carpeta ./BBDD del proyecto)
- Ejecutar script
```
**Instalar JAVA 8.0.271():**
```
- Descargar e instalar JAVA.
- Añadirlo a las variables de entorno.
```


## Ejecución ⚙️

**Abrir una consola en la ruta donde tengamos la raiz del proyecto y ejecutar:**

* .\ejercicio> java -jar ejercicio.jar
  > Nos crea/Actualiza un fichero Lista_proveedores.txt con todos los proveedores
* .\ejercicio> java -jar ejercicio.jar "Parametro" Donde parametro sea un número
  >Nos crea/Actualiza un fichero Lista_proveedores.txt con los proveedores de ese idCliente


## Autor ✒️

> ADRIÁN GUADALAJARA ABEJAR
