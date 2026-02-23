package pio.daw.afv.tema6.colas;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EjemploColaPrioritaria {

	public static void main(String[] args) {
		// Cola Prioritaria
		PriorityQueue<Integer> colaPrioritaria = new PriorityQueue<>();
		colaPrioritaria.add(50);
		colaPrioritaria.add(46);
		colaPrioritaria.add(78);
		colaPrioritaria.add(30);
		colaPrioritaria.add(10);
		colaPrioritaria.add(7);
		System.out.println("colaPrioritaria " + colaPrioritaria);

		// Extraer la cola
		/*
		 * while (!colaPrioritaria.isEmpty()) {
		 * System.out.println("Elementos de la cola " + colaPrioritaria.poll()); }
		 */
		List<Integer> nuevaListaXCola = colaPrioritaria.stream().filter(e -> e > 10).map(e -> (e + 5))
				.collect(Collectors.toList());
		
		long cantElementos=colaPrioritaria.stream().count();
		System.out.println("----------------Cantidad e elmentos " + cantElementos);
		System.out.println(nuevaListaXCola);
	}

}
