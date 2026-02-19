package pio.daw.afv.tema6.map;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class JugadoresTreeMap {
	private final static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema6\\map\\";

	public static void main(String[] args) {
		// Método que carga el json de alumnos
		Reader readerEntrada;
		try {
			readerEntrada = Files.newBufferedReader(Paths.get(RUTA_FICH + "jugadores.json"));
			// Declaramos un objeto gson para leer el archivo
			Gson gson = new Gson();
			// Cargamos el archivo JSON
			List<Jugador> listaJugadores = Arrays.asList(gson.fromJson(readerEntrada, Jugador[].class));
			System.out.println("Lista de jugadores desde json: " + listaJugadores);
			// Primero ordeno los jugadores
			listaJugadores.sort(Comparator.comparingInt(Jugador::getGoles));
			// Lo pasamos a un TreeMap
			TreeMap<Integer, Jugador> mapJugadores = new TreeMap<>();
			for (Jugador j : listaJugadores) {
				mapJugadores.put(j.getCodigo(), j);
			}
			System.out.println("****\nmapJugadores :" + mapJugadores);

			// jugadores de mas de 12 goles

			List<Jugador> jugadoresMas12Goles = mapJugadores.values().stream()
					.filter(jugador -> jugador.getGoles() > 12).collect(Collectors.toList());

			System.out.println("****\n jugadoresMas12goles " + jugadoresMas12Goles);
			// Dime el pichichi
			
			Jugador jugadorPichichi=mapJugadores.values().stream().max(Comparator.comparingInt(Jugador::getGoles)).orElse(null);
			System.out.println("****\n Pichichi  " + jugadorPichichi);
				

			// Agrupa por rangos de goles <8, 8 a 12, >12
			
			Map<String,List<Jugador>> jugadoresRangoPuntuacion= 
			mapJugadores.values().stream()
			.collect(Collectors.groupingBy(jugador -> {if
					 (jugador.getGoles()>=12){
						return "LosQueMasGoles";
					} else if (jugador.getGoles()>8) {
						return "LosMakinas";
					}else {
						return "LosMantas";
					}
				
					}));
			System.out.println("***\n jugadoresRangoPuntuacion "+ jugadoresRangoPuntuacion);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
