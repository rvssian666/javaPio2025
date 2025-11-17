package ejercicios;

import java.util.Scanner;
import java.util.HashMap;

public class ClassHashMap {
	static HashMap<String, Integer> dicc = new HashMap<>();
	static HashMap<String, String> dicc1 = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// frecuencyWords();
		// counterPrice();
		traslateWord();
	}

	public static void frecuencyWords() {
		// int con = 1;
		String[] text = { "mañana", "mañana", "desayuno", "en", "la", "mañana", "la", "bocata" };
		for (int i = 0; i < text.length; i++) {
			if (dicc.containsKey(text[i])) {
				int con = dicc.get(text[i]);
				con++;
				dicc.put(text[i], con);
			} else
				dicc.put(text[i], 1);
		}
		System.out.println(dicc);
	}

	public static void counterPrice() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese el product");
			String product = sc.nextLine();
			System.out.println("Ingrese el precio del producto añadido");
			int price = sc.nextInt();
			sc.nextLine();
			dicc.put(product, price);

		}
		System.out.println("Ingrese el precio que quieras buscar");
		// utilizar nextLine() para leer hasta el final de la linea despues de leer un
		// entero
		int priceSearch = sc.nextInt();
		sc.nextLine();
		for (String iterator : dicc.keySet()) {
			if (dicc.get(iterator) == priceSearch) {
				System.out.println(dicc.get(iterator));
			}
		}
	}

	public static void traslateWord() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Ingresa la palabra a traducir");
			String word = sc.nextLine();
			System.out.println("Ingresa como se traduce la palabra en otro idioma");
			String traslate = sc.nextLine();
			dicc1.put(word, traslate);
		}
		System.out.println(dicc1);
		traslateInvoke();
	}

	public static void traslateInvoke() {
		System.out.println("ingrese la palabra para buscar su traduccion");
		String w = sc.nextLine();
		for (String i : dicc1.keySet()) {
			if (dicc1.containsKey(w)) {
				System.out.println("La traduccion al español " + dicc1.get(w));
				break;
			}
		}
	}

}
