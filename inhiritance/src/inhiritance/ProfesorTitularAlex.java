package inhiritance;

import inhiritance.Asignaturas.ASIGNATURAS;

public class ProfesorTitularAlex extends ProfesorAlex {
	private int annosAntiguedad;

	

	public ProfesorTitularAlex(String paramdniProfesor, String paraMnombre, String paramApellidos, int paramEdad,
			float paramNomina, ASIGNATURAS paraModulo) {
		super(paramdniProfesor, paraMnombre, paramApellidos, paramEdad, paramNomina, paraModulo);
		
	}



	@Override
	public String toString() {
		return "ProfesorTitularAlex [annosAntiguedad=" + annosAntiguedad + ", nomina=" + nomina + "]";
	}
	
	

}
