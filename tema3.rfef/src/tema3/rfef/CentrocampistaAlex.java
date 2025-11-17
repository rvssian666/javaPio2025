package tema3.rfef;

public class CentrocampistaAlex {
	private String nombre;
	private int edad;
	private int numAsistencias;
	public CentrocampistaAlex(String nombre, int edad, int numAsistencias) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numAsistencias = numAsistencias;
	}
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumAsistencias() {
		return numAsistencias;
	}
	public void setNumAsistencias(int numAsistencias) {
		this.numAsistencias = numAsistencias;
	}
	@Override
	public String toString() {
		return "CentrocampistaAlex [nombre=" + nombre + ", edad=" + edad + ", numAsistencias=" + numAsistencias + "]";
	}
	
	

}
