package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class doing {

	public static void main(String[] args) {
		List<String> list = buildListString();
		List<Integer> l = buildListInteger();// toda ArrayList es una Lista pero no viceversa
		// ejercicio2();
		// exe3(list);
		// EliminarDatos();
		//Exercise5(l);
		//filtrarPares();
		randomisarArray();

	}

	public static List<String> buildListString() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ibiza");
		list.add("Castejon");
		list.add("Extremadura");
		list.add("Madrid");
		list.add("Valencia");
		return list;
	}

	public static List<Integer> buildListInteger() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(3);
		l.add(18);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(10);
		l.add(9);
		l.add(9);
		return l;
	}

	public static void ejercicio2() {

		List<String> list = buildListString();
		list.add("JavaScript");
		list.add("CSS");
		list.add("Boostrap");
		System.out.println(list.get(0));
		System.out.println(list.get(2));

	}

	public static void exe3(List<String> l) {

		l.set(2, "Japan");
		System.out.println(l);
	}

	private static void Exercise5(List<Integer> list) {
		// ArrayList<Integer> lista = buildListInteger();

		Collections.sort(list);// biblotc. para ordenar AList ascendente
		for (int i : list) {
			System.out.println(i);
		}

	}

	public static void EliminarDatos() {
		List<Integer> lst = new ArrayList<>();
		lst.add(15);
		lst.add(12);// preguntar que ocurre si hay dos elementos en el arraylist iguales dos 1
		lst.add(17);
		lst.add(8);
		lst.add(1);
		lst.add(3);
		lst.add(10);
		lst.add(1);
		// System.out.println(lst);
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i) == 1) {
				System.out.println(i);

			}

		}

	}

	public static void filtrarPares(){
	      
        List<Integer> list=buildListInteger();
      
        List<Integer> copy=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0)
             copy.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(copy);
        
    }
	public static void randomisarArray(){
        List<Integer> list=new ArrayList<>();
        List<Integer> copy=new ArrayList<>();
        Random aleatorio=new Random();
        list.add(aleatorio.nextInt(100));
        list.add(aleatorio.nextInt(100));
        list.add(aleatorio.nextInt(100));
        list.add(aleatorio.nextInt(100));
        list.add(aleatorio.nextInt(100));
         for(int i =0;i<list.size();i++){
             if(list.get(i)>50)
             copy.add(list.get(i));
             
         }
         System.out.println(list);
         System.out.println(copy);
    }
}
/*
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Ingrese la cantidad de filas de la figura");
 * 
 * int height = sc.nextInt(); System.out.println("Ingrese el caracter "); char a
 * = sc.next().charAt(0); for (int i = height; i >= 1; i--) { for (int j = 1; j
 * < i; j++) { System.out.print(a); } System.out.println(a);// es el que imprime
 * el ultimo caracter en cada linea
 * 
 * 
 * 
 * 
 * } sc.close();
 */
