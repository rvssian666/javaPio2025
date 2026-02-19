package exat5Alexander;

public abstract class VehiculoAlexander {
	public String matricula;
	public String modelo;

	public VehiculoAlexander(String matricula, String modelo) throws IllegalArgumentException {
		if (matricula.length() > 7 || matricula.length() > 7) {
			System.out.println("Tiene que ser 7 caracteres obligatoriamente");
		}
		super();
		this.matricula = matricula;
		this.modelo = modelo;
	}

	public abstract void imprimir();

	@Override

	public String toString() {
		return "VehiculoAlexander [matricula=" + matricula + ", modelo=" + modelo + "]";
	}

}
