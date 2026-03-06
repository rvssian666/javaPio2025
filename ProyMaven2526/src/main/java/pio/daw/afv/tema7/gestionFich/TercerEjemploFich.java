package pio.daw.afv.tema7.gestionFich;

import java.io.File;
import java.util.Date;

public class TercerEjemploFich {

	public static void main(String[] args) {

		File temp = new File("C:\\Temp\\documento.txt");

		// sus atributos de acceso, su tamaño,
		// la fecha de modificación

		long fechaMs = temp.lastModified(); // devuelve milisegundos desde 1970
		Date fecha = new Date(fechaMs); // Date lo convierte a fecha legible
		long tamanno = temp.length();
		System.out.println("Ultima modificacion: " + fechaMs);
		System.out.println("Última modificación en fecha legible -> " + fecha);
		System.out.println("Peso del archivo en BYTES " + tamanno);
	}

}
