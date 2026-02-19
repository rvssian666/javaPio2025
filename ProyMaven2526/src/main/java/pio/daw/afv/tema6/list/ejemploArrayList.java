package pio.daw.afv.tema6.list;

import java.util.ArrayList;
import java.util.List;

public class ejemploArrayList {

	public static void main(String[] args) {

		List<String> listaNombres = new ArrayList<>();

		// agregar elementos
		listaNombres.add("Ana");
		listaNombres.add("Carlos");
		listaNombres.add("Sofía");
		listaNombres.add("Carlos");
		System.out.println("Tamaño del arrayList " + listaNombres.size());
		System.out.println("Primer elemento de la lista " + listaNombres.get(0));
		System.out.println("Tercer elemento de la lista " + listaNombres.get(2));
		//recorrer el array
		for(String nombre:listaNombres) {
			System.out.println(nombre+"\t");
		}
		if(listaNombres.contains("Sofia")) {
			System.out.println("n\si que esta sofia");
		}
		//eliminar 
		listaNombres.remove("Carlos");
		System.out.println("Lista de nombres: "+listaNombres);
		
		
	}

}
