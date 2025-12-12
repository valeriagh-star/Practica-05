package modulos;

public class Empleado extends Usuario {

	public Empleado(String nombre, String correo, String rol) {
		super(nombre, correo, rol);
	}

	@Override
	public void mostrarMenu() {
		System.out.println("Menú del Empleado");
		System.out.println("1. Ver lista de tareas");
		System.out.println("2. Finalizar una tarea");
		System.out.println("6. Salir");
	}



}
