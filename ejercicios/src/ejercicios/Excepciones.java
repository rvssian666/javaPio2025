package ejercicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Excepciones {
	static Scanner sc = new Scanner(System.in);
	static int array[] = new int[5];

	public static void main(String[] args) {

		// division();
		// valorNumerico();
		// indiceArreglo();
		// ingreseCractEntero();
		// invoke();//ejercicio 6
		// invokeRaiz();// ejercicio 9
		// annualSalary();// ejercicio 10
		// invokeArrayList();// ejercicio 13
		invokePassword();
	}

	public static void division() {

		System.out.println("Ingrese dos numeros a dividir");
		int num = 0;
		int num1 = 0;
		try {
			num = sc.nextInt();
			num1 = sc.nextInt();
			int i = num / num1;
			System.out.println(i);

		} catch (ArithmeticException e) {
			System.out.println("la division por 0 no esta definida");

		} catch (InputMismatchException input) {
			System.out.println("Ingresa solo  numeros las letras no son admitidas");
		}

	}

	public static void valorNumerico() {
		try {
			System.out.println("Ingresa el valor ");
			int num = sc.nextInt();
		} catch (NumberFormatException number) {
			System.out.println("Solo calores enteros");
		} catch (InputMismatchException input) {
			System.out.println("Ingresa solo numeros ,las letras no son admitidas");

		}

	}

	public static void indiceArreglo() {
		int pos = 0;
		try {
			System.out.println("Ingrese la posicion a la cual desea acceder");
			pos = sc.nextInt();
			System.out.println(array[pos]);

		} catch (ArrayIndexOutOfBoundsException arr) {
			System.out.println("La posicion ingresada esta fuera de rango");
		}

	}

	public static void ingreseCractEntero() {
		String txt = "";
		try {
			System.out.println("Ingresa la cadena de caracteres");
			txt = sc.nextLine();
			if (txt.substring(0, txt.length()) != null) {
				Integer.parseInt(txt);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("La cadena es demasiado corta");

		} catch (NumberFormatException e) {
			System.out.println("No son numeros los 3 primeros caracteres");
		}

	}

	public static void verifyRange(int a) throws EdadInvalidaException {

		if (a > 120 || a < 18) {
			throw new EdadInvalidaException();

		}

	}

	public static void invoke() {
		try {
			int num = 0;
			System.out.println("Ingresa un numero a comprobar si esta en el rango");
			num = sc.nextInt();
			verifyRange(num);

		} catch (EdadInvalidaException e) {
			System.out.println("La edad ingresada es totalmente incorrecta, ingresela nuevamente");

		}
	}

	public static void raizCuadrada(int e) {
		// comprueba si el radical es negativo
		if (e < 0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println("La raiz cuadrada es " + Math.sqrt(e));
		}

	}

	public static void invokeRaiz() {
		try {
			int num = 0;
			System.out.println("Ingrese el numero para calcular su R.Cuadrada");
			num = sc.nextInt();
			raizCuadrada(num);
		} catch (IllegalArgumentException e) {
			System.out.println("El numero no puede ser negativo ");
		}
	}

	public static void verifySalary(float salary) {
		if (salary < 0) {
			throw new IllegalArgumentException();
		}
	}

	public static void annualSalary() {
		float s = 0;
		try {
			System.out.println("Ingresa el salario del empleado");
			s = sc.nextFloat();
			verifySalary(s);
			System.out.println("El salario anual es de : " + s * 14);

		} catch (IllegalArgumentException e) {
			System.out.println("Se ha ingresado una salario incorrecto en negativo");
		}
	}

	public static void searchNumberArray(List<Integer> a, int number) throws ElementoNoEncontradoException {
		// preguntar con respecto a las excepciones personalizadas
		// si hay necesidad de poner siempre THROWS al principio
		// y THROW (hacer que meexplique por que ????   ---RESUELTAAA
		if (!(a.contains(number))) {
			throw new ElementoNoEncontradoException();
		}
	}

	public static void invokeArrayList() {
		List<Integer> arr = new ArrayList<>();
		arr.add(15);
		arr.add(5);
		arr.add(105); // preguntar xq si copio las asignaciones en la class da error
		arr.add(90);
		arr.add(100);
		arr.add(390);
		arr.add(-1);
		arr.add(890);
		try {
			System.out.println("Ingrese el numero a comprobar si esta presente en las lista");
			int number = sc.nextInt();
			searchNumberArray(arr, number);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("El numero que busca no aparece en el listado");
		}

	}

	public static void verifyPassword(String password) {
		for (int i = 0; i < password.length(); i++) {
			if( (password.length() < 8 || !Character.isUpperCase(i) ) && !Character.isDigit(i)) {
				throw new ArithmeticException();
			}

		}

	}

	public static void invokePassword() {
		try {
			System.out.println("Teclee una constraseña fuerte");
			String pass = sc.nextLine();
			sc.nextLine();
			verifyPassword(pass);

		} catch (ArithmeticException e) {
			System.out.println("La contraseña debe contender mayusculas y digitos ..");
		}
	}
}
