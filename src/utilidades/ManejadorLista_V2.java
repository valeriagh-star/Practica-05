package utilidades;

import interfaces.arregloInterface_V2;

public class ManejadorLista_V2 implements arregloInterface_V2 {

	@Override
	public Object[] regresarReversa(Object[] arreglo) throws IllegalArgumentException, IllegalStateException {
		if (arreglo == null) {
			throw new IllegalArgumentException("El arreglo no puede ser null.");
		}
		if (arreglo.length == 0) {
			throw new IllegalStateException("El arreglo está vacío.");
		}
		Object[] resultado = new Object[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			resultado[i] = arreglo[arreglo.length - 1 - i];
		}
		return resultado;
	}

	@Override
	public Object[] agregarElemento(Object[] arreglo, Object elemento) throws IllegalArgumentException {
		if (elemento == null) {
			throw new IllegalArgumentException("El elemento a agregar no puede ser null.");
		}
		if (arreglo == null) {
			Object[] nuevo = new Object[1];
			nuevo[0] = elemento;
			return nuevo;
		}
		Object[] nuevo = new Object[arreglo.length + 1];
		System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
		nuevo[arreglo.length] = elemento;
		return nuevo;
	}

	@Override
	public Object buscarElemento(Object[] arreglo, int posicion)
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
	public Object[] eliminarElemento(Object[] arreglo, int posicion)
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
		Object[] nuevo = new Object[arreglo.length - 1];
		if (posicion > 0) {
			System.arraycopy(arreglo, 0, nuevo, 0, posicion);
		}
		if (posicion < arreglo.length - 1) {
			System.arraycopy(arreglo, posicion + 1, nuevo, posicion, arreglo.length - posicion - 1);
		}
		return nuevo;
	}
}
