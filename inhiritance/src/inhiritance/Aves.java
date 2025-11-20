package inhiritance;

public class Aves extends Mascotas{
	private boolean pico;
	private boolean vuela;
	public Aves(String nombre, int anyoNacimiento, boolean pico, boolean vuela) {
		super(nombre, anyoNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}
	public boolean isPico() {
		return pico;
	}
	public void setPico(boolean pico) {
		this.pico = pico;
	}
	public boolean isVuela() {
		return vuela;
	}
	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	

}
