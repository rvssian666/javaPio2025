package pio.daw.afv.tema8.javasql;

public class E5Singleton {

	private static E5Singleton instancia;
	public String valor;

	private E5Singleton(String valor) {
		this.valor = valor;
	}

	public static E5Singleton getInstance(String valor) {
		if (instancia == null) { // si no existe lo creo
			instancia = new E5Singleton(valor);
		}
		return instancia;
	}
}
