package pio.daw.afv.tema7.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerEnteros {
	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
		// Lectura de un fichero de texto
		Scanner lector = null;
		File f = new File("src\\main\\java\\pio\\daw\\afv\\tema7\\lectura\\enteros.txt");
		try {
			lector = new Scanner(f);
			// Si llegamos hasta aqui es que hemos encontrado y abierto el fichero
			// vamos a leer los 10 numeros
			for (int i = 0; i < NUM_VALORES; i++) {
				int valor = lector.nextInt();
				System.out.println("Leido el " + valor);

			} // fin for
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (lector != null)
				lector.close();
		}

	}

}
