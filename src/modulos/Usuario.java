//paquete donde se encuentra la clase Usuario
package modulos;

public abstract class Usuario {
	public abstract void mostrarMenu();
	
	//atributos privados a la clase Usuario
	private String Nombre;
	private String Correo;
	private String Rol;
	
	//getters y setters 
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	//constructor vacio 
	public Usuario() {
		super();
	}
	//constructor con parametros
	public Usuario(String nombre, String correo, String rol) {
		super();
		//validacion de correo
		if(!correo.contains("@") || !correo.endsWith(".com")) {
			throw new IllegalArgumentException("Correo inválido");
		}
		//validacion de nombre
		if(nombre==null || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no puede estar vacío");
		}else {
			if(nombre.length()<5) {
				throw new IllegalArgumentException("Nombre debe tener al menos 5 caracteres");
			}
			this.Nombre = nombre;
		}
		Nombre = nombre;
		Correo = correo;
		Rol = rol;
	}
	//metodo para comparar dos usuarios
	public boolean sonIguales(Usuario u,Usuario u2) {
		//si alguno de los dos es nulo, no son iguales
		if(u==null || u2==null) {
			return false;
		}
		//si todos los atributos son iguales, retorna true
		if(u.getNombre().equals(u2.getNombre()) 
				&& u.getCorreo().equals(u2.getCorreo()) 
				&& u.getRol().equals(u2.getRol())) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Usuario [Nombre=" + Nombre + ", Correo=" + Correo + ", Rol=" + Rol + "]";
	}
	
}
