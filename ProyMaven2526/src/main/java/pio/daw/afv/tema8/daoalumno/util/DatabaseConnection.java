package pio.daw.afv.tema8.daoalumno.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	private Connection connection;
	// Constantes de conexion
	private static final String URL = "jdbc:mysql://localhost:3307/instituto";
	private static final String USER = "alumno";
	private static final String PASSWORD = "alumno_pass";

	// Constructor privado (Singleton)
	private DatabaseConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Obtener instancia única
	public static DatabaseConnection getInstance() {
		if (instance == null)
			instance = new DatabaseConnection();
		return instance;
	}

	// Obtener conexión
	public Connection getConnection() {
		return connection;
	}
}
