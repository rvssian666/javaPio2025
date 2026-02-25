package pio.daw.afv.tema6.FastDelivey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DeliveryAlex {
	public static void main(String[] args) {
		Queue<PaqueteDTO> colaPaquetes = recogerDatosPaquetes();
		System.out.println("1-Cola de paquetes: " + colaPaquetes);

		List<PaqueteDTO> listaPaquetesFiltrados = filtrarPaquetesPesados(colaPaquetes, 15.0);
		System.out.println("2-Paquetes pesados (>15kg). Total:" + listaPaquetesFiltrados.size());

		colaPaquetes = recogerDatosPaquetes();
		Map<String, List<PaqueteDTO>> enviosPorCiudad = registrarPaquetesPorCiudad(colaPaquetes);
		System.out.println("3-Map agrupado: " + enviosPorCiudad);

		System.out.println("4-Max peso: " + buscarMaxPesoConStreams(listaPaquetesFiltrados));
		System.out.println("5-Media peso Madrid: " + buscarMediaPesoCiudadConStreams(listaPaquetesFiltrados, "MADRID"));
	}

	public static Queue<PaqueteDTO> recogerDatosPaquetes() {
		Queue<PaqueteDTO> muelle = new LinkedList<>();
		muelle.add(new PaqueteDTO(10.5, "Calle Mayor 1", "Juan", "VALENCIA"));
		muelle.add(new PaqueteDTO(40.0, "Av. Constitucion 5", "Marta", "MADRID"));
		muelle.add(new PaqueteDTO(20.0, "Calle Princesa 10", "Luis", "MADRID"));
		muelle.add(new PaqueteDTO(15.0, "Plaza España 2", "Ana", "VALENCIA"));
		muelle.add(new PaqueteDTO(5.0, "Rambla Catalunya 40", "Pedro", "BARCELONA"));
		muelle.add(new PaqueteDTO(12.2, "Alameda Mazarredo 3", "Iñaki", "BILBAO"));
		muelle.add(new PaqueteDTO(62.5, "Calle Sierpes 15", "Antonio", "SEVILLA"));
		muelle.add(new PaqueteDTO(8.0, "Gran Vía 12", "Ainhoa", "BILBAO"));
		muelle.add(new PaqueteDTO(31.1, "Diagonal 100", "Carlos", "BARCELONA"));
		muelle.add(new PaqueteDTO(25.5, "Calle Betis 7", "Lucía", "SEVILLA"));
		return muelle;
	}

	public static List<PaqueteDTO> filtrarPaquetesPesados(Queue<PaqueteDTO> cola, double pesoMax) {
		List<PaqueteDTO> pesados = new ArrayList<>();
		

		pesados = cola.stream().filter(p -> p.getPeso() > 15).collect(Collectors.toList());
		return pesados;
	}

	public static Map<String, List<PaqueteDTO>> registrarPaquetesPorCiudad(Queue<PaqueteDTO> cola) {
		Map<String, List<PaqueteDTO>> mapPaqCiudad = new HashMap<>();
		
		mapPaqCiudad=cola.stream().collect(Collectors.groupingBy(PaqueteDTO::getCiudadDestino));
		
		return mapPaqCiudad;
	}

	public static double buscarMaxPesoConStreams(List<PaqueteDTO> lista) {
		return	lista.stream().mapToDouble(PaqueteDTO::getPeso).reduce(Double.MIN_NORMAL, Double::max);
				
	}

	public static double buscarMediaPesoCiudadConStreams(List<PaqueteDTO> lista, String sCiudad) {
		return lista.stream().filter(p->p.getCiudadDestino()==sCiudad)
											.collect(Collectors.averagingDouble(PaqueteDTO::getPeso));
	

	}
}
