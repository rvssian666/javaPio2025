package pio.daw.afv.tema8.javasql;

public class E4SingletonTest {

	public static void main(String[] args) {
		// creo una clase Singleton
		E4Singleton clase1 = E4Singleton.getInstance();
		System.out.println("clase1: " + clase1.hashCode());
		E4Singleton clase2 = E4Singleton.getInstance();
		System.out.println("clase1: " + clase2.hashCode());
		E4Singleton clase3 = E4Singleton.getInstance();
		System.out.println("clase1: " + clase3.hashCode());

	}

}
