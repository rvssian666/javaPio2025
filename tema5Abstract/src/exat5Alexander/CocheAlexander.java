package exat5Alexander;

public class CocheAlexander extends VehiculoTerrestreAlex {
	public boolean tieneAireAcondicionado;

	public CocheAlexander(String matricula, String modelo, int paramNumRuedas,boolean paramTieneAire) {
		super(matricula, modelo, paramNumRuedas);
		this.tieneAireAcondicionado=paramTieneAire;
		
	}
	@Override
	public void imprimir() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return super.toString()+" CocheAlexander [tieneAireAcondicionado=" + tieneAireAcondicionado + "]";
	}
	
}
