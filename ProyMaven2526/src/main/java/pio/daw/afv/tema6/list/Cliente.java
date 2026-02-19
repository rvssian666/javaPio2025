package pio.daw.afv.tema6.list;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente>{
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;

	public Cliente(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	

	public Cliente(String dni) {
		super();
		this.dni = dni;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public int compareTo(Cliente objComparar) {
		
		return dni.compareTo(objComparar.getDni());
	}

}
