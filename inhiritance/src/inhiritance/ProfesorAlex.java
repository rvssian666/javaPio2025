package inhiritance;



public class ProfesorAlex {

	private String dniProfesor;
	private String nombre;
	private String apellidos;
	private int edad;
	protected float nomina;
	public enum ASIGNATURAS {
		BBDD, MARCAS, PROGRAMACION, ENTORNOS, INTERFACES
	}
	private ASIGNATURAS asignaturas;

	

	public ProfesorAlex(String paramdniProfesor, String paraMnombre, String paramApellidos, int paramEdad,
			float paramNomina, ASIGNATURAS paraModulo) {
		super();
		this.dniProfesor = paramdniProfesor;
		this.nombre = paraMnombre;
		this.apellidos = paramApellidos;
		this.edad = paramEdad;
		this.nomina = paramNomina;
		this.asignaturas=paraModulo;
		

	}

	// El importe de la nomina se calcula sueldo+complementos- deducciones
	public void importeNomina(float paramNomina, float paramComplementos, float paramDeducciones) {
		this.nomina = (paramNomina + paramComplementos) - paramDeducciones;

	}

	// equals devuelve true/false , despues de comprobar el importe de la nomina
	public boolean equals() {

		return true;
	}

}
