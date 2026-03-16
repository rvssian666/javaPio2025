package pio.daw.afv.tema7.json;

import java.util.List;
import java.util.Arrays;

public class Persona2Json {

	public static void main(String[] args) {
		
		//persona1
		Persona pers1=new Persona("Pepe", "Perez", 20, Arrays.asList("cine","musica","LOL"));
		Persona pers2=new Persona("Maria", "martinez", 21, Arrays.asList("Futbol","musica","Ajedrez"));
		
	List<Persona> listaPersonasOut=Arrays.asList(pers1,pers2);
	System.out.println("Listado de personas : "+ listaPersonasOut);
	
	//volcar el fichero a lista de persona 

	}

}
