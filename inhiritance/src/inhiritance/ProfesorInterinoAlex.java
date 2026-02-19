package inhiritance;
import java.util.Calendar;

import inhiritance.Asignaturas.ASIGNATURAS;

public class ProfesorInterinoAlex extends ProfesorAlex {
	private  Calendar fechaInicioInterinidad;

	

	public ProfesorInterinoAlex(String paramdniProfesor, String paraMnombre, String paramApellidos, int paramEdad,
			float paramNomina, ASIGNATURAS paraModulo,Calendar paramfechaInicioInterinidad) {
		super(paramdniProfesor, paraMnombre, paramApellidos, paramEdad, paramNomina, paraModulo);
		this.fechaInicioInterinidad=paramfechaInicioInterinidad;
	}



	@Override
	public String toString() {
		return "ProfesorInterinoAlex [fechaInicioInterinidad=" + fechaInicioInterinidad + ", nomina=" + nomina
				+ ", equals()=" + equals() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	

	

	
	
}
