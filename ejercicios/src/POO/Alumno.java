package POO;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private String nombre;
	private int age;
	private List<Notas> nota;

	public Alumno(String name, int a) {
		this.age = a;
		this.nombre = name;
		nota = new ArrayList<>();

	}

	public void addNotas(Notas n) {
		nota.add(n);
	}
	public double calcularNotaMedia() {
		double notaMedia=0;
		for(Notas aux:nota) {
			notaMedia+=aux.getCalificacion();
		}
		return notaMedia/nota.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
