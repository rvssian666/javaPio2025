package pio.daw.afv.tema6.ownEjercicios;

public class Videojuegos {
	private int id;
	private String titulo;
	private String genero;
	private int año;
	private double precio;
	private double calificacion;

	public Videojuegos(int id, String titulo, String genero, int año, double precio, double calificacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.año = año;
		this.precio = precio;
		this.calificacion = calificacion;
	}

	public Videojuegos() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public int getAño() {
		return año;
	}

	public double getPrecio() {
		return precio;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Videojuegos [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", año=" + año + ", precio="
				+ precio + ", calificacion=" + calificacion + "] \n";
	}

	public int equals(Videojuegos otro) {
		return this.id == otro.getId() ? 1 : 0;
	}

}
