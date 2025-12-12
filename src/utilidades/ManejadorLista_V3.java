package utilidades;

import interfaces.arregloInterface_V3;
import java.lang.reflect.Array;

public class ManejadorLista_V3<T> implements arregloInterface_V3<T> {

    private final Class<T> clazz;

    public ManejadorLista_V3(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T[] regresarReversa(T[] arreglo) throws IllegalArgumentException, IllegalStateException {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null.");
        }
        if (arreglo.length == 0) {
            throw new IllegalStateException("El arreglo está vacío.");
        }
        @SuppressWarnings("unchecked")
		T[] resultado = (T[]) Array.newInstance(clazz, arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[arreglo.length - 1 - i];
        }
        return resultado;
    }

    @SuppressWarnings("unchecked")
	@Override
    public T[] agregarElemento(T[] arreglo, T elemento) throws IllegalArgumentException {
        if (elemento == null) {
            throw new IllegalArgumentException("El elemento a agregar no puede ser null.");
        }
        int length = (arreglo == null) ? 0 : arreglo.length;
        T[] nuevo = (T[]) Array.newInstance(clazz, length + 1);
        if (arreglo != null) {
            System.arraycopy(arreglo, 0, nuevo, 0, length);
        }
        nuevo[length] = elemento;
        return nuevo;
    }

    @Override
    public T buscarElemento(T[] arreglo, int posicion)
            throws IllegalArgumentException, IndexOutOfBoundsException {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null.");
        }
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición fuera de rango: " + posicion);
        }
        return arreglo[posicion];
    }

    @SuppressWarnings("unchecked")
	@Override
    public T[] eliminarElemento(T[] arreglo, int posicion)
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
        T[] nuevo = (T[]) Array.newInstance(clazz, arreglo.length - 1);
        for (int i = 0, j = 0; i < arreglo.length; i++) {
            if (i != posicion) {
                nuevo[j++] = arreglo[i];
            }
        }
        return nuevo;
    }
}
