package interfacesOWN;

public class Atleta implements Entrenable,Competidor{
	private int calorias;

	@Override
	public void competir() {
		System.out.println("Comienza a competir ");
		
	}

	@Override
	public void entrenar() {
		System.out.println("Entrenando....");
		this.calorias+=1;
		
	}

	@Override
	public int getCaloriasQuemadas() {
		
		return this.calorias;
	}
	public void descansar() {
		System.out.println("Descansando ....");
		
	}

}
