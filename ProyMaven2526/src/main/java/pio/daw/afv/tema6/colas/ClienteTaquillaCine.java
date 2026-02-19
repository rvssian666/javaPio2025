package pio.daw.afv.tema6.colas;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.google.gson.Gson;

import pio.daw.afv.tema6.map.Jugador;

public class ClienteTaquillaCine {
	private final static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema6\\colas\\";

	public static void main(String[] args) {
		Reader entrada;
		// 1-Leer el json y guardar en una cola
		try {
			entrada = Files.newBufferedReader(Paths.get(RUTA_FICH + "cliente.json"));
			// Declaramos un objeto gson para leer el archivo
			Gson gson = new Gson();
			// Cargamos el archivo JSON
			Queue<ClienteDTO> colaClientes = new LinkedList(Arrays.asList(gson.fromJson(entrada, ClienteDTO[].class)));
			System.out.println("Lista de clientes desde json: " + colaClientes);
			double recaudacionTotal = calcularRecaudacion(colaClientes);
			System.out.println("El total de recaudacion de las entradas del cine es " + recaudacionTotal + "€");

		} catch (Exception e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}

	}// fin main

	private static double calcularRecaudacion(Queue<ClienteDTO> colaClientes) {
		// 3-Extraer gente de la cola y en funcion de la edad calcular precio
		double recaudacionTotal = 0;

		while (!colaClientes.isEmpty()) {
			if (colaClientes.peek().getEdad() > 29) {
				colaClientes.poll();
				recaudacionTotal=+9;
			} else if (colaClientes.peek().getEdad() > 18) {
				colaClientes.poll();
				recaudacionTotal=+7;
			} else if (colaClientes.peek().getEdad() > 11) {
				colaClientes.poll();

				recaudacionTotal=+5;;
			} else if (colaClientes.peek().getEdad() > 4) {
				colaClientes.poll();

				recaudacionTotal=+3;
			}

		}
		return recaudacionTotal;
		
	}

}
