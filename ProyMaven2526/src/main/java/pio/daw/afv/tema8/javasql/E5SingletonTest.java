package pio.daw.afv.tema8.javasql;

public class E5SingletonTest {

	public static void main(String[] args) {
		E5Singleton unSingleton = E5Singleton.getInstance("Texto del primer Singleton");
		E5Singleton otroSingleton = E5Singleton.getInstance("Texto del segundo Singleton");
		E5Singleton tercerSingleton = E5Singleton.getInstance("Texto del tercer Singleton");

		System.out.println("Valor=" + unSingleton.valor);
		System.out.println("Valor=" + otroSingleton.valor);
		System.out.println("Valor=" + otroSingleton.valor);

	}

}
