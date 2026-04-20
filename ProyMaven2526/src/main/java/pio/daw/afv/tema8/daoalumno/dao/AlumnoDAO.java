package pio.daw.afv.tema8.daoalumno.dao;

import java.sql.Connection;
import java.sql.SQLException;

import pio.daw.afv.tema8.daoalumno.model.*;

public interface AlumnoDAO {
	// creamos los 4 metodos necesarios para interactuatr con la base de datos
	// CRUD
	public int create(Alumno nuevoAlumno, Connection conn) throws SQLException;

	public Alumno read(int id, Connection conn) throws SQLException;

	public void update(Alumno nuevoAlumno, Connection conn) throws SQLException;

	public void delete(int id, Connection conn) throws SQLException;

}
