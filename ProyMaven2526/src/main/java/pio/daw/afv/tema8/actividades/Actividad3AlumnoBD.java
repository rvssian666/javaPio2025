package pio.daw.afv.tema8.actividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Actividad3AlumnoBD {
	private final static String url = "jdbc:mysql://localhost:3307/instituto";
	private final static String user = "alumno";
	private final static String password = "alumno_pass";

	/*
	 * *Metodo que recibe el nombre de una clase (DAW,ASIR,DAM,SMR) y devuelve sus
	 * alumnos
	 * 
	 * @param clase
	 * 
	 */
	public List<Alumno> consultarAlumnos(String clase) {
	    List<Alumno> listaResultado = new ArrayList<>();
	    String sql = "SELECT nombre, media from alumnos where curso = ?";
	    
	    try (Connection con = DriverManager.getConnection(url, user, password);
	         PreparedStatement ps = con.prepareStatement(sql)) {
	         
	        ps.setString(1, clase);
	        ResultSet rs = ps.executeQuery();
	        
	        while (rs.next()) {
	            // Extracción de datos del ResultSet y creación del objeto Alumno
	            String nombre = rs.getString("nombre");
	            double media = rs.getDouble("media");
	            listaResultado.add(new Alumno(nombre, media));
	        }
	        
	    } catch (SQLException e) {
	        System.err.println("Error al leer " + e.getMessage());
	        e.printStackTrace();
	    }
	    
	    return listaResultado;
	}
}
