package pio.daw.afv.tema7.json;
import com.google.gson.JsonObject;

public class EjemploJson {
	final static String RUTA_FITCH="src\\main\\java\\pio\\daw\\afv\\tema7\\json";

	public static void main(String[] args) {
		
		JsonObject objetoJson1=new JsonObject();
		objetoJson1.addProperty("coche","rojo");
		objetoJson1.addProperty("marca","Ferrari");
		objetoJson1.addProperty("año",2026);
		
		//Objeto 2
		JsonObject objectJson2=new JsonObject();
		objectJson2.add("Mensaje", objectJson2);
		
		///terminar aqui los metrodos y las lineas 

	}

}
