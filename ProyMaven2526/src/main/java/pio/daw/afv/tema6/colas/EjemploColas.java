package pio.daw.afv.tema6.colas;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploColas {

	public static void main(String[] args) {
		//Cola normal , por orden de llegada 
		Queue<String> colaDiscoteca= new LinkedList<>();
		
		colaDiscoteca.add("Maria Garcia");
		colaDiscoteca.add("Scoot Bessent");
		colaDiscoteca.add("Guillermo Raunch");
		colaDiscoteca.add("Mike Pence");
		colaDiscoteca.add("Antrophic AI");
		//Imprimir la cola
		
		System.out.println("Estado de la cola "+ colaDiscoteca);
		colaDiscoteca.poll();
		System.out.println("Estado de la cola "+ colaDiscoteca);

	}

}
