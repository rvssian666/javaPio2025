package Barcoshundidos;

import java.util.Scanner;

public class Jugador {
	private Tablero table;

	public Jugador() {
		table = new Tablero();
	}

	public Disparo attack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la coordenada en X");
		int valorX = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa la coordenada en Y");
		int valorY = sc.nextInt();
		sc.nextLine();
		Disparo d = new Disparo(valorX, valorY);
		return d;
	}

	public void reciveDamage(Disparo D) {
		this.table.reciveDamage(D);

	}
}
