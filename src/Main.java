//importamos la clase Scanner para leer por consola
import java.util.Scanner;
import modulos.Administrador;
import modulos.Empleado;
import modulos.Usuario;

public class Main {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese Nombre
        System.out.println("Introduce Nombre: ");
        
        // Leer la línea completa ingresada por el usuario
        String nombre = scanner.nextLine();
        
        // Pedir al usuario que ingrese Correo
        System.out.println("Introduce Correo: ");
        
        // Leer la línea completa ingresada por el usuario
        String correo = scanner.nextLine();
        
        // Validar que el correo contenga "@" y termine con ".com"
        while(!correo.contains("@") || !correo.endsWith(".com")) {
			System.out.println("Correo inválido. Introduce un correo válido: ");
			correo = scanner.nextLine();
		}
        // Mostrar las opciones de rol
        System.out.println("Selecciona Rol:");
        System.out.println("1 - Administrador");
        System.out.println("2 - Empleado");

        String rol = scanner.nextLine();
        
        // Validar la opción ingresada
        while(!rol.equals("1") && !rol.equals("2")) {
        	System.out.println("Rol inválido. Selecciona 1 o 2: ");
			rol = scanner.nextLine();
        }
      //se crea usuario con los datos ingresados
        Usuario usuario;
        
        // Asignar el rol correspondiente con base a la opción ingresada
		if(rol.equals("1")) {
			rol = "Administrador";
			usuario = new Administrador(nombre, correo, rol);
		}else {
			rol = "Empleado";
			usuario= new Empleado(nombre, correo, rol);
		}
        // Cerrar el scanner
        scanner.close();
        
        
        System.out.println("Usuario creado exitosamente:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Rol: " + usuario.getRol());
     
  	  // Pruebas de la interfaz de manejo de arreglos
		{
                ManejadorLista manejo = new ManejadorLista(); 
                
                // Crear Administrador (para cumplir con la instanciación de la captura)
                Administrador admin = new Administrador("Admins", "Boss@gmail.com", "Administrador");

                // Crear arreglo de prueba
                Empleado[] empleados = {
                    new Empleado("Pedro Vázquez", "correo1@gmail.com", "Desarrollador"),
                    new Empleado("Diana García", "correo2@gmail.com", "Diseñadora"),
                    new Empleado("Diego López", "correo3@gmail.com", "Gerente")
                };
                
                // Mostrar demo de clases (como en la captura)
                admin.mostrarMenu(); 
                empleados[0].mostrarMenu(); 

                System.out.println("\n=== PRUEBA DE IMPLEMENTACIÓN ARREGLOS INTERFACE ===\n");
                
                // 1. Mostrar arreglo original
                System.out.println("#1. ARREGLO ORIGINAL:");
                imprimirArreglo(empleados);
                
                // 2. Probar regresarReversa
                System.out.println("\n#2. ARREGLO EN REVERSA:");
                Empleado[] reversa = manejo.regresarReversa(empleados);
                imprimirArreglo(reversa);

                // 3. Probar agregarElemento
                System.out.println("\n#3. AGREGAR ELEMENTO:");
                Empleado nuevoEmpleado = new Empleado("Ana Martínez", "correo04@gmail.com", "Analista");
                Empleado[] conNuevo = manejo.agregarElemento(empleados, nuevoEmpleado);
                System.out.println("Después de agregar: " + nuevoEmpleado);
                imprimirArreglo(conNuevo);
                
                // 4. Probar buscarElemento
                System.out.println("\n#4. BUSCAR ELEMENTO:");
                int posicionBuscar = 1; // Buscar a Diana García
                Empleado encontrado;
                try {
                    encontrado = manejo.buscarElemento(empleados, posicionBuscar);
                    System.out.println("Empleado en posicion " + posicionBuscar + ": " + encontrado);
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    System.out.println("Excepción capturada: " + e.getMessage());
                }

                // 5. Probar eliminarElemento
                System.out.println("\n#5. ELIMINAR ELEMENTO:");
                int posicionEliminar = 0; // Eliminar a Pedro Vázquez
                try {
                    Empleado[] sinElemento = manejo.eliminarElemento(empleados, posicionEliminar);
                    System.out.println("Después de eliminar posición " + posicionEliminar + ":");
                    imprimirArreglo(sinElemento);
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    System.out.println("Excepción capturada: " + e.getMessage());
                }
                
                // 6. Prueba de excepciones
                System.out.println("\n#6. PRUEBA DE EXCEPCIONES:");
                int posicionInvalida = 5; 
                try {
                    manejo.buscarElemento(empleados, posicionInvalida); 
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Excepción capturada al buscar en posición inválida: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                     System.out.println("Excepción capturada: " + e.getMessage());
                }
		}		}
            /**
             * Método auxiliar para imprimir arreglos
             * @return 
             */
            private static void imprimirArreglo(Empleado[] arreglo) {
                if (arreglo == null || arreglo.length == 0) {
                    System.out.println("Arreglo vacío o nulo");
                    return;
                }

                for (int i = 0; i < arreglo.length; i++) {
                    // Se usa toString() implícito, o se asume que arreglo[i].getNombre() existe
                    System.out.println(" [ " + i + " ] " + arreglo[i]); 
                }
                System.out.println(" Total elementos: " + arreglo.length);
            }   
	}
