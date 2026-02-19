package exat5Alexander;

public class VehiculoAcuaticoAlexander extends VehiculoAlexander {
	public int eslora;

	public VehiculoAcuaticoAlexander(String matricula, String modelo, int paramEslora) {

		super(matricula, modelo);
		this.eslora = paramEslora;
	}

	@Override
	public void imprimir() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString() + " VehiculoAcuaticoAlexander [eslora=" + eslora + "]";
	}

}
