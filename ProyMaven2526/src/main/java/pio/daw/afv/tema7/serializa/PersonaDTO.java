package pio.daw.afv.tema7.serializa;

import java.io.Serializable;

public class PersonaDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4387595865253355339L;
	private String nombre;
	private int edad;

	public PersonaDTO(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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

	@Override
	public String toString() {
		return "PersonaDTO [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
