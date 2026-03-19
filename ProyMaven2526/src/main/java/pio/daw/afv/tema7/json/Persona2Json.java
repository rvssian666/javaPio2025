package pio.daw.afv.tema7.json;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Persona2Json {
	static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema7\\json\\";

	public static void main(String[] args) {

		// persona1
		Persona pers1 = new Persona("Pepe", "Perez", 20, Arrays.asList("cine", "musica", "LOL"));
		Persona pers2 = new Persona("Maria", "martinez", 21, Arrays.asList("Futbol", "musica", "Ajedrez"));

		List<Persona> listaPersonasOut = Arrays.asList(pers1, pers2);
		System.out.println("Listado de personas : " + listaPersonasOut);
		Gson gson = new Gson();
		String cadenaPer = gson.toJson(listaPersonasOut);
		System.out.println("Listado de personas en formato JSON \n" + cadenaPer);

		// volcar el fichero a lista de persona
		fromJson2Fich(listaPersonasOut);
		
		//Modificamos el json lo leemos y lo mostrasmos 
		List<Persona> lisPersonasIN=fromFich2Json("personaIN.json");
		System.out.println("Listado de personas en formato JSON leidas desde el Fichero\n" + lisPersonasIN);

	}

	private static List<Persona> fromFich2Json(String sNombreFichero) {
		//Objeto lista persona a devolver
		List<Persona> listaPersonaLeidaFichero = null;
		
		//Instancia GSON 
		Gson gson=new Gson();
		//creamos un readeer para leer el fichero
		try {
			//2-reader para leer el fichero
			Reader reader=Files.newBufferedReader(Paths.get(RUTA_FICH+sNombreFichero));
			//3 convertir el fichero a lista de objetos JSON
			listaPersonaLeidaFichero=Arrays.asList(gson.fromJson(reader, Persona[].class));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaPersonaLeidaFichero;
	}

	private static void fromJson2Fich(List<Persona> listaPersonasOut) {

		try {
			Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH + "persona.json"));
			//Crear instancia de GSON para leeer la cadena 
			Gson gson =new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(listaPersonasOut,writer);
			writer.close();
			System.out.println("Archivo generado correctamente !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
