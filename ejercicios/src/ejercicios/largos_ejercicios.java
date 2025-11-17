package ejercicios;

import java.util.Scanner;

public class largos_ejercicios {

	public static void main(String[] args) {
		// MostrarCuadrado();
		float sum = 0;
		int cont = 0;
		float resultado = 0;
		//CalMediaAritmetica(sum, cont, resultado);
	    // UnoA_N();

	}

	public static void LeerNumero() { // Creada con el objetivo de invoke varias veces
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número:");
		 float num = sc.nextFloat();
				 sc.nextLine();
	}

	public static void MostrarCuadrado() {// ejercicio 1 2da pagina
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número:");
		float a = sc.nextFloat();
		 sc.nextLine();
		if (a < 0)
			System.out.println("Stop");
		else {
			 
			System.out.println("La potencia de ese numero =" + a*a);
			MostrarCuadrado();
		}
		sc.close();
	}

	public  static void CalMediaAritmetica(float sum, int cont, float resultado) {
		// float num=0;
		// float sum=0;           ---->Preguntar sobre el alcance de las variables 
		                               //Si hay otra manera de hacerlo 
		// int cont=0;
		// float resultado=0;
		// LeerNumero();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número:");
		float num = sc.nextFloat();
		 sc.nextLine();

		if (num > 0) {
			sum += num ;
			cont++;
			resultado = sum / cont;
			CalMediaAritmetica(sum, cont, resultado);
		} else
			System.out.println("La media aritmetica es " + resultado);
			sc.close();
		
	}
	/*
	 * public static void CalMediaAritmetica() { float sum=0; float resultado=0; int
	 * cont=0; Scanner sc=new Scanner(System.in);
	 * System.out.println("Ingrese el número:"); float num ;
	 * 
	 * do { num= sc.nextFloat(); sum+=num; cont++; resultado=sum/cont; }
	 * 
	 * while(num>0);
	 * 
	 * }
	 */

	
	 public static void UnoA_N() { 
		 Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el número:");
			 float num = sc.nextFloat();
	  for(int i=1;i<num+1;i++) {
		  System.out.print(""+ i +"" );
	 } 
	  
	 }
	 

}
