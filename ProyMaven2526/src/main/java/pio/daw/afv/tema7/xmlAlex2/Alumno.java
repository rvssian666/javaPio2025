
package pio.daw.afv.tema7.xmlAlex2;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "alumno")
@XmlType(propOrder = { "id", "nombre", "apellido", "notaMedia" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumno {

	@XmlElement(name = "id")
	private int id;

	@XmlElement(name = "nombre")
	private String nombre;

	@XmlElement(name = "apellido")
	private String apellido;

	@XmlElement(name = "notaMedia")
	private double notaMedia;

	// Constructores
	public Alumno() {
	}

	public Alumno(int id, String nombre, String apellido, double notaMedia) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaMedia = notaMedia;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", notaMedia=" + notaMedia + "]";
	}
}