import java.nio.file.Paths;
import modulos.Administrador;
import modulos.Empleado;
import utilidades.ManejadorArchivos;
import utilidades.ManejadorLista_V3;

public class MainTarea05 {
	//definimos rutas de los archivos
	static final String PATH_EMPLEADOS = Paths.get("src", "BD", "Empleados.txt").toString();
	static final String PATH_ADMINISTRADORES = Paths.get("src", "BD", "Administradores.txt").toString();
	public static void main(String[] args) {
		//validamos los 10 nombres esperados
		if(args.length !=10) {
			System.out.println("Error: Se esperaban 10 nombres como argumentos.");
			return;
		}
		int contador =0;
		//generamos los arreglos
		Empleado[] empleados = new Empleado[10];
		Administrador[] administradores = new Administrador[10];
		for(String nombre : args) {
			System.out.println((contador+1) + ". " + nombre);
			Empleado empleado = new Empleado(nombre, nombre.toLowerCase() + "@empresa.com", "Empleado");
			empleados[contador] = empleado;
			Administrador administrador = new Administrador(nombre, nombre.toLowerCase() + "@empresa.com", "Administrador");
			administradores[contador] = administrador;
			contador++;
		}

		//invertimos los arreglos
		ManejadorLista_V3<Empleado> manejadorEmpleados = extracted();
		empleados= manejadorEmpleados.regresarReversa(empleados);
		
		ManejadorLista_V3<Administrador> manejadorLista_V3 = new ManejadorLista_V3<>(Administrador.class);
		ManejadorLista_V3<Administrador> manejadorAdministrador = manejadorLista_V3;
		
		administradores=  manejadorAdministrador.regresarReversa(administradores);
		
		//escribimos los arreglos
		ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
		for(Empleado empleado : empleados) {
			manejadorArchivos.escribirLineaAlFinal(empleado.getNombre()+","+empleado.getCorreo()+","+empleado.getRol(), PATH_EMPLEADOS);
		}
		for(Administrador administrador : administradores) {
			manejadorArchivos.escribirLineaAlFinal(administrador.getNombre()+","+administrador.getCorreo()+","+administrador.getRol(), PATH_ADMINISTRADORES);
		}
		
		//creamos un nuevo empleado
		Empleado nuevoEmpleado = new Empleado("NuevoEmpleado","NuevoEmpleado@empresa.com","Empleado");
		//creamos un nuevo administrador
		Administrador nuevoAdministrador = new Administrador("NuevoAdministrador","NuevoAdministrador@empresa.com","Administrador");
		
		//agregamos el nuevo empleado al archivo
		manejadorArchivos.escribirLineaAlFinal(nuevoEmpleado.getNombre()+","+nuevoEmpleado.getCorreo()+","+nuevoEmpleado.getRol(), PATH_EMPLEADOS);
		//agregamos el nuevo administrador al archivo
		manejadorArchivos.escribirLineaAlFinal(nuevoAdministrador.getNombre()+","+nuevoAdministrador.getCorreo()+","+nuevoAdministrador.getRol(), PATH_ADMINISTRADORES);
		
		//leemos archivos completos
		String[] empleadosLeidos = manejadorArchivos.leerArchivoComoArreglo(PATH_EMPLEADOS);
		String[] administradoresLeidos = manejadorArchivos.leerArchivoComoArreglo(PATH_ADMINISTRADORES);
		
		//mostramos los empleados leidos
		System.out.println("\nEmpleados en el archivo:");
		for(String linea : empleadosLeidos) {
			System.out.println(linea);
		}
		//mostramos los administradores leidos
		System.out.println("\nAdministradores en el archivo:");
		for(String linea : administradoresLeidos) {
			System.out.println(linea);
		}
		
	}
	private static ManejadorLista_V3<Empleado> extracted() {
		return new ManejadorLista_V3<>(Empleado.class);
	}

}
