package pio.daw.afv.tema7.gestionFich;

import java.io.File;

public class PrimerEjemploFich {

	public static void main(String[] args) {
		// ver donde estamos
		System.out.println("Ruta de busqueda inicial: " + System.getProperty("user.dir"));

		// Dos rutas absolutas
		File carpetaRutaAbs = new File("C:\\xampp\\htdocs");
		// mostrar info
		mosotrarRutas(carpetaRutaAbs);
		
		//rutas absolutas de fichero
		File archivoRutaAbs=new File("C:\\xampp\\\\htdocs\\applications.html");
		mosotrarRutas(archivoRutaAbs);
		
		//Ruta archivo relativo
		File archivoRel=new File("projectos/documentos.txt");

	}

	private static void mosotrarRutas(File f) {
		System.out.println("getParents(): " + f.getParent());
		System.out.println("getName():" + f.getName());
		System.out.println("getAbsolutePath: "+ f.getAbsolutePath());
		System.out.println("?Es un archivo? "+ f.isFile());
		System.out.println("?Es un archivo? "+ f.isDirectory());
		System.out.println("?Es un archivo? "+ f.exists());
		

	}

}
