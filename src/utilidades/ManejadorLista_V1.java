package utilidades;

import interfaces.arregloInterface_V1;
import modulos.Administrador;
import modulos.Empleado;

public class ManejadorLista_V1 implements arregloInterface_V1 {

	@Override
	public Empleado[] regresarReversa(Empleado[] arreglo) throws IllegalArgumentException, IllegalStateException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (arreglo.length == 0) {
			throw new IllegalStateException("El arreglo está vacío.");
		}
		Empleado[] resultado = new Empleado[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			resultado[i] = arreglo[arreglo.length - 1 - i];
		}
		return resultado;
	}

	@Override
	public Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado) throws IllegalArgumentException {
		if (empleado == null) {
			throw new IllegalArgumentException("El empleado a agregar no puede ser null.");
		}
		if (arreglo == null) {
			Empleado[] nuevo = new Empleado[1];
			nuevo[0] = empleado;
			return nuevo;
		}
		Empleado[] nuevo = new Empleado[arreglo.length + 1];
		System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
		nuevo[arreglo.length] = empleado;
		return nuevo;
	}

	@Override
	public Empleado buscarElemento(Empleado[] arreglo, int posicion)
			throws IllegalArgumentException, IndexOutOfBoundsException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (posicion < 0 || posicion >= arreglo.length) {
			throw new IndexOutOfBoundsException("Posición fuera de rango: " + posicion);
		}
		return arreglo[posicion];
	}

	@Override
	public Empleado[] eliminarElemento(Empleado[] arreglo, int posicion)
			throws IllegalArgumentException, IndexOutOfBoundsException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (arreglo.length == 0) {
			throw new IllegalStateException("El arreglo está vacío, no se puede eliminar.");
		}
		if (posicion < 0 || posicion >= arreglo.length) {
			throw new IndexOutOfBoundsException("Posición fuera de rango: " + posicion);
		}
		Empleado[] nuevo = new Empleado[arreglo.length - 1];
		// copy before position
		if (posicion > 0) {
			System.arraycopy(arreglo, 0, nuevo, 0, posicion);
		}
		// copy after position
		if (posicion < arreglo.length - 1) {
			System.arraycopy(arreglo, posicion + 1, nuevo, posicion, arreglo.length - posicion - 1);
		}
		return nuevo;
	}

	@Override
	public Administrador[] regresarReversa(Administrador[] arreglo)
			throws IllegalArgumentException, IllegalStateException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (arreglo.length == 0) {
			throw new IllegalStateException("El arreglo está vacío.");
		}
		Administrador[] resultado = new Administrador[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			resultado[i] = arreglo[arreglo.length - 1 - i];
		}
		return resultado;
	}

	@Override
	public Administrador[] agregarElemento(Administrador[] arreglo, Administrador administrador)
			throws IllegalArgumentException {
		if (administrador == null) {
			throw new IllegalArgumentException("El administrador a agregar no puede ser null.");
		}
		if (arreglo == null) {
			Administrador[] nuevo = new Administrador[1];
			nuevo[0] = administrador;
			return nuevo;
		}
		Administrador[] nuevo = new Administrador[arreglo.length + 1];
		System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
		nuevo[arreglo.length] = administrador;
		return nuevo;
	}

	@Override
	public Administrador buscarElemento(Administrador[] arreglo, int posicion)
			throws IllegalArgumentException, IndexOutOfBoundsException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (posicion < 0 || posicion >= arreglo.length) {
			throw new IndexOutOfBoundsException("Posición fuera de rango: " + posicion);
		}
		return arreglo[posicion];
	}

	@Override
	public Administrador[] eliminarElemento(Administrador[] arreglo, int posicion)
			throws IllegalArgumentException, IndexOutOfBoundsException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (arreglo.length == 0) {
			throw new IllegalStateException("El arreglo está vacío, no se puede eliminar.");
		}
		if (posicion < 0 || posicion >= arreglo.length) {
			throw new IndexOutOfBoundsException("Posición fuera de rango: " + posicion);
		}
		Administrador[] nuevo = new Administrador[arreglo.length - 1];
		if (posicion > 0) {
			System.arraycopy(arreglo, 0, nuevo, 0, posicion);
		}
		if (posicion < arreglo.length - 1) {
			System.arraycopy(arreglo, posicion + 1, nuevo, posicion, arreglo.length - posicion - 1);
		}
		return nuevo;
	}

}
