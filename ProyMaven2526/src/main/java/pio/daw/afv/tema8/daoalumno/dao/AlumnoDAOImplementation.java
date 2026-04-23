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
		String sql = "Select num,nombre,fnac,media,curso FROM alumnos WHERE num=?";
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					Alumno unAlumno = new Alumno();
					unAlumno.setNum(rs.getInt("num"));
					unAlumno.setNombre(rs.getString("nombre"));
					unAlumno.setFnac(rs.getString("fnac"));
					unAlumno.setMedia(rs.getFloat("media"));
					unAlumno.setCurso(rs.getString("curso"));
					return unAlumno;
				} else
					return null;
			}
		}

	}

	@Override
	public void update(Alumno nuevoAlumno, Connection conn) throws SQLException {
		// 1. Definimos la consulta con '?' para los datos que queremos cambiar
		// El WHERE es fundamental para no actualizar toda la tabla por error
		String sql = "UPDATE alumnos SET  nombre=?,fnac=?,media=?,curso=? WHERE num=?";
		// 2. Usamos try-with-resources para asegurar que el PreparedStatement se cierre
		// solo
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoAlumno.getNombre());
			ps.setString(2, nuevoAlumno.getFnac());
			ps.setFloat(3, nuevoAlumno.getMedia());
			ps.setString(4, nuevoAlumno.getCurso());
			ps.setInt(5, nuevoAlumno.getNum());
			int filasAfectadas = ps.executeUpdate();
			if (filasAfectadas > 0) {
				System.out.println("Alumno con ID " + nuevoAlumno.getNum() + " actualizado con éxito.");
			} else {
				System.out.println("No se encontró el alumno con ID " + nuevoAlumno.getNum());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void delete(int id, Connection conn) throws SQLException {
		String sql = "DELETE FROM alumnos WHERE num=?";
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			// 4. Ejecutamos la acción
			int filasBorradas = ps.executeUpdate();

			// 5. Opcional: Feedback para saber si realmente existía ese ID
			if (filasBorradas > 0) {
				System.out.println("Registro con ID " + id + " eliminado correctamente.");
			} else {
				System.out.println("No se encontró ningún alumno con ID " + id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
