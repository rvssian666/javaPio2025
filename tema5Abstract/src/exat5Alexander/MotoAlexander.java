package exat5Alexander;

public class MotoAlexander extends VehiculoTerrestreAlex {
	private String color;

	public MotoAlexander(String matricula, String modelo, int paramNumRuedas, String paramColor) {
		super(matricula, modelo, paramNumRuedas);
		this.color = paramColor;

	}

	@Override
	public void imprimir() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString() + "MotoAlexander [color=" + color + "]";
	}

}
