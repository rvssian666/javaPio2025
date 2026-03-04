package pio.daw.afv.tema7.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerEnteros2 {
	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
		// Lectura de un fichero de texto
		Scanner lector = null;
		File f = new File("src\\main\\java\\pio\\daw\\afv\\tema7\\lectura\\enteros.txt");
		try {
			lector = new Scanner(f);
			String linea = lector.nextLine();
			String[] numerosStr = linea.split(" ");
			for (String nuString : numerosStr) {
				int numeros = Integer.parseInt(nuString);
				System.out.println("numero :" + nuString);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (lector != null)
				lector.close();
		}

	}

}
