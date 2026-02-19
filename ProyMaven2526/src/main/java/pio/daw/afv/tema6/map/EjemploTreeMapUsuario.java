package pio.daw.afv.tema6.map;

import java.util.Map;
import java.util.TreeMap;

import pio.daw.afv.tema6.listCRUD.Alumno;

public class EjemploTreeMapUsuario {

	public static void main(String[] args) {
		//1- Creamos un TreeMap con DNI como campo clave 
		//y el propio objeto usuario como valor
		
		//cambie String como clave ha , -->integer porque no tenia la clase Usuario implementada 
		//utilice la clase Alumno
		TreeMap<Integer,Alumno> usuariosPorDNI=new TreeMap<>();
		
		// 1. Creación de los 6 objetos Alumno
        Alumno a1 = new Alumno(101, "Adrian", "Gomez", "DAM", "Aula 2.1");
        Alumno a2 = new Alumno(102, "Beatriz", "Lopez", "DAW", "Aula 1.5");
        Alumno a3 = new Alumno(103, "Carlos", "Sanz", "ASIR", "Aula 3.2");
        Alumno a4 = new Alumno(104, "Daniela", "Reyes", "DAM", "Aula 2.1");
        Alumno a5 = new Alumno(105, "Esteban", "Puerta", "DAW", "Aula 1.5");
        Alumno a6 = new Alumno(106, "Fernando", "Moro", "ASIR", "Aula 3.2");

        // 2. Inserción en el TreeMap (Clave: NiE, Valor: Objeto Alumno)
        usuariosPorDNI.put(a1.getNia(), a1);
        usuariosPorDNI.put(a2.getNia(), a2);
        usuariosPorDNI.put(a3.getNia(), a3);
        usuariosPorDNI.put(a4.getNia(), a4);
        usuariosPorDNI.put(a5.getNia(), a5);
        usuariosPorDNI.put(a6.getNia(), a6);

        // Prueba rápida: imprimir el tamaño
        System.out.println("Alumnos : " + usuariosPorDNI);
        
        //3.Recorrer 
        for (Map.Entry<Integer, Alumno> entrada : usuariosPorDNI.entrySet()) {
			int nie = entrada.getKey();
			Alumno alumno = entrada.getValue();
			System.out.println("NIE "+ nie + "alumno " + alumno );
			
		}
        //Buscar el alumno por NIe "101"
		Alumno alumBuscado= usuariosPorDNI.get(101);
        System.out.println("Alumno Buscado :" + alumBuscado);
		

	}

}
