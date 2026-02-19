package pio.daw.afv.tema6.listCRUD;

public class Alumno implements Comparable<Alumno>{
	private int nia;
	private String nombre;
	private String apellido;
	private String ciclo;
	private String aula;
	public Alumno(int nia, String nombre, String apellido, String ciclo, String aula) {
		super();
		this.nia = nia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciclo = ciclo;
		this.aula = aula;
	}
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", apellido=" + apellido + ", ciclo=" + ciclo + ", aula="
				+ aula + "]";
	}
	public int getNia() {
		return nia;
	}
	public void setNia(int nia) {
		this.nia = nia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	@Override
	public int compareTo(Alumno otroAlumno) {
		return Integer.compare(nia, otroAlumno.getNia());
	}

}
