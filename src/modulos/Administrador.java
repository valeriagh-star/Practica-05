package modulos;

public class Administrador extends Usuario {

	public Administrador(String nombre, String correo, String rol) {
		super(nombre, correo, rol);
	}
	
	@Override
	public void mostrarMenu() {
		System.out.println("Menú del Administrador");
		System.out.println("1. Registrar un nuevo Usuario");
		System.out.println("2. Eliminar un Usuario");
		System.out.println("3. Ver lista de Usuario");
		System.out.println("4. Ver lista de Tareas");
		System.out.println("5. Crear nueva Tarea");
		System.out.println("6. Salir");
	}

}