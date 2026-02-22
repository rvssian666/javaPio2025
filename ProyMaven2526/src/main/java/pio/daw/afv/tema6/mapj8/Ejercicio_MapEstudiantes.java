package pio.daw.afv.tema6.mapj8;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.*;

public class Ejercicio_MapEstudiantes {
	public static void main(String[] args) {
		Map<String, Integer> estudiantes = new HashMap<>();
		estudiantes.put("Juan", 85);
		estudiantes.put("Maria", 92);
		estudiantes.put("Pedro", 78);
		estudiantes.put("Ana", 88);
		estudiantes.put("Carlos", 75);
		estudiantes.put("Scott Bessent", 95);

		// TODO: Implementar
		mostrarTodos(estudiantes);
		System.out.println("----Encontrar mejor estudiante");
		encontrarMejorEstudiante(estudiantes);
		filtrarAprobados(estudiantes);
		
		aumentarCalificaciones(estudiantes, 5);
		calcularPromedioCalificaciones(estudiantes);
	}

	// Mostrar todos los estudiantes
	static void mostrarTodos(Map<String, Integer> estudiantes) {
		estudiantes.entrySet().forEach(System.out::println);
		System.out.println("-----------------");

	}

	// Filtrar solo aprobados (>= 80)
	static void filtrarAprobados(Map<String, Integer> estudiantes) {
		List<Entry<String, Integer>> aprobados = estudiantes.entrySet().stream().filter(n -> n.getValue() >= 80)
				.collect(Collectors.toList());
		aprobados.forEach(System.out::println);
	}

	// Encontrar el estudiante con mejor nota
	static void encontrarMejorEstudiante(Map<String, Integer> estudiantes) {
		estudiantes.entrySet().stream().max(Map.Entry.comparingByValue())
				.ifPresent(e -> System.out.println(e.getKey() + " con calificación " + e.getValue()));
		System.out.println("-----------------");
	}

	// Aumentar todas las calificaciones en X puntos
	static void aumentarCalificaciones(Map<String, Integer> estudiantes, int aumento) {
		estudiantes.replaceAll((nombre,calificacion) -> calificacion+aumento);
		mostrarTodos(estudiantes);
	}
	// Calcular promedio
	static void calcularPromedioCalificaciones(Map<String, Integer> estudiantes) {
		int total=estudiantes.size();
		double calificacionnes= estudiantes.values().stream().mapToDouble(Integer::doubleValue).average().orElse(0);
	}
}