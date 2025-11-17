package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class arrays_ex {

	public static void main(String[] args) {
		// Promedio();//ejercicio 2
		// muestraNumPares();//ejercicio 3
		//ImprimirMayorMenor();//ejrcicio 5 
		//ContarNumArray();
		RotarNumeros();
		// ArrayResultado();
	   // PromedioArray();
	  //  System.out.printf("El promedio es "+ PromedioArray());
	   //DesviacionE();
	  // SumaArrayTercero();
		
	}

	public static int[] arrayEntero(int tamaño, int numMax) {// crea un array con valores random
		int[] aux = new int[tamaño]; // se le pasa por parametro tamaño,y numero maximo de numeros
		Random rd = new Random();

		for (int i = 0; i < tamaño; i++) {
			aux[i] = rd.nextInt(numMax);
		}
		System.out.println(Arrays.toString(aux));
		return aux;
	}

	public static void Promedio() {

		float sum = 0;

		double[] array = { 5, 8, 10, 18, 3 };
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}

		System.out.println("El promedio de los numeros del array es " + sum / array.length);
	}

	public static void muestraNumPares() {
		int[] array = arrayEntero(10, 100);
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + ",");
			}

		}
	}

	public static void ImprimirMayorMenor() {// ejercicio 5
		int[] array = arrayEntero(10, 50);// int [] array= {25,5,29,10,33,50};
		int mayor = 0;
		int menor = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] >= mayor) {
				mayor = array[i];

			}

			if (array[i] <= menor)
				menor = array[i];

		}
		System.out.println("El mayor numero es  " + mayor + " y el menor  " + menor);
	}
	
	public static void ContarNumArray() {
		int cont=0;
		int numDado=18;
		int []array={4,5,9,18,25,66,18,18,23,18};//arrayEntero(10,50);
		for(int i=0;i<array.length;i++) {
			if(array[i]==numDado)
				cont++;
			
		}
		if(cont==0)
			System.out.println("No aparece ese numero en elarray");
		
		System.out.println("el numero aparece "+ cont);
		
	}
	public static void RotarNumeros() {
		int [] array= {45,20,10,5,0,8,-2};
		int countR=array.length-1;
		int temp=0;
		for (int i=0;i<array.length;i++) {
			if (i==countR) {
				//System.out.println(Arrays.toString(array));
				break;
			} else if( countR-i==1) {
				temp=array[i];
			array[i]=array[countR];
			array[countR]=temp;
			break;	
			}temp=array[i];
			array[i]=array[countR];
			array[countR]=temp;
			countR--;
		}System.out.println(Arrays.toString(array));
	}
	 
 
 public static void ArrayResultado(){
     int [] first={5,7,0,10,35};
     int [] second={70,0,13,6,45};
     int [] result=new int[10];
        System.arraycopy(first, 0, result, 0, first.length);
     System.arraycopy(second, 0, result, first.length, second.length);
     System.out.println(Arrays.toString(result));
 }
 public static float PromedioArray(){
     float sum=0;
     int cont=0;
     double [] array={1.75,1.89,1.70,1.78,1.85,1.85};
     for(int i=0;i<array.length;i++){
         sum+=array[i];
         cont++;
     }
     return sum/cont;
 }
 
 public static void DesviacionE(){
     double [] array={1.75,1.89,1.70,1.78,1.85,1.85};
     double s=0;
     double SumAlg=0;
     for(int i=0;i<array.length-1;i++){
         SumAlg+= (array[i]-PromedioArray())*(array[i]-PromedioArray());
     }
     s= Math.sqrt (SumAlg/(array.length-1));//ojo preguntar xq no funciona con el -1 devuelve NaN
     System.out.println("La desviacion estándar de la muestra es "+ s);
     
 }
 
 public static void SumaArrayTercero(){//ultimo ejercicios 
     int[] array1={5,8,9,10,45};
     int[] array2={34,12,0,5,23};
     int [] resultado=new int[5];
     for(int i=0;i<array1.length;i++){
         resultado[i]=array1[i]+array2[i];
     }
     System.out.println(Arrays.toString(resultado));
 }

}
