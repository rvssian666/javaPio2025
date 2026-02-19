package exat5Alexander;

public class SubmarinoAlexander extends VehiculoAcuaticoAlexander {
	public float profundidadMaxima;

	public SubmarinoAlexander(String matricula, String modelo, int paramEslora, float paramProfunMax) {
		super(matricula, modelo, paramEslora);
		this.profundidadMaxima = paramProfunMax;
	}

	@Override
	public void imprimir() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return super.toString() + "SubmarinoAlexander [profundidadMaxima=" + profundidadMaxima + "]";
	}

}
