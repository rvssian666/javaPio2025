package pio.daw.afv.tema7.gestionFich;

import java.io.File;
import java.util.Date;

public class TercerEjemploFich {

	public static void main(String[] args) {

		File temp = new File("C:\\Temp\\documento.txt");
		File tempFotos = new File("C:\\Temp\\Fotos");

		// sus atributos de acceso, su tamaño,
		// la fecha de modificación

		long fechaMs = temp.lastModified(); // devuelve milisegundos desde 1970
		Date fecha = new Date(fechaMs); // Date lo convierte a fecha legible
		long tamanno = temp.length();
		System.out.println("Ultima modificacion: " + fechaMs);
		System.out.println("Última modificación en fecha legible -> " + fecha);
		System.out.println("Peso del archivo en BYTES " + tamanno);

		// Creacion de carpetas y ficheros
		/*
		 * 
		 * 
		 * if (tempFotos.exists()) { tempFotos.delete();
		 * System.out.println("Carpeta borrada!"); } else { tempFotos.mkdir();
		 * System.out.println("Carpeta creada"); }
		 * 
		 * 
		 */

		// mover ficheros y archivos
		// Quinto ejemplo Fitch
		File destino = new File("C:\\Temp\\FotosNew");
		tempFotos.renameTo(destino);
		System.out.println("Carpeta renombrada a : " + destino.getAbsolutePath());

		/// Mover ficheros
		File origenFich = new File("C:\\Temp\\FotosNew\\documento.txt");
		File destinoFich = new File("C:\\Temp\\NewDocumento.txt");
		origenFich.renameTo(destinoFich);
		System.out.println("Fichero :" + origenFich.getName() + " renombrado a :" + destinoFich.getName());

		// Sexto ejemplo ficheros
		// LIstar ficheros y carpetas de una "carpeta"

		File xampp = new File("C:\\xampp");
		File[] content = xampp.listFiles();

		if (content != null) {
			for (int i = 0; i < content.length; i++) {
				if (!content[i].isFile()) {
					System.out.println("Directorio: " + content[i].getName());
				} else
					System.out.println("Archivo : " + content[i].getName());

			}
		}
	}

}
