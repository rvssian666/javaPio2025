package pio.daw.afv.tema6.agregadas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class EjemploAgregadas {
	/*
	 * LAs operaciones agrgadas son un conjunto de funciones que permiten procesar
	 * colecciones de datos(4 operaciones ) 
	 *  Filtrar --> seleccionar elementos que cumplan una condicion
	 *  Mappear---> aplicar una funcion a los elementos :
	 * -Reduccion ---> aplicar una funcion a un conjunto de datos---> 
	 * ---Ordenar ---> permite ordenar una coleccion
	 */

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("numeros :"+numeros);

		// 1-Calcular la suma de todos los numeros pares de esa lista

		int sumaPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);//expresion lambda por cada numero n en el stream comprueba si el div por 3 es 0
		System.out.println("Valor de la suma: " + sumaPares);
		
		
		/*****************************************/
		
		//Promedio de los numeros impares
		
		double promedioImpares=numeros.stream().filter(n->n%2!=0)//los impares
				.mapToInt(Integer::intValue)//ahora es necesario convertir el flujo a int primitivos
				.average()//calcula la media 
				.orElse(0);//sino hay impares devuelve 0
		
		System.out.println("promedioImpares es :" + promedioImpares);
		
		
		
		//Numero Maximo de la Lista 
		int maximo =numeros.stream().reduce(Integer.MIN_VALUE,Integer::max);
		System.out.println("maximo :"+ maximo);
		
		
		//Numero Minimo de la lista 
		int min=numeros.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("minimo :"+ min);
		
		//Dime cuantos numeros son mayores que 5
		
		long mayoresCinco= numeros.stream().filter(n->n>5).count();
		System.out.println("Son mayores que 5 :-->" + mayoresCinco);
		
		List<String> nombres=Arrays.asList("Ana","Juan","Maria","Pedro","Alicia","Luis","Roberto");
		System.out.println("Lista de nombres : " + nombres);
		
		//Genera una lista ordenada alfabeticamente con los nombres en mayusculas pero solo de los nombres que empiezan por A
		
		//Cosas o tools a usar filter,map,sorted,collect
		List<String> aux =nombres.stream().filter(nombre->nombre.startsWith("A"))//nos quedamos con los que empiezan con A
				.map(String::toUpperCase)//aplicamos el mapeo a todo los elementos filtrados
				.sorted()//ordenados
				.collect(Collectors.toList());
		
		System.out.println("Nombres filtrados que comienzan por A : " + aux);
		
	}

}
