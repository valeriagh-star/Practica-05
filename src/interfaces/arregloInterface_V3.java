package interfaces;

/**
 * Generic array utilities interface.
 * @param <T> Type of elements stored in the arrays.
 */
public interface arregloInterface_V3<T> {

    /**
     * Regresa un nuevo arreglo con los elementos en orden inverso.
     * @param arreglo Arreglo original de elementos de tipo T.
     * @return Nuevo arreglo con elementos en orden reverso.
     * @throws IllegalArgumentException Si el arreglo de entrada es nulo.
     * @throws IllegalStateException Si el estado del arreglo impide la inversión.
     */
    T[] regresarReversa(T[] arreglo) 
        throws IllegalArgumentException, IllegalStateException;

    /**
     * Agrega un elemento al final del arreglo.
     * @param arreglo Arreglo original de elementos de tipo T.
     * @param elemento Elemento a agregar.
     * @return Nuevo arreglo con el elemento agregado.
     * @throws IllegalArgumentException Si el arreglo o el elemento son nulos.
     */
    T[] agregarElemento(T[] arreglo, T elemento) 
        throws IllegalArgumentException;

    /**
     * Busca un elemento en el arreglo por posición.
     * @param arreglo Arreglo donde buscar.
     * @param posicion Posición a buscar.
     * @return Elemento de tipo T en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
     */
    T buscarElemento(T[] arreglo, int posicion) 
        throws IllegalArgumentException, IndexOutOfBoundsException;

    /**
     * Elimina un elemento del arreglo por posición.
     * @param arreglo Arreglo original de elementos de tipo T.
     * @param posicion Posición del elemento a eliminar.
     * @return Nuevo arreglo sin el elemento en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
     */
    T[] eliminarElemento(T[] arreglo, int posicion) 
        throws IllegalArgumentException, IndexOutOfBoundsException;
}