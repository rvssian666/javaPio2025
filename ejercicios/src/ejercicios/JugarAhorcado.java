package ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JugarAhorcado {

	public static void main(String[] args) {
		int contVidas = 5;
		String palabraOculta = pedirPalabraOculta();
		String[] progresoPalabra = new String[palabraOculta.length()];
		List<String> historialLetra = new ArrayList<String>();
		while (comprobarSiHeGanado(palabraOculta, progresoPalabra) || comprobarPerdido(contVidas)) {
			String letra = pedirLetra();
			while (comprobarLetraHistorial(letra, historialLetra)) {
				System.out.println("La letra que introduces ya esta en el historial");
				letra=pedirLetra();
			}
			agregarLetraHistorial(letra, historialLetra);
			ponerLetra(progresoPalabra, letra, letra); //comprobar que la letra existe en la palabra oculta(implementarlo)
		}
	}

	public static String pedirLetra() {
		String letter = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la letra ...");
		letter = sc.nextLine();
		while (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
			System.out.println("Ingresa solo caracter y que no sea numero");
			letter = sc.nextLine();
		}

		return letter;

	}

	public static int restarVidas(int contV) {
		return contV--;

	}

	public static boolean comprobarPerdido(int contVidas) {
		return contVidas == 0;
	}

	public static void ponerLetra(String[] pp, String letra, String PO) {
		for (int i = 0; i < PO.length(); i++) {
			if (PO.charAt(i) == letra.charAt(0)) {
				pp[i] = letra;
			}

		}
	}

	public static void agregarLetraHistorial(String l, List<String> hl) {

		hl.add(l);
	}

	public static boolean comprobarLetraHistorial(String l, List<String> hl) {

		return hl.contains(l);

	}

	public static void printInfo(String[] pp, List<String> historyList) {// imprime la info de el progreso y los
																			// intentos
		System.out.println("Mostrando progreso de la palabra");
		for (String i : pp) {
			System.out.println(i);
		}
		System.out.println("Intentos ....");
		for (String j : historyList) {
			System.out.println(j);
		}

	}

	public static String pedirPalabraOculta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escrible la palabra a adivinar");
		String a = sc.nextLine();
		sc.close();
		return a;
	}

	public static boolean comprobarSiHeGanado(String po, String[] pp) {
		for (int i = 0; i < pp.length; i++) {
			// llevar un character a string
			if (!pp[i].equals(po.charAt(i) + "")) {
				return false;
			}
		}
		return true;
	}
}
