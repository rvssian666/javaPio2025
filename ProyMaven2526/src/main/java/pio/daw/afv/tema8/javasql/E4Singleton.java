package pio.daw.afv.tema8.javasql;

public class E4Singleton {
	private static E4Singleton single_instance = null;

	// variable de string para guardar datos
	public String cadena;

	// 1-constructor privado
	private E4Singleton() {
		cadena = "Esto es un texto en un singleton";
	}

	// Todo singleton debe tener un método getInstance()
	public static E4Singleton getInstance() {

		// Si no existe lo creo
		if (single_instance == null) {
			single_instance = new E4Singleton();
		}
		// si existe lo devuelvo
		return single_instance;

	}
}
