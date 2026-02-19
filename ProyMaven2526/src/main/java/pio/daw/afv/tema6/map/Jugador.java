package pio.daw.afv.tema6.map;

public class Jugador implements Comparable<Jugador> {
	private int codigo;
	private String nombre;
	private String nombre_equipos;
	private int goles;

	public Jugador(int codigo, String nombre, String nombre_equipos, int goles) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nombre_equipos = nombre_equipos;
		this.goles = goles;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre_equipos() {
		return nombre_equipos;
	}

	public void setNombre_equipos(String nombre_equipos) {
		this.nombre_equipos = nombre_equipos;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", nombre_equipos=" + nombre_equipos + ", goles="
				+ goles + "]\n";
	}

	@Override
	public int compareTo(Jugador otroJugador) {
		//si quisiera saber el pichichi 
		return -1*Integer.compare(goles, otroJugador.goles);
	}

}
