package tema5Abstract;

public class AnimalGato extends AnimalAbstract {

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.println("miau");
	}
	
	public void arañar() {
		System.out.println("El gato está arañando");
	}

	public AnimalGato() {
		super();
	}
	
}
