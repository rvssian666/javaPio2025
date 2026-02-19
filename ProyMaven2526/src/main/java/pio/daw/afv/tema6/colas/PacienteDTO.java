package pio.daw.afv.tema6.colas;

public class PacienteDTO implements Comparable<PacienteDTO> {
	private int telefono;
	private int edad;
	private String nombre;
	private String apellidos;
	private int nivelUrgencias;

	public PacienteDTO(int telefono, int edad, String nombre, String apellidos, int nivelUrgencias) {
		super();
		this.telefono = telefono;
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nivelUrgencias = nivelUrgencias;
	}

	public int getTelefono() {
		return telefono;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getNivelUrgencias() {
		return nivelUrgencias;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNivelUrgencias(int nivelUrgencias) {
		this.nivelUrgencias = nivelUrgencias;
	}

	@Override
	public String toString() {
		return "PacienteDTO [telefono=" + telefono + ", edad=" + edad + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", nivelUrgencias=" + nivelUrgencias + "]\n";
	}

	@Override
	public int compareTo(PacienteDTO otro) {
		/*
		 * Si devuelves un número negativo: El objeto actual (this) es "menor" (va
		 * primero).
		 * 
		 * Si devuelves un número positivo: El objeto actual es "mayor" (va después).
		 * 
		 * Si devuelves cero: Son iguales.
		 */

		return otro.getNivelUrgencias() - this.nivelUrgencias;
	}

}
