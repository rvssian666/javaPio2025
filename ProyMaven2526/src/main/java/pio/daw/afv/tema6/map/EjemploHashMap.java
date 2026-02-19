package pio.daw.afv.tema6.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

	public static void main(String[] args) {
		// 1-Estrurctura de un HashMap<Clave,valor>
		HashMap<String, Integer> puntuaciones = new HashMap<>();

		// 2.Insertar elementos en el HashMap
		puntuaciones.put("Ana", 9);
		puntuaciones.put("Juan", 2);
		puntuaciones.put("Luis", 6);
		puntuaciones.put("Claudia", 4);
		System.out.println("Puntuaciones " + puntuaciones);

		// 3. ver las notas de luis
		int iNotaLuis = puntuaciones.get("Luis");
		System.out.println("Nota de Luis: " + iNotaLuis);

		// 4-Comprobar si existe la clave
		if (puntuaciones.containsKey("Claudia")) {
			System.out.println("Nota de Claudia " + puntuaciones.get("Claudia"));

		}

		// 5. Comprobar si existe un valor ?Hay Alguien con un 9?
		if (puntuaciones.containsValue(9)) {
		}
		System.out.println("Si que hay alguien con un 9");
		// 6-Actualizar un valor
		puntuaciones.put("Juan", 5);
		System.out.println("Puntuaciones " + puntuaciones);

		// 7-Borrar elementos , o un elemento
		puntuaciones.remove("Luis");
		System.out.println("Puntuaciones: " + puntuaciones);

		// 8-Tamaño del HashMap
		System.out.println("Tamaño de las puntuaciones " + puntuaciones.size());

		// 9-Recorrer el HashMap
		for (Map.Entry<String, Integer> entrada : puntuaciones.entrySet()) {
			String clave = entrada.getKey();
			int valor = entrada.getValue();
			System.out.println("clave " + clave + " valor " + valor);

		}

	}

}
