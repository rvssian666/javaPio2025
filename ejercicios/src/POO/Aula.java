package POO;

import java.util.ArrayList;
import java.util.List;

public class Aula {
	private int id;
	private String name;
	private int num;
	private List<Alumno> listaAlumno;

	public Aula(int id, String n, int numero) {
		this.id = id;
		this.name = n;
		this.num = numero;
		listaAlumno = new ArrayList<>();
	}

	public void getInfo() {
	}

	

}
