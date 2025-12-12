import interfaces.arregloInterface_V1;
import modulos.Administrador;
import modulos.Empleado; 

public class ManejadorLista implements arregloInterface_V1 {

    @Override
    public Empleado[] regresarReversa(Empleado[] arreglo) 
            throws IllegalArgumentException, IllegalStateException {
        
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        
        int n = arreglo.length;
        Empleado[] nuevoArreglo = new Empleado[n];
        
        for (int i = 0; i < n; i++) {
            nuevoArreglo[i] = arreglo[n - 1 - i];
        }
        
        return nuevoArreglo;
    }

    @Override
    public Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado) 
            throws IllegalArgumentException {
        
        if (arreglo == null || empleado == null) {
            throw new IllegalArgumentException("El arreglo o el empleado no pueden ser nulos.");
        }
        
        int n = arreglo.length;
        Empleado[] nuevoArreglo = new Empleado[n + 1];
        
        // Copiar elementos originales
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, n);
        
        // Agregar el nuevo elemento al final
        nuevoArreglo[n] = empleado;
        
        return nuevoArreglo;
    }

    @Override
    public Empleado buscarElemento(Empleado[] arreglo, int posicion) 
            throws IllegalArgumentException, IndexOutOfBoundsException {
        
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición " + posicion + " fuera del límite del arreglo.");
        }
        
        return arreglo[posicion];
    }

    @Override
    public Empleado[] eliminarElemento(Empleado[] arreglo, int posicion) 
            throws IllegalArgumentException, IndexOutOfBoundsException {
        
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición " + posicion + " fuera del límite del arreglo.");
        }
        
        int n = arreglo.length;
        if (n == 0) { 
             throw new IllegalArgumentException("No se puede eliminar de un arreglo vacío.");
        }

        Empleado[] nuevoArreglo = new Empleado[n - 1];
        
        // Copiar elementos ANTES de la posición
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, posicion);
        
        // CORRECCIÓN: Copiar elementos DESPUÉS de la posición, especificando la longitud correcta.
        // Longitud = tamaño total - posición - 1 (el elemento eliminado)
        System.arraycopy(arreglo, posicion + 1, nuevoArreglo, posicion, n - posicion - 1);
        
        return nuevoArreglo;
    }

    @Override
    public Administrador[] regresarReversa(Administrador[] arreglo) 
            throws IllegalArgumentException, IllegalStateException {
        
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        
        int n = arreglo.length;
        Administrador[] nuevoArreglo = new Administrador[n];
        
        for (int i = 0; i < n; i++) {
            nuevoArreglo[i] = arreglo[n - 1 - i];
        }
        
        return nuevoArreglo;
    }

    @Override
    public Administrador[] agregarElemento(Administrador[] arreglo, Administrador administrador) 
            throws IllegalArgumentException {
        
        if (arreglo == null || administrador == null) {
            throw new IllegalArgumentException("El arreglo o el administrador no pueden ser nulos.");
        }
        
        int n = arreglo.length;
        Administrador[] nuevoArreglo = new Administrador[n + 1];
        
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, n);
        
        nuevoArreglo[n] = administrador;
        
        return nuevoArreglo;
    }

    @Override
    public Administrador buscarElemento(Administrador[] arreglo, int posicion) 
            throws IllegalArgumentException, IndexOutOfBoundsException {
        
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición " + posicion + " fuera del límite del arreglo.");
        }
        
        return arreglo[posicion]; 
    }

    @Override
    public Administrador[] eliminarElemento(Administrador[] arreglo, int posicion) 
            throws IllegalArgumentException, IndexOutOfBoundsException {
        
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición " + posicion + " fuera del límite del arreglo.");
        }
        
        int n = arreglo.length;
        if (n == 0) { 
             throw new IllegalArgumentException("No se puede eliminar de un arreglo vacío.");
        }
        
        Administrador[] nuevoArreglo = new Administrador[n - 1];
        
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, posicion);
        // CORRECCIÓN: Copiar elementos DESPUÉS de la posición
        System.arraycopy(arreglo, posicion + 1, nuevoArreglo, posicion, n - posicion - 1);
        
        return nuevoArreglo;
    }
}