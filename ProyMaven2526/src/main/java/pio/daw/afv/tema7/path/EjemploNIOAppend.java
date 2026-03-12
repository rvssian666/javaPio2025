package pio.daw.afv.tema7.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import jdk.dynalink.StandardOperation;

public class EjemploNIOAppend {
	final static String rutaFich = ("C:\\Users\\rvssi\\git\\javaPio2025\\ProyMaven2526\\src\\main\\java\\pio\\daw\\afv\\tema7\\path\\ejemploNIOAppend.txt");

	public static void main(String[] args) {
		// concatenar si existe
		try {
			Path pathFichero = Paths.get(rutaFich);
			if (Files.exists(pathFichero)) {
				System.out.println("El archivo ya existe ");
			} else 
				Files.createFile(pathFichero);
			
			Files.writeString(pathFichero, "\n EL precio del petroleo subira", StandardOpenOption.APPEND);
			System.out.println("Fichero añdido correctamente ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
