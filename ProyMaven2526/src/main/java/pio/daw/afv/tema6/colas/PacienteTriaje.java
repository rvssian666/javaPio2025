package pio.daw.afv.tema6.colas;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.google.gson.Gson;

public class PacienteTriaje {

	private final static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema6\\colas\\";

	public static void main(String[] args) {
		Reader entradaReader;
		try {
			entradaReader = Files.newBufferedReader(Paths.get(RUTA_FICH + "pacientes.json"));
			// Declaramos un objeto gson para leer el archivo
			Gson gson = new Gson();
			// Cargamos el archivo JSON
			PriorityQueue<PacienteDTO> pacientes = new PriorityQueue(
					Arrays.asList(gson.fromJson(entradaReader, PacienteDTO[].class)));
			procesarPacientes(pacientes);
			System.out.println("Lista de clientes desde json: " + procesarPacientes(pacientes));

		} catch (Exception e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}

	}

	public static PacienteDTO procesarPacientes(PriorityQueue<PacienteDTO> pacientes) {
		while (!pacientes.isEmpty()) {
			return pacientes.poll();
		}
		return null;
		
	}

}
