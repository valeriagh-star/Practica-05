package interfaces;

// Se asume que la clase Empleado se encuentra en 'modulos' o en el mismo paquete.
import modulos.Empleado; 
import modulos.Administrador; 

public interface arregloInterface_V1 {

    /**
     * Regresa un nuevo arreglo con los elementos en orden inverso.
     * @param arreglo Arreglo original de Empleados.
     * @return Nuevo arreglo con elementos en orden reverso.
     * @throws IllegalArgumentException Si el arreglo de entrada es nulo.
     * @throws IllegalStateException Si el estado del arreglo impide la inversión.
     */
    Empleado[] regresarReversa(Empleado[] arreglo) 
        throws IllegalArgumentException, IllegalStateException;

    /**
     * Agrega un empleado al final del arreglo.
     * @param arreglo Arreglo original de Empleados.
     * @param empleado Empleado a agregar.
     * @return Nuevo arreglo con el empleado agregado.
     * @throws IllegalArgumentException Si el arreglo o el empleado son nulos.
     */
    Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado) 
        throws IllegalArgumentException;

    /**
     * Busca un empleado en el arreglo por posición.
     * @param arreglo Arreglo donde buscar.
     * @param posicion Posición a buscar.
     * @return Empleado en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
     */
    Empleado buscarElemento(Empleado[] arreglo, int posicion) 
        throws IllegalArgumentException, IndexOutOfBoundsException;

    /**
     * Elimina un empleado del arreglo por posición.
     * @param arreglo Arreglo original.
     * @param posicion Posición del empleado a eliminar.
     * @return Nuevo arreglo sin el empleado en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
     */
    Empleado[] eliminarElemento(Empleado[] arreglo, int posicion) 
        throws IllegalArgumentException, IndexOutOfBoundsException;

    Administrador[] regresarReversa(Administrador[] arreglo) 
        throws IllegalArgumentException, IllegalStateException;

    /**
     * Agrega un administrador al final del arreglo.
     * @param arreglo Arreglo original de Administradores.
     * @param administrador Administrador a agregar.
     * @return Nuevo arreglo con el administrador agregado.
     * @throws IllegalArgumentException Si el arreglo o el administrador son nulos.
     */
    Administrador[] agregarElemento(Administrador[] arreglo, Administrador administrador) 
        throws IllegalArgumentException;

    /**
     * Busca un administrador en el arreglo por posición.
     * @param arreglo Arreglo donde buscar.
     * @param posicion Posición a buscar.
     * @return Administrador en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
     */
    Administrador buscarElemento(Administrador[] arreglo, int posicion) 
        throws IllegalArgumentException, IndexOutOfBoundsException;

    /**
     * Elimina un administrador del arreglo por posición.
     * @param arreglo Arreglo original.
     * @param posicion Posición del administrador a eliminar.
     * @return Nuevo arreglo sin el administrador en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango válido.
     */
    Administrador[] eliminarElemento(Administrador[] arreglo, int posicion) 
        throws IllegalArgumentException, IndexOutOfBoundsException;
}