package pio.daw.afv.tema7.json;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class EjemploJson {
	final static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema7\\json";

	public static void main(String[] args) {
/*
		JsonObject objetoJson1 = new JsonObject();
		objetoJson1.addProperty("coche", "rojo");
		objetoJson1.addProperty("marca", "Ferrari");
		objetoJson1.addProperty("año", 2026);

		// Objeto 2
		JsonObject objectJson2 = new JsonObject();
		objectJson2.add("Mensaje", objetoJson1);

		// Añadimos el mensaje dentro del objetoJson1
		objetoJson1.add("Mensaje", objectJson2);
		System.out.println("Mi objeto JSON: " + objetoJson1);
		JsonArray jsonArrayRevisiones = new JsonArray();
		jsonArrayRevisiones.add("Enero");
		jsonArrayRevisiones.add("Febrero");
		jsonArrayRevisiones.add("Marzo");
		objetoJson1.add("revisiones", jsonArrayRevisiones);
		System.out.println("Mi objeto JSON: " + objetoJson1);
		// Volcamos el json a fichero
		escribir2Fichero(objetoJson1);
		*/
		JsonObject objectJson1 = new JsonObject();
        objectJson1.addProperty("coche", "rojo");
        objectJson1.addProperty("marca", "Ferrari");
        objectJson1.addProperty("año", "2026");
        // Objeto 2
        JsonObject objectJson2 = new JsonObject();
        objectJson2.addProperty("propietario", "este es mi coche");
 
        // Añadimos el mensaje dentro del objetoJson1
        objectJson1.add("mensaje", objectJson2);
 
        JsonArray jsonArrayRevisiones = new JsonArray();
        jsonArrayRevisiones.add("Enero");
        jsonArrayRevisiones.add("Junio");
        jsonArrayRevisiones.add("Noviembre");
        objectJson1.add("revisiones",jsonArrayRevisiones);
        System.out.println("Mi objeto JSON: "+objectJson1);
 
        // Volcamos el JSON a fichero
        escribir2Fichero(objectJson1);
	}

	private static void escribir2Fichero(JsonObject objetoJson1) {
		try {
			FileWriter file = new FileWriter(RUTA_FICH + "ejemplo.json", StandardCharsets.UTF_8);
			file.write(objetoJson1.toString());
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
