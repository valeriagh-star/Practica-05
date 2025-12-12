package utilidades;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ManejadorArchivos {

	public String[] leerArchivoComoArreglo(String nombreArchivo) {
		if (nombreArchivo == null || nombreArchivo.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre del archivo no puede ser null o vacío.");
		}

		Path path = Paths.get(nombreArchivo);
		if (!Files.exists(path)) {
			throw new IllegalStateException("El archivo no existe: " + nombreArchivo);
		}
		if (Files.isDirectory(path)) {
			throw new IllegalStateException("La ruta es un directorio, se esperaba un archivo: " + nombreArchivo);
		}

		try {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			return lines.toArray(new String[0]);
		} catch (IOException e) {
			throw new IllegalStateException("Error leyendo el archivo: " + nombreArchivo, e);
		}
	}
	public String buscarLinea(String cadenaBuscada,String nombreArchivo) {
		String[] lineas = leerArchivoComoArreglo(nombreArchivo);
		for (String linea : lineas) {
			if (linea.contains(cadenaBuscada)) {
				return linea;
			}
		}
		return null; // Retorna null si no se encuentra la cadena
	}
	public void escribirLineaAlFinal(String linea,String nombreArchivo) {
		if (linea == null) {
			throw new IllegalArgumentException("La línea no puede ser null.");
		}
		if (nombreArchivo == null || nombreArchivo.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre del archivo no puede ser null o vacío.");
		}

		Path path = Paths.get(nombreArchivo);
		try {
			Files.write(path, (linea + System.lineSeparator()).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new IllegalStateException("Error escribiendo en el archivo: " + nombreArchivo, e);
		}
	}
	public void escribirArregloAArchivo(String[] lineas,String nombreArchivo) {
		if (lineas == null) {
			throw new IllegalArgumentException("El arreglo de líneas no puede ser null.");
		}
		if (nombreArchivo == null || nombreArchivo.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre del archivo no puede ser null o vacío.");
		}

		Path path = Paths.get(nombreArchivo);
		try {
			Files.write(path, List.of(lineas), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			throw new IllegalStateException("Error escribiendo en el archivo: " + nombreArchivo, e);
		}
	}
}