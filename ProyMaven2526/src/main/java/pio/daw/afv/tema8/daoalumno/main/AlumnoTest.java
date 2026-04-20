package pio.daw.afv.tema8.daoalumno.main;

import java.sql.Connection;
import java.sql.SQLException;

import pio.daw.afv.tema8.daoalumno.dao.AlumnoDAOImplementation;
import pio.daw.afv.tema8.daoalumno.model.Alumno;
import pio.daw.afv.tema8.daoalumno.util.DatabaseConnection;

public class AlumnoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciamos el objeto AlumnoDAOImplementation
		AlumnoDAOImplementation alumnoDAO = new AlumnoDAOImplementation();

		try {
			// Pedimos una conexión a la base de datos
			Connection conn = DatabaseConnection.getInstance().getConnection();

			// Voy a insertar un alumno
			Alumno nuevoAlumno = new Alumno("PepeDAO", "2000-01-01", 8.5f, "Primero");

			int nuevoId = alumnoDAO.create(nuevoAlumno, conn);
			System.out.println("Alumno insertado con ID: " + nuevoId);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
