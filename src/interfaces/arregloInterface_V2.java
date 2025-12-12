package interfaces;

public interface arregloInterface_V2 {

	/**
	 * Regresa un nuevo arreglo con los elementos en orden inverso.
	 * 
	 * @param arreglo Arreglo original de elementos (Object[]).
	 * @return Nuevo arreglo con elementos en orden reverso.
	 * @throws IllegalArgumentException Si el arreglo de entrada es nulo.
	 * @throws IllegalStateException    Si el estado del arreglo impide la
	 *                                  inversión.
	 */
	Object[] regresarReversa(Object[] arreglo) throws IllegalArgumentException, IllegalStateException;

	/**
	 * Agrega un elemento al final del arreglo.
	 * 
	 * @param arreglo  Arreglo original de elementos (Object[]).
	 * @param elemento Elemento a agregar.
	 * @return Nuevo arreglo con el elemento agregado.
	 * @throws IllegalArgumentException Si el arreglo o el elemento son nulos.
	 */
	Object[] agregarElemento(Object[] arreglo, Object elemento) throws IllegalArgumentException;

	/**
	 * Busca un elemento en el arreglo por posición.
	 * 
	 * @param arreglo  Arreglo donde buscar.
	 * @param posicion Posición a buscar.
	 * @return Elemento en la posición especificada.
	 * @throws IllegalArgumentException  Si el arreglo es nulo.
	 * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
	 */
	Object buscarElemento(Object[] arreglo, int posicion) throws IllegalArgumentException, IndexOutOfBoundsException;

	/**
	 * Elimina un elemento del arreglo por posición.
	 * 
	 * @param arreglo  Arreglo original.
	 * @param posicion Posición del elemento a eliminar.
	 * @return Nuevo arreglo sin el elemento en la posición especificada.
	 * @throws IllegalArgumentException  Si el arreglo es nulo.
	 * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
	 */
	Object[] eliminarElemento(Object[] arreglo, int posicion)
			throws IllegalArgumentException, IndexOutOfBoundsException;

	
}