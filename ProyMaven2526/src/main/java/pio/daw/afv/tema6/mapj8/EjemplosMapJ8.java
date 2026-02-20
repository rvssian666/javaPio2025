package pio.daw.afv.tema6.mapj8;

import java.util.HashMap;
import java.util.Map;

public class EjemplosMapJ8 {
	public static void main(String[] args) {
		// Métodos básicos
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Primer elemento");
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		// getOrDefault que define un valor a devolver si encuentro la clave
		System.out.println(map1.getOrDefault(2, "El 2 no estaba"));

		// Ejemplo 2 forEach
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Uno");
		map2.put(2, "Dos");
		map2.put(3, "Tres");
		System.out.println("\nIteración con forEach");
		map2.forEach((key, value) -> System.out.println("Clave: " + key + " Valor: " + value));

		// Ejemplo 3 replaceAll
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("Juan", 19);
		map3.put("Pablo", 33);
		map3.put("Pedro", 24);
		System.out.println("\nmap3 al principio: " + map3);
		// quiero sumar 10 a todos los valores
		map3.replaceAll((key, value) -> value + 10);
		System.out.println("map3 tras replaceAll: " + map3);

		// Ejemplo 4 putIfAbsent- inserta el par claeve, si valor si la clave No existe
		// o vale null
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("Juan", 24);
		map4.put("Pablo", 13);
		map4.put("Pedro", 34);
		System.out.println("\nmap4 al principio: " + map4);
		map4.putIfAbsent("Leo", 26); // Inserta mario porque no está
		System.out.println("map4 ahora: " + map4);
		map4.putIfAbsent("Leo", 29); // Inserta mario porque no está
		System.out.println("map4 ahora: " + map4);

		// Ejemplo 5 remove, solo borra si coincide clave y valor
		Map<String, Integer> map5 = new HashMap<>();
		map5.put("Juan", 24);
		map5.put("Pablo", 13);
		map5.put("Pedro", 34);
		System.out.println("\nmap5 al principio: " + map5);
		map5.remove("Juan", 24);
		System.out.println("map5 tras remove: " + map5);

		// Ejemplo 6 computeIfAbsent
		Map<String, Integer> map6 = new HashMap<>();
		map6.put("Juan", 19);
		map6.put("Pablo", 30);
		map6.put("Pedro", 28);
		System.out.println("\nmap6 al principio: " + map6);
		map6.computeIfAbsent("Mario", k -> map6.get("Juan") + 10);
		System.out.println("map6 al final: " + map6);
		map6.computeIfAbsent("Mario", k -> map6.get("Juan") + 10);
		System.out.println("map6 al final: " + map6);
		
		//Ejemplo 7 
		Map<String, Integer> map7 = new HashMap<>();
		map7.put("Juan", 19);
		map7.put("Pablo", 30);
		map7.put("Pedro", 28);
		System.out.println("\nmap7 al principio: " + map7);
		map7.computeIfPresent("Mario", (k, v) -> v + 10);
		System.out.println("map7 tras computerIfPresent: " + map7);
		map7.computeIfPresent("Pablo", (k, v) -> v + 10);
		System.out.println("map7 tras computerIfPresent: " + map7);

		//Ejemplo 8 compute
		Map<String, Integer> map8 = new HashMap<>();
		map8.put("Juan", 19);
		map8.put("Pablo", 30);
		map8.put("Pedro", 28);
		System.out.println("\nmap8 al principio: " + map8);
		map8.compute("Pablo", (k, v) -> (v == null) ? 0 : v+50);
		System.out.println("map7 tras compute: " + map8);
		
		//Ejemplo 9 merge
		Map<String, Integer> map9 = new HashMap<>();
		map9.put("Juan", 19);
		map9.put("Pablo", 30);
		map9.put("Pedro", 28);
		System.out.println("\nmap8 al principio: " + map9);
		//Si no existe simplemente lo añado
		map9.merge("Mario", 22, (vAntiguo, vNuevo) -> vAntiguo + vNuevo);
		System.out.println("map7 tras merge1: " + map9);
		//Si ya esta
		map9.merge("Mario", 22, (vAntiguo, vNuevo) -> vAntiguo + vNuevo);
		System.out.println("map7 tras merge2: " + map9);
		//Si ya esta
	}

}
