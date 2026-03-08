package pio.daw.afv.tema7.Velocidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Velocidad {

	public static void main(String[] args) {

		Scanner sc = null;

		try {
			File veloc = new File(
					"C:\\Users\\rvssi\\git\\javaPio2025\\ProyMaven2526\\src\\main\\java\\pio\\daw\\afv\\tema7\\Velocidad\\velocidad.txt");
			sc = new Scanner(veloc);
			System.out.println("*Inicio*");
			// inicializamos casos de pruebas
			int numCasos = sc.nextInt();
			System.out.println("numCasos= " + 3);
			sc.nextLine();
			for (int i = 0; i < numCasos; i++) {
				// declaramos variables para guardar
				// tiempo=t, distancia =d, velocidad =v,
				double d = 0;
				double t = 0;
				double v = 0;

				String line = sc.nextLine();
				System.out.println(line);
				String[] espacios = line.split(" ");
				for (int j = 0; j < 2; j++) {
					String[] data = espacios[j].split("=");
					if (data[0].equals("D"))
						d = Double.parseDouble(data[1]);
					else if (data[0].equals("T"))
						t = Double.parseDouble(data[1]);
					else if (data[0].equals("V"))
						v = Double.parseDouble(data[1]);
				}
				if (v == 0)
					System.out.println("Velocidad= " + d / t);
				else if (t == 0)
					System.out.println("Tiempo= " + d / v);
				else
					System.out.println("Distancia= " + (v * t));

			}

		} catch (FileNotFoundException e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			if (sc != null)
				sc.close();
		}

	}

}
