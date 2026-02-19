package pio.daw.afv.tema6.mapj8;

import java.util.HashMap;
import java.util.Map;

public class EjemplosMapJ8 {
	public static void main(String[] args) {
		// Metodos basicos
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Primer elemento");
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		// getOrDefault que define un valor a devolver si encuentro la clave

		System.out.println(map1.getOrDefault(2, "El 2 no estaba"));

		// Ejmplo 2 forEach
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "uno");
		map2.put(2, "dos");
		map2.put(3, "tres");
		System.out.println("\n Iteracion con forEach");
		map2.forEach((key, value) -> System.out.println("Clave " + key + " Valor" + value));

		// Ejemplo 3 replaceAll
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("juan", 19);
		map3.put("pablo", 30);
		map3.put("pedro", 28);
		System.out.println("\n map3 al principio :" + map3);

		// quiero sumar 10 a todos los valores
		map3.replaceAll((key, value) -> value + 10);
		System.out.println("map3 tras el replaceALL " + map3);

		// ejemplo 4 putIfAbsent = inserta el par calve,valor si la clave No existe o
		// vale Null
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("juan", 19);
		map4.put("isaias", 30);
		map4.put("pedro", 28);
		map4.put("esteban", 28);
		System.out.println("map4 al principio  " + map4);
		map4.putIfAbsent("mario", 26);// mario lo inserta porque no esta
		System.out.println("map4 ahora " + map4);
		map4.putIfAbsent("carlos", 40);
		System.out.println("\nmap4 ahora " + map4);

		// ejmeplo 5 remove , solo borra si coincide clave valor
		Map<String, Integer> map5 = new HashMap<>();
		map5.put("juan", 19);
		map5.put("isaias", 30);
		map5.put("pedro", 28);
		map5.put("esteban", 28);
		System.out.println("map4 al principio  " + map5);
		map5.remove("pedro", 28);
		System.out.println("map5 ahora " + map5);
		System.out.println("\nmap4 ahora " + map5);

		// ejemplo 6
		// ejemplo 7
		// ejemplo 8 compute
		Map<String, Integer> map8 = new HashMap<>();
		map8.put("juan", 19);
		map8.put("isaias", 30);
		map8.put("pedro", 28);
		map8.put("esteban", 28);
		System.out.println("map8 al principio  " + map8);
		map8.compute("isaias", (k, v) -> (v == null) ? 0 : v + 50);
		System.out.println("map8 tras compute " + map8);

	}

}
