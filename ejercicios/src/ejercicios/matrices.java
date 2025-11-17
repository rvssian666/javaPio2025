package ejercicios;

//import java.util.Arrays;
import java.util.Random;

public class matrices {

	public static void main(String[] args) {
		// Tabla_Bidimencional();
		// SumarMatrices();
		// DiagonalPrincipal();
		// TrasponerMatriz();
		// MatrizMarco();
		//SumarFilasColumnas();

	}

	public static void Tabla_Bidimencional() {

		int[][] matriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = i + j;
			}

		}
		MostrarArray_B(matriz);
		EsMatrizCuadrada(matriz);
	}

	public static void MostrarArray_B(int m[][]) {// se utiliza para mostrar la matriz
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void EsMatrizCuadrada(int mat[][]) {// ejercicio 2

		if (mat.length == mat[0].length) {
			System.out.println("La tabla matriz si es cuadrada");

		} else {
			System.out.println("No es cuadrada");

		}
	}

	public static void SumarMatrices() {// realizado en Curro por eso no llamo a funcion
		Random rd = new Random();
		int[][] mat1 = new int[5][5];
		int[][] mat2 = new int[5][5];
		int sum = 0;
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = rd.nextInt(10);
				mat2[i][j] = rd.nextInt(10);
				sum = mat1[i][j] + mat2[i][j];
				mat1[i][j] = sum;
				System.out.print(mat1[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void DiagonalPrincipal() {

		int[][] matriz7x7 = new int[7][7];
		for (int i = 0; i < matriz7x7.length; i++) {
			for (int j = 0; j < matriz7x7[i].length; j++) {
				if (i == j)
					matriz7x7[i][j] = 1;
				else
					matriz7x7[i][j] = 0;
			}
		}
		MostrarArray_B(matriz7x7);
	}

	public static void TrasponerMatriz() {// mal arreglar
		Random rd = new Random();
		int[][] matriz3x3 = new int[3][3];
		int temp = 0;
		for (int i = 0; i < matriz3x3.length; i++) {
			for (int j = 0; j < matriz3x3[i].length; j++) {
				if (i == j)
					matriz3x3[i][j] = rd.nextInt(15);
				else {
					matriz3x3[i][j] = rd.nextInt(15);
					temp = matriz3x3[i][j];
					matriz3x3[i][j] = matriz3x3[j][i];
					matriz3x3[j][i] = temp;
				}
			}
		}
		MostrarArray_B(matriz3x3);

	}

	public static void MatrizMarco() {
		int[][] matriz = new int[8][6];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || j == matriz[i].length - 1 || j == 0 || i == matriz.length - 1)
					matriz[i][j] = 1;

			}
		}
		MostrarArray_B(matriz);

	}

	public static void SumarFilasColumnas() {
		Random rd = new Random();
		int sum = 0;
		// int sumV=0;
		int[][] tabla = new int[11][11];
		for (int i = 0; i <= tabla.length - 2; i++) {
			for (int j = 0; j <= tabla[i].length - 2; j++) {
				tabla[i][j] = rd.nextInt(8);
				sum += tabla[i][j];
				tabla[i][10] = sum;

				if (j == tabla[i].length - 2) {
					sum = 0;
				}
				tabla[10][j] = SumarColumnas(tabla);
			}
		}
		MostrarArray_B(tabla);

	}

	public static int SumarColumnas(int v[][]) {
		int sumH = 0;// Que es igual a la suma vertical cuando sea traspuesta
		for (int i = 0; i <= v.length - 2; i++) {
			for (int j = 0; j <= v[i].length - 2; j++) {
				sumH += v[j][i];
				if (j == v[i].length - 2) {
					return sumH;
				}

			}
			sumH = 0;

		}
		return 1;

	}
}
