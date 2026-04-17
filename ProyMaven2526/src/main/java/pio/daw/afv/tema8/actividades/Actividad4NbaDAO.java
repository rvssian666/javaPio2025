package pio.daw.afv.tema8.actividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Actividad4NbaDAO {
	private final static String url = "jdbc:mysql://localhost:3307/nba";
	private final static String user = "alumno";
	private final static String password = "alumno_pass";

	public void consultar(String nombreTabla) {
		String ConsultasSql = "Select * from " + nombreTabla;

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(ConsultasSql)) {
			// ResultSetMetaData contiene la informacion sobre la propia tabla , que
			// columnas, de que tipo etc
			ResultSetMetaData metaData = rs.getMetaData();
			int numColumnas = metaData.getColumnCount();
			System.out.println("\nContenido de la tabla " + nombreTabla.toUpperCase() + " -- ");
			// 1-Imprimir cabeceras
			for (int i = 1; i <= numColumnas; i++) {
				System.out.println(metaData.getColumnName(i));
			}
			while (rs.next()) {
				for (int i = 1; i <= numColumnas; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.print("Error al leer la tabla ");
		}

	}

}
