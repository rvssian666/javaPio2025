package inhiritance;

public class Loro extends Aves {
	private String origen;

	public Loro(String nombre, int anyoNacimiento, boolean pico, boolean vuela, String origen) {
		super(nombre, anyoNacimiento, pico, vuela);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
