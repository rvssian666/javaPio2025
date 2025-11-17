package POO;

public class Notas {
	private int calificacion;
	private String asignatura;

	public Notas(int calificacion, String asignatura) {
		this.calificacion = calificacion;
		this.asignatura = asignatura;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
