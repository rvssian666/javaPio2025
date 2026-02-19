package practicosOwnEjercicios;

import java.util.UUID;

public abstract class EmpleadoAbstract {
	private String nombre;
	private String apellidos;
	private double salarioBase;
	private String idEmpleado;

	/*
	 * aunque una clase abstracta no se puede instanciar (crear) directamente Se
	 * pude crear un constructor para inicializar
	 * 
	 */
	public EmpleadoAbstract(String nombre, String apellidos, double salarioBase) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salarioBase = salarioBase;
		this.idEmpleado = UUID.randomUUID().toString();
	}

	// este es el metodo abstracto a implementar en las clases hijas
	public abstract double calcularSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		if (this instanceof Gerente) {
			return "Empleado Gerente [nombre=" + nombre + ", apellidos=" + apellidos + ", salarioBase=" + salarioBase
					+ ", idEmpleado=" + idEmpleado + "]";
		} else if (this instanceof Vendedor) {
			return "Empleado Vendedor [nombre=" + nombre + ", apellidos=" + apellidos + ", salarioBase=" + salarioBase
					+ ", idEmpleado=" + idEmpleado + "]";

		} else
			return "EmpleadoAbstract [nombre=" + nombre + ", apellidos=" + apellidos + ", salarioBase=" + salarioBase
					+ ", idEmpleado=" + idEmpleado + "]";

	}

}
