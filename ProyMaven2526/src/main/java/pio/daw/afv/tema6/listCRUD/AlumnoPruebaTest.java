package pio.daw.afv.tema6.listCRUD;

public class AlumnoPruebaTest {

	public static void main(String[] args) {
		// Creamos el DAO que en el constructor carga el json
		AlumnoDAOImplementationAFV daoAlumnos = new AlumnoDAOImplementationAFV();

		try {
			Alumno alumnoQueVoyLeer = daoAlumnos.read(1001);
			System.out.println("Alumno leído: " + alumnoQueVoyLeer);
			// Añadir nuevo alumno
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
