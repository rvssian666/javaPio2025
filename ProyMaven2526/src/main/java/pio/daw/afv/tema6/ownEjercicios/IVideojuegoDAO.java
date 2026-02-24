package pio.daw.afv.tema6.ownEjercicios;

import java.util.List;
import java.util.Map;

public interface IVideojuegoDAO {
	void agregar(Videojuegos videojuego);
	Videojuegos obtenerPorId(int id);
	List<Videojuegos> obtenertodos();
	void actualizar(Videojuegos videojuego);
	void eliminar(int id);

	// BÚSQUEDAS CON STREAMS
	List<Videojuegos> buscarPorGenero(String genero);
	List<Videojuegos> obtenerPorRangoPrecios(double precioMin, double precioMax);
	List<Videojuegos> obtenerMejoresCalificados(int cantidad);
	List<Videojuegos> obtenerJuegosPorAño(int año);

	// OPERACIONES CON MAP
	Map<String, List<Videojuegos>> agruparPorGenero();
	Map<String, Double> precioPromedioPorGenero();
	Map<Integer, List<Videojuegos>> agruparPorAño();

	// OPERACIONES BOOLEANAS
	boolean existeJuegoConCalificacionMayor(double calificacion);
	boolean existeJuegoEnRango(int añoMin, int añoMax);
}
