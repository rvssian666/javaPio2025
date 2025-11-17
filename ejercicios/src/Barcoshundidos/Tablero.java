package Barcoshundidos;

import java.util.Random;

public class Tablero {
	private Celda[][] matriz;
	private int cantBarcos;

	public Tablero() {
		// Creando el tablero de tipo celda 4X4
		matriz = new Celda[4][4];
		// Ahora inicializo los valores a Agua en todas las casillas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; i < matriz[i].length; j++) {
				matriz[i][j] = Celda.AGUA;
			}
		}
		colocarBarcos();
	}

	public void showField() {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; i < matriz[i].length; j++) {
				System.out.println(matriz[i][j].getComentario() + " ");
			}
		}
	}

	public  void checkShot(Disparo shot) {
		if (matriz[shot.getX()][shot.getY()].equals(Celda.BARCO)) {
			matriz[shot.getX()][shot.getX()] = Celda.HUNDIDO;
		} else if (matriz[shot.getX()][shot.getY()].equals(Celda.AGUA)) {
			matriz[shot.getX()][shot.getX()] = Celda.FALLIDO;

		}

	}

	public void colocarBarcos() {
		Random ramdom = new Random();

		while (this.cantBarcos < 5) {
			int x = ramdom.nextInt(4);
			int y = ramdom.nextInt(4);
			if (matriz[x][y] == Celda.AGUA) {
				matriz[x][y] = Celda.BARCO;
				cantBarcos++;
			}

		}
	}

	public void reciveDamage(Disparo d) {
		
		
	}

}
