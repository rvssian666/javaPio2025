package pio.daw.afv.tema6.mapj8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComparaMap {

	public static void main(String[] args) {
		// tengo una lsita de nombres y queremos contra
		// cuantas veces aparece cada uno en el map
		List<String> lenguajes = List.of("Java", "Kotlin", "Python", "Java", "C++");
		System.out.println("Lenguajes " + lenguajes);
		// Estructura para guardar por cada lenguaje cuantos hay
		Map<String, Integer> contadorLenguajes1 = new HashMap<>();
		// Forma 1
		for (String lengTemp : lenguajes) {
			if (contadorLenguajes1.containsKey(lengTemp))
				contadorLenguajes1.put(lengTemp, contadorLenguajes1.get(lengTemp) + 1);

			else {
				contadorLenguajes1.put(lengTemp, 1);
			}
		} // fin "for"

		// Forma 2 con merge
		Map<String, Integer> contadorLenguajes2 = new HashMap<>();
		lenguajes.forEach(n ->
		// si el valor no exite por 1 sino suma+1
		contadorLenguajes1.merge(n, 1, Integer::sum));
		System.out.println("contadorLenguajes2 " + contadorLenguajes2);
		
		
		//Forma 3 con Streams
		Map<Object,Long> contadorLenguajes3 =lenguajes.stream().
													collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println("\nContadorLenguajes3 " + contadorLenguajes3);
	}

}
