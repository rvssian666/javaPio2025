package interfaces;

public class Aguila implements IAnimal{

	@Override
	public void doSound() {
		System.out.println("uyyyyyyyyyy");
		
	}

	@Override
	public void eat() {
		System.out.println("Se alimenta de peces o pequeños animales que captura ");
		
	}

	@Override
	public void sleep() {
		System.out.println("Descansa en su nido tranquilamente ");
		
	}

	@Override
	public void toMove() {
		System.out.println("El aguila vuela en el cielo desarrollando una alta velocidad");
		
	}

}
