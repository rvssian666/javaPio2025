package interfaces;

public class Lion implements IAnimal{

	@Override
	public void doSound() {
		System.out.println("El leon hace ruaauauauauuarrrr");
		
	}

	@Override
	public void eat() {
		System.out.println("El leon come carne,por tanto es un animal carnivoro");
	}

	@Override
	public void sleep() {
		System.out.println("El leon descansa en la sabana despues de comer un  manjar");
		
	}

	@Override
	public void toMove() {
		System.out.println("El leon corre para cazar a su presa ");
	}

}
