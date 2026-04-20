package pio.daw.afv.tema8.daoalumno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pio.daw.afv.tema8.daoalumno.model.*;

public class AlumnoDAOImplementation implements AlumnoDAO {

	@Override
	public int create(Alumno nuevoAlumno, Connection conn) throws SQLException {
		{
			String sql = "INSERT INTO alumnos (nombre, fnac, media, curso) VALUES (?, ?, ?, ?)";
			int nuevaClave = 0;

			try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				ps.setString(1, nuevoAlumno.getNombre());
				ps.setString(2, nuevoAlumno.getFnac());
				ps.setFloat(3, nuevoAlumno.getMedia());
				ps.setString(4, nuevoAlumno.getCurso());

				int affectedRows = ps.executeUpdate();

				if (affectedRows > 0) {
					ResultSet generatedKeys = ps.getGeneratedKeys();
					if (generatedKeys.next()) {
						nuevaClave = generatedKeys.getInt(1);
					}
				}

				return nuevaClave;
			}
		}
	}

	@Override
	public Alumno read(int id, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Alumno nuevoAlumno, Connection conn) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id, Connection conn) throws SQLException {
		// TODO Auto-generated method stub

	}

}
