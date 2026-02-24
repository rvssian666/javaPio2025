package pio.daw.afv.tema6.ownEjercicios;

import java.util.ArrayList;
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
		//esto devuelve la lista desordenada 
		// videoJLista.stream().filter(v -> v.getGenero() == genero).collect(Collectors.toList());
		 return videoJLista.stream().filter(v->v.getGenero()==genero).sorted().collect(Collectors.toList());
	}

	@Override
	public List<Videojuegos> obtenerPorRangoPrecios(double precioMin, double precioMax) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Videojuegos> obtenerMejoresCalificados(int cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Videojuegos> obtenerJuegosPorAño(int año) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<Videojuegos>> agruparPorGenero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> precioPromedioPorGenero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, List<Videojuegos>> agruparPorAño() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeJuegoConCalificacionMayor(double calificacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeJuegoEnRango(int añoMin, int añoMax) {
		// TODO Auto-generated method stub
		return false;
	}

}
