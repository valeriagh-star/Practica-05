# Practica-05

## ✅ Objetivo

La práctica buscó que los estudiantes crearan un sistema que no solo gestionara objetos en memoria, sino que también pudiera guardar y cargar esos objetos en archivos de texto de manera robusta y escalable. ESta práctica se centra en la Persistencia de Datos (lectura/escritura de archivos) y el uso de Genéricos/Polimorfismo en el manejo de colecciones, extendiendo la estructura de clases de la Práctica 04.

## ✍️ Descripción

* **Persistencia de Datos (Archivos I/O):** Evaluar la correcta implementación y uso de la lectura y escritura de archivos de texto para guardar y recuperar información de usuarios (Administradores.txt y Empleados.txt).

* **Polimorfismo y Genéricos:** Demostrar la capacidad de manejar colecciones de diferentes tipos de usuarios (Administrador y Empleado) de manera flexible, implementando una de las versiones avanzadas para la clase ManejadorLista (Sobrecarga, Object, o Genéricos).

* **Modularidad (Clase ManejadorArchivos):** Diseñar una clase utilitaria (ManejadorArchivos) que simplifique y centralice las operaciones de entrada/salida con archivos, asegurando un manejo adecuado de excepciones y recursos.

* **Retomar Conceptos Previos:** Retomar y aprovechar los conceptos desarrollados en la Práctica 04 (Clases Abstractas, Herencia, Interfaces) para construir sobre la implementación existente.

## ⚙️ Tecnologías utilizadas

* **Lenguaje:** JavaSE-24.
* **IDE:** Eclipse IDE.

## 📁 Estructura del Proyecto

El proyecto está organizado en la siguiente estructura de directorios:

**Proyecto/**

**├── src/**

**│   ├── modulos/**

**│   │   ├── Usuario.java**

**│   │   ├── Administrador.java**

**│   │   └── Empleado.java**

**│   ├── Interfaces/**

**│   │   └── ArregloInterface.java**

**│   ├── Main.java**

**│   ├── ManejadorLista.java**

**│   └── utilidades/**

**│       └── ManejadorArchivos.java**

**├── BD/

**│   ├── Empleados.txt  <- Archivo de datos de Empleados**

**│   └── Administradores.txt <- Archivo de datos de Administradores**

**└── README.txt**

## 📸 Evidencias (Capturas de pantalla)

A continuación se muestran capturas de pantalla sobre la ejecución en consola, donde se verifica el funcionamiento de las validaciones en los menús de Administrador y Empleado, el manejo de excepciones al intentar crear un usuario con datos inválidos, y el uso de las funcionalidades de ManejadorLista.

![Captura 1 de la Ejecución de Main](practica04(1).png)
![Captura 2 de la Ejecución de Main](practica04(2).png)

El código fuente de los directorios está organizado por paquetes y se puede revisar directamente en la carpeta [src/](https://github.com/valeriagh-star/Practica-04/tree/main/src).

| Carpetas | Ruta del Archivo .java |
| :--- | :--- |
| **Clase Usuario** | [src/modulos/Usuario.java](https://github.com/valeriagh-star/Practica-04/blob/main/src/modulos/Usuario.java) | 
| **Clase Administrador** | [src/modulos/Administrador.java](https://github.com/valeriagh-star/Practica-04/blob/main/src/modulos/Administrador.java) |
| **Clase Empleado** | [src/modulos/Empleado.java](https://github.com/valeriagh-star/Practica-04/blob/main/src/modulos/Empleado.java) |
| **Interfaz ArregloInterface** | [src/Interfaces/ArregloInterface.java](https://github.com/valeriagh-star/Practica-04/blob/main/src/Interfaces/arregloInterface.java) | 
| **Clase Main** | [src/Main/Main.java](https://github.com/valeriagh-star/Practica-04/blob/main/src/Main.java) |
| **Clase ManejadorLista** | [src/ManejadorLista/ManejadorLista.java](https://github.com/valeriagh-star/Practica-04/blob/main/src/ManejadorLista.java) |
| **README** | [Practica04/main/README.txt](https://github.com/valeriagh-star/Practica-04/blob/main/README.txt) | 

## ▶️ Instrucciones de ejecución

1.  **Clonar/Importar el repositorio el Repositorio:** Importa la carpeta Proyecto como un proyecto Java existente en Eclipse o IntelliJ.
2.  **Abrir Main:** Localiza el archivo src/Main.java.
3.  **Ejecutar:** Haz clic derecho sobre src/Main.java y selecciona "Run As" -> "Java Application".
4.  **Interacción:** El programa solicitará el Nombre, Correo y Rol (Empleado o Administrador) para crear un nuevo usuario. El programa manejará las validaciones automáticamente (Manejo de Excepciones) para el nombre de usuario (mínimo 5 caracteres) y el formato del correo electrónico (@ y .com). Se mostrará el menú correspondiente al Rol ingresado (Administrador o Empleado).
