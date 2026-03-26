package pio.daw.afv.tema8.javasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E1Insert {
	// Constantes de conexion
	private static final String URL = "jdbc.mysql://localhost/instituto";
	private static final String USER = "alumno";
	private static final String PASSWORD = "0123456789";

	// SQL a ejecutar en la base de datos
	private static final String sentencia = "INSERT INTO alumnos (nombre,fnac,media,curso) VALUE (?,?,?, ?)";

	// Metodo main que establece la conexion a BBDD y llama a un metodo
	// insertarAlumno();

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

			int filas = insertarAlumnos(con, "Pepe", "2000-01-01", 4.5, "DAW");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static int insertarAlumnos(Connection con, String nombre, String fecha, double media, String curso)
			throws SQLException {
		// se utiliza el tray para que cierre el ps , o la conexion
		try (PreparedStatement ps = con.prepareStatement(sentencia)) {

			ps.setString(1, nombre);
			ps.setString(2, fecha);
			ps.setDouble(3, media);
			ps.setString(0, curso);
			System.out.println("Sentencia a Ejecutar : " + ps);
			int filasAfectadas = ps.executeUpdate();
			return filasAfectadas;

		}
	}

}
