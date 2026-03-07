package pio.daw.afv.tema7.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CargarAlumnos {

	public static void main(String[] args) {
		List<AlumnoPio> alumnosList = new ArrayList<>();
		File alumnosFich = new File("src\\main\\java\\pio\\daw\\afv\\tema7\\lectura\\datosAlumnos.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(alumnosFich);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String []alumnoS = line.split(" ");
					
					AlumnoPio alumno =new AlumnoPio(
							alumnoS[0],
							alumnoS[1],
							alumnoS[2],
							alumnoS[3],
							Integer.parseInt(alumnoS[4]),
							alumnoS[5],
							Integer.parseInt(alumnoS[6]));
					
					System.out.println("El alumno leido es :"+ alumno);
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			if (sc != null)
				sc.close();
		}
	}

}
