package exat5Alexander;

public class BarcoAlexander extends VehiculoAcuaticoAlexander {
	private boolean tieneMotor;

	public BarcoAlexander(String matricula, String modelo, int paramEslora, boolean paramTieneMotor) {
		super(matricula, modelo, paramEslora);
		this.tieneMotor = paramTieneMotor;
	}

	@Override
	public void imprimir() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return super.toString() + " BarcoAlexander [tieneMotor=" + tieneMotor + "]";
	}

}
