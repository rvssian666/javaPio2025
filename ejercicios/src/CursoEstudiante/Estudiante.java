package CursoEstudiante;

public class Estudiante {
	private int id;
	private String name;
	private double califi;

	public Estudiante(int id, String name, double c) {
		super();
		this.id = id;
		this.name = name;
		this.califi = c;
	}

	public void refreshEstudent(int calificacion) throws Exception {
		if (calificacion < 0 || calificacion > 10) {
			throw new Exception("La calificacion ingresada esta fuera de rango");
		}
		this.califi = calificacion;

	}

	public void getInfo() {
		System.out.println("\t Identif: " + this.id);
		System.out.println("\t Nombre: " + this.name);
		System.out.println("\t Calificacion: " + this.califi);
		System.out.println();
	}

	public void comparisonEstudent(Estudiante random) {
		if (this.califi == random.getCalifi()) {
			System.out.println("Las notas entre los estudiantes coinciden");
		} else if (this.califi > random.califi) {
			System.out.println("El estudiante con nota " + this.califi + "es el que posee mayo calificacion ");
		} else
			System.out.println("El estudiante con nota " + random.getCalifi() + "es el que posee mayor calificacion");

	}

	public boolean validator(int idRandom) {
		if (this.id == idRandom)
			return true;
		else
			return false;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalifi() {
		return califi;
	}

	public void setCalifi(int califi) {
		this.califi = califi;
	}

}
