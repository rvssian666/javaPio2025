package pio.daw.afv.tema7.lectura;

import java.io.File;
import java.io.FileWriter;

public class EscribirEnteros {

	public static void main(String[] args) {

		// programa que empezando con 1 , pinta 20 numeros pero cada numero
		// es el doble del anterior

		File f = new File("src\\main\\java\\pio\\daw\\afv\\tema7\\lectura\\enteros.txt");
		try {
			FileWriter fw = new FileWriter(f);
			int j = 1;
			for (int i = 1; i <= 20; i++) {
				j *= 2;

				fw.write("" + j + " ");

			}

			fw.close();
			System.out.println("Fichero generado correctamente ");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
