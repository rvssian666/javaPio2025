package pio.daw.afv.tema7.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EjemploNIOLectura {

	final static String rutaFich = ("C:\\Users\\rvssi\\git\\javaPio2025\\ProyMaven2526\\src\\main\\java\\pio\\daw\\afv\\tema7\\path\\ejemploNIOLectura.txt");

	public static void main(String[] args) throws IOException {
		// Para acceder al archivo usamos la clase Path (en vez de File)
		Path leeFich = Paths.get(rutaFich);

		ArrayList<String> lineas = (ArrayList<String>) Files.readAllLines(leeFich);
		for (String linea :lineas) {
			System.out.println(linea);
			
		}
	}

}
