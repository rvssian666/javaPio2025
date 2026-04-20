package pio.daw.afv.tema8.daoalumno.model;

public class Alumno {
	private int num;
	private String nombre;
	private String Fnac;
	private float media;
	private String curso;

	public Alumno() {
		super();
	}

	public Alumno(int num, String nombre, String fnac, float media, String curso) {
		super();
		this.num = num;
		this.nombre = nombre;
		this.Fnac = fnac;
		this.media = media;
		this.curso = curso;
	}
	

	public Alumno(String nombre, String fnac, float media, String curso) {
		super();
		this.nombre = nombre;
		Fnac = fnac;
		this.media = media;
		this.curso = curso;
	}

	public int getNum() {
		return num;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFnac() {
		return Fnac;
	}

	public float getMedia() {
		return media;
	}

	public String getCurso() {
		return curso;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFnac(String fnac) {
		this.Fnac = fnac;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [num=" + num + ", nombre=" + nombre + ", fnac=" + Fnac + ", media=" + media + ", curso=" + curso
				+ "]";
	}

}
