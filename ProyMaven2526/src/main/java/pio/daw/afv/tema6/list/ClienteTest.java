package pio.daw.afv.tema6.list;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClienteTest {

	public static void main(String[] args) {

		Cliente persona1 = new Cliente("12345678A", "Alex Torres", LocalDate.of(1995, 5, 12));
		Cliente persona2 = new Cliente("87654321B", "Beatriz Luna", LocalDate.of(2002, 11, 28));
		Cliente persona3 = new Cliente("45678912C", "Carlos Ruiz", LocalDate.of(1988, 3, 15));
		Cliente persona4 = new Cliente("98765432D", "Diana Sanz", LocalDate.of(2010, 7, 4));

		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(persona1);
		listaClientes.add(persona2);
		listaClientes.add(persona3);
		listaClientes.add(persona4);
		System.out.println("Lista de clientes: " + listaClientes);
		/*
		 * Iterador es una interfaz java que permita recorrer colecciones como listas ,
		 * elemento a elemento
		 * 
		 */
		// Forma 1 de buscar
		Iterator<Cliente> iterator = listaClientes.iterator();
		// vamos a buscar el cliente con DNI 1234555Y
		boolean bEncontrado = false;
		while (!bEncontrado && iterator.hasNext()) {
			Cliente cliTMP = iterator.next();
			if (cliTMP.getDni().equals("1234555Y")) {
				bEncontrado = true;
				iterator.remove();
			}
		}
		// Forma 2
		// Collections.binarySearch(listaClientes,new Cliente("45678912C", "Carlos
		// Ruiz", LocalDate.of(1988, 3, 15)));
		int indice = Collections.binarySearch(listaClientes, new Cliente("45678912C"));
		System.out.println("indice " + indice);
		listaClientes.remove(indice);
		// Forma 3
		listaClientes.removeIf(Cliente -> Cliente.getDni().equals("12345678A"));
		
		Cliente persona5 = new Cliente("56781234E", "Elena Marín", LocalDate.of(1975, 9, 20));
		Cliente persona6 = new Cliente("34127856F", "Fernando Giner", LocalDate.of(2005, 1, 10));
		Cliente persona7 = new Cliente("21436587G", "Gloria Fuertes", LocalDate.of(1990, 12, 5));
		Cliente persona8 = new Cliente("87564312H", "Hugo Sánchez", LocalDate.of(1982, 6, 30));
		Cliente persona9 = new Cliente("13572468I", "Irene Montero", LocalDate.of(2012, 4, 18));
		Cliente persona10 = new Cliente("24681357J", "Javier López", LocalDate.of(1968, 8, 25));

		// Añadiéndolos a tu lista actual
		listaClientes.add(persona5);
		listaClientes.add(persona6);
		listaClientes.add(persona7);
		listaClientes.add(persona8);
		listaClientes.add(persona9);
		listaClientes.add(persona10);
		
		System.out.println("Lista de Clientes : "+listaClientes);
		
		Collections.sort(listaClientes);
		System.out.println("Lista de clientes Tras Ordenar "+listaClientes);
		
	}
	
	

}
