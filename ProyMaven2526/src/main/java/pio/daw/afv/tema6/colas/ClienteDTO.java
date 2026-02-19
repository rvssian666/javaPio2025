package pio.daw.afv.tema6.colas;

public class ClienteDTO {
	private int telefono;
	private int edad;
	private String nombre;
	private String apellido;
	
	public ClienteDTO(int telefono, int edad, String nombre, String apellido) {
		super();
		this.telefono = telefono;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getApellido() {
		return apellido;
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

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "ClienteDTO [telefono=" + telefono + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]\n";
	}
	
	
	

}
