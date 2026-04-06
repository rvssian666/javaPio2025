package pio.daw.afv.tema7.xmlAlex;

public class Empleado {
	private int numEmpleado;
	private String nombre;
	private String apellido;
	private String gmail;
	private String departamento;
	public Empleado(int numEmpleado, String nombre, String apellido, String gmail, String departamento) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.gmail = gmail;
		this.departamento = departamento;
	}
	
	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", gmail="
				+ gmail + ", departamento=" + departamento + "]";
	}
	
	
}
