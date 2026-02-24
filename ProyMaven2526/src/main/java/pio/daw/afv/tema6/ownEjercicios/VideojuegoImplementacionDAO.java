package pio.daw.afv.tema6.ownEjercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VideojuegoImplementacionDAO implements IVideojuegoDAO {
	List<Videojuegos> videoJLista = new ArrayList<>();

	@Override
	public void agregar(Videojuegos videojuego) {
		if (videoJLista.contains(videojuego)) {
			System.out.println("Ese videojuego ya existe en la lista");
		} else
			videoJLista.add(videojuego);
	}

	@Override
	public Videojuegos obtenerPorId(int id) {
		return videoJLista.stream().filter(v -> v.getId() == id).findFirst().orElse(null);

	}

	@Override
	public List<Videojuegos> obtenertodos() {
		// Retrona la lista directamente
		return videoJLista;
	}

	@Override
	public void actualizar(Videojuegos videojuego) {

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Videojuegos> buscarPorGenero(String genero) {
		// esto devuelve la lista desordenada
		// videoJLista.stream().filter(v -> v.getGenero() ==
		// genero).collect(Collectors.toList());
		return videoJLista.stream().filter(v -> v.getGenero() == genero)
				.sorted(Comparator.comparing(Videojuegos::getTitulo)).collect(Collectors.toList());
	}

	@Override
	public List<Videojuegos> obtenerPorRangoPrecios(double precioMin, double precioMax) {
		return videoJLista.stream().filter(v -> v.getPrecio() > precioMin && v.getPrecio() < precioMax)// filtramos por
																										// el rango de
																										// precio
				.collect(Collectors.toList());
	}

	@Override
	public List<Videojuegos> obtenerMejoresCalificados(int cantidad) {
		return videoJLista.stream().filter(v -> v.getCalificacion() > cantidad).collect(Collectors.toList());
	}

	@Override
	public List<Videojuegos> obtenerJuegosPorAño(int año) {

		return videoJLista.stream().filter(v -> v.getAño() == año).sorted(Comparator.comparingInt(Videojuegos::getAño))
				.collect(Collectors.toList());
	}

	@Override
	public Map<String, List<Videojuegos>> agruparPorGenero() {
		Map<String, List<Videojuegos>> mapGeneros = new HashMap<>();
		mapGeneros = videoJLista.stream().collect(Collectors.groupingBy(Videojuegos::getGenero));
		return mapGeneros;
	}

	@Override
	public Map<String, Double> precioPromedioPorGenero() {
		Map<String, Double> mapPromedioGenero = new HashMap<>();
		mapPromedioGenero=videoJLista.stream().collect(Collectors.groupingBy(Videojuegos::getGenero,Collectors.averagingDouble(Videojuegos::getPrecio)));
		return mapPromedioGenero;
	}

	@Override
	public Map<Integer, List<Videojuegos>> agruparPorAño() {
		
		return null;
	}

	@Override
	public boolean existeJuegoConCalificacionMayor(double calificacion) {
		return videoJLista.stream()
				.anyMatch(v->v.getCalificacion()>calificacion);//comprueba si existe alguno (retorna booleano)
	}

	@Override
	public boolean existeJuegoEnRango(int añoMin, int añoMax) {
		return videoJLista.stream().anyMatch(v-> v.getAño()>añoMin &&v.getAño()<añoMax);
	}

}
