<div align="justify">
# Practica-05

## ✅ Objetivo

La práctica buscó que los estudiantes crearan un sistema que no solo gestionara objetos en memoria, sino que también pudiera guardar y cargar esos objetos en archivos de texto de manera robusta y escalable. Esta práctica se centra en la Persistencia de Datos (lectura/escritura de archivos) y el uso de Genéricos/Polimorfismo en el manejo de colecciones, extendiendo la estructura de clases de la Práctica 04.

## ✍️ Descripción

Esta práctica extiende la estructura de la Práctica 04 introduciendo la gestión de archivos y la implementación de la clase ManejadorLista utilizando Genéricos (<T>) para lograr una manipulación segura y reutilizable de los arreglos de Administrador y Empleado.

* **Características clave:**
1. **Manejo de Archivos:** Se implementa la clase ManejadorArchivos en el paquete utilidades/ para centralizar la lectura y escritura de archivos, garantizando el manejo de excepciones y el cierre correcto de recursos.
2. **Genéricos:** Se eligió la Versión 3 (Genéricos) para modificar ArreglosInterface a ArreglosInterface<T> y ManejadorLista a ManejadorLista<T>.
3. **Flujo de Ejecución (Clase Main):**
  * Recibe un arreglo de 10 nombres como argumentos de la terminal.
  * Crea arreglos de 10 Empleados y 10 Administradores con estos nombres.
  * Invierte el orden de ambos arreglos usando ManejadorLista<T>.
  * Guarda los arreglos revertidos en BD/Empleados.txt y BD/Administradores.txt.
  * Añade un nuevo Empleado y un nuevo Administrador a sus respectivos archivos.
  * Lee y muestra por consola las listas finales (11 elementos) de ambos archivos.

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

**├── BD/**

**│   ├── Empleados.txt**

**│   └── Administradores.txt**

**└── README.txt**

## 📸 Evidencias (Capturas de pantalla)

A continuación se muestran capturas de pantalla sobre la ejecución en consola, donde se verifica el funcionamiento de las validaciones en los menús de Administrador y Empleado, el manejo de excepciones al intentar crear un usuario con datos inválidos, y el uso de las funcionalidades de ManejadorLista.

![Captura 1 de la Ejecución de MainTarea05](practica05(1).png)
![Captura 2 del registro en Administradres.txt](practica05(2).png)
![Captura 3 del registro en Empleados.txt](practica05(3).png)

El código fuente de los directorios está organizado por paquetes y se puede revisar directamente en la carpeta [src/](https://github.com/valeriagh-star/Practica-05/tree/main/src).

| Carpetas | Ruta del Archivo .java |
| :--- | :--- |
| **Clase Usuario** | [src/modulos/Usuario.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/modulos/Usuario.java) | 
| **Clase Administrador** | [src/modulos/Administrador.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/modulos/Administrador.java) |
| **Clase Empleado** | [src/modulos/Empleado.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/modulos/Empleado.java) |
| **Interfaz ArregloInterface_V1** | [src/interfaces/arregloInterface_V1.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/interfaces/arregloInterface_V1.java) |
| **Interfaz ArregloInterface_V2** | [src/interfaces/arregloInterface_V2.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/interfaces/arregloInterface_V2.java) |
| **Interfaz ArregloInterface_V3** | [src/interfaces/arregloInterface_V3.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/interfaces/arregloInterface_V3.java) |
| **Clase ManejadorArchivos** | [src/utilidades/ManejadorArchivos.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/utilidades/ManejadorArchivos.java) |
| **Clase ManejadorLista_V1** | [src/utilidades/ManejadorLista_V1.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/utilidades/ManejadorLista_V1.java) |
| **Clase ManejadorLista_V2** | [src/utilidades/ManejadorLista_V2.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/utilidades/ManejadorLista_V2.java) |
| **Clase ManejadorLista_V3** | [src/utilidades/ManejadorLista_V3.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/utilidades/ManejadorLista_V3.java) |
| **Clase Main** | [src/Main/Main.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/Main.java) |
| **Clase MainTarea05** | [src/MainTarea05/MainTarea05.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/MainTarea05.java) | 
| **Clase ManejadorLista** | [src/ManejadorLista/ManejadorLista.java](https://github.com/valeriagh-star/Practica-05/blob/main/src/ManejadorLista.java) |
| **Administradores.txt** | [src/BD/Administradores.txt](https://github.com/valeriagh-star/Practica-05/blob/main/src/BD/Administradores.txt) |
| **Empleados.txt** | [src/BD/Empleados.txt](https://github.com/valeriagh-star/Practica-05/blob/main/src/BD/Empleados.txt) | 
| **README** | [Practica05/main/README.txt](https://github.com/valeriagh-star/Practica-05/blob/main/README.txt) | 

## ▶️ Instrucciones de ejecución

1. **Clonar/Importar:** Importa la carpeta Proyecto como un proyecto Java existente en Eclipse o IntelliJ.
2.  **Posicionarse:** Localiza el archivo Main.java (o MainTarea05.java) dentro de la carpeta src/.
3. **Accede a Configuraciones:** En la barra de menú superior de Eclipse, haz clic en Run -> Run Configurations...
4. **Selecciona tu Clase:** En el panel izquierdo de la ventana "Run Configurations", expande Java Application y selecciona la configuración correspondiente a tu clase principal (ej., Main o MainTarea05). Si no existe, haz doble clic en Java Application para crear una nueva.
5. **Ve a la Pestaña "Arguments":** En la parte superior derecha de la ventana, haz clic en la pestaña Arguments.
6. **Ingresa los 10 Nombres:** En el cuadro de texto etiquetado como "Program arguments", introduce exactamente 10 nombres separados por un espacio. Estos serán los valores que recibirá el arreglo String[] args en tu método main.
* Ejemplo de nombres a usar: "Elena", "Miguel", "Sofia", "Pedro", "Laura", "Felipe", "Carlos", "Maria", "Valeria", "Diego".
7. **Guardar y Ejecutar:** Haz clic en el botón Apply (Aplicar) para guardar la configuración, y luego haz clic en Run (Ejecutar).
8. **Verificación:** El programa se ejecutará y en la consola deberías ver la salida correspondiente: la confirmación de la ENTRADA RECIBIDA, el PROCESAMIENTO DE DATOS (creación y reversión de listas, escritura de archivos) y el RESULTADO FINAL de 11 elementos por cada archivo (Administradores.txt y Empleados.txt).
</div>
