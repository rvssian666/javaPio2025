package exat5Alexander;

public class VehiculoTerrestreAlex extends VehiculoAlexander {
	public int numRuedas;

	public VehiculoTerrestreAlex(String matricula, String modelo, int paramNumRuedas) throws IllegalArgumentException {

		
		super(matricula, modelo);
		this.numRuedas = paramNumRuedas;

	}

	@Override
	public void imprimir() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return super.toString() + " VehiculoTerrestreAlex [numRuedas=" + numRuedas + "]";
	}

}
