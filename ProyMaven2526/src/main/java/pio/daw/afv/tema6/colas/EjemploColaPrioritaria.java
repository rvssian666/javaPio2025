package pio.daw.afv.tema6.colas;

import java.util.PriorityQueue;

public class EjemploColaPrioritaria {

	public static void main(String[] args) {
		//Cola Prioritaria
		PriorityQueue<Integer> colaPrioritaria= new PriorityQueue<>();
		colaPrioritaria.add(50);
		colaPrioritaria.add(46);
		colaPrioritaria.add(78);
		colaPrioritaria.add(30);
		colaPrioritaria.add(10);
		colaPrioritaria.add(7);
		System.out.println("colaPrioritaria "+ colaPrioritaria);
		
		//Extraer la cola 
		while(!colaPrioritaria.isEmpty()) {
			System.out.println("Elementos de la cola " +colaPrioritaria.poll());
		}
	}

}
