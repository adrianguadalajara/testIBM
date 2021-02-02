# testIBM
Ejercicio obtener fichero proveedores

## Table of Contents
1. [Información General](#general-info)
2. [Tecnologías](#Tecnologías)
3. [Instalación](#Instalación)
4. [Collaboration](#collaboration)
5. [FAQs](#faqs)

## Información General
***
El cliente nos ha solicitado recibir un fichero plano con la información de sus proveedores, el reporte no debe de tener ningún formato especifico y únicamente hace falta que se genere de forma plana con sus respectivas cabeceras.

## Tecnologías
***
Listado de tecnologías utilizadas en el proyecto/ejercicio:
* [MYSQL Server](https://https://dev.mysql.com/doc/relnotes/mysql/8.0/en/news-8-0-23.html): Version 8.0.23 
* [MYSQL Workbench](https://dev.mysql.com/doc/workbench/en/): Version 8.0.23
* [Connector/J](https://dev.mysql.com/doc/connector-j/8.0/en/): Version 8.0.23
* [Eclipse](https://www.eclipse.org/downloads/packages/release/oxygen/3a): Version Oxygen.3a Release (4.7.3a)

## Instalación
***
**Descargar MYSQL installer 8.0.23 e instalar:**

* MYSQL Server
* MYSQL Workbench
* Connector/J

**Configurar MYSQL server 8.0.23:**
Parámetros por defecto.
```
- Connectivity : TCP/IP
- Port: 3306
- User: root
- Host: 127.0.0.1
- Añadir una password, en mi caso: 1234
```
**Lanzar script en MYSQL Workbench 8.0.23:**
```
- Crear esquema
- Importar script
- Ejecutar script
```

**Ejecutar script en MYSQL Workbench 8.0.23:**
```
- Crear esquema
- Importar script.sql (Se encuentra en la carpeta ./BBDD del proyecto)
- Ejecutar script
```

**Añadir Connector/J al proyecto en eclipse:**
```
- Abrir eclipse
- Importar proyecto java
- Añadir el conector
  -> Click derecho sobre el proyecto 
  -> propriedades 
  -> Java Build Path 
  -> Libraries 
  -> ADD JARs.. 
  -> Buscar el conector mysql-connector-java-8.0.23.jar(en la carpeta ./jar del proyecto)
  -> Apply and Close
```


## Collaboration
***
Give instructions on how to collaborate with your project.
> Maybe you want to write a quote in this part. 
> It should go over several rows?
> This is how you do it.
## FAQs
***
A list of frequently asked questions
1. **This is a question in bold**
Answer of the first question with _italic words_. 
2. __Second question in bold__ 
To answer this question we use an unordered list:
* First point
* Second Point
* Third point
3. **Third question in bold**
Answer of the third question with *italic words*.
4. **Fourth question in bold**
| Headline 1 in the tablehead | Headline 2 in the tablehead | Headline 3 in the tablehead |
|:--------------|:-------------:|--------------:|
| text-align left | text-align center | text-align right |
