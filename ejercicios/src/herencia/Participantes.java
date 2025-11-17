package herencia;

public class Participantes {
	private static int id;
	private String fullname;
	private int age;

	private String email;
	private String tematicaInteresada;

	public Participantes(String a, int edad, String nombre, String temaI) {
		this.id += 1;
		this.fullname = nombre;
		this.age = edad;
		this.email = a;
		this.tematicaInteresada = temaI;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getfullName() {
		return fullname;
	}

	public void setfullName(String name) {
		this.fullname = name;
	}

	public String getAge() {
		return email;
	}

	public void setAge(String age) {
		this.email = age;
	}

	public String getTematicaInteresada() {
		return tematicaInteresada;
	}

	public void setTematicaInteresada(String tematicaInteresada) {
		this.tematicaInteresada = tematicaInteresada;
	}
}
