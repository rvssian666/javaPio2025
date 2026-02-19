package pio.daw.afv.tema6.listCRUD;

public class TestAlumnoDAOAFV extends AlumnoDAOTestBase {

	@Override
	public AlumnoDAO crearInstancia(String ruta) {
		// TODO Auto-generated method stub
		return new AlumnoDAOImplementationAFV(ruta);
	}

}
