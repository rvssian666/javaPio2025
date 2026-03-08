package pio.daw.afv.tema7.lectura.canciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CargarCanciones {

	public static void main(String[] args) {
		Scanner sc =null;
		
		File f=new File("C:\\Users\\rvssi\\git\\javaPio2025\\ProyMaven2526\\src\\main\\java\\pio\\daw\\afv\\tema7\\lectura\\canciones\\datosCanciones.txt");
		try {
			sc=new Scanner(f);
			while(sc.hasNextLine()) {
			String line=sc.nextLine();
			String [] subchain=line.split(",");
				Cancion cancion=new Cancion(subchain[0],subchain[1],Integer.parseInt(subchain[2]));
				System.out.println( cancion);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error->"+ e.getMessage());
			e.printStackTrace();
		}finally {
			if(sc!=null)
				sc.close();
		}

	}

}
