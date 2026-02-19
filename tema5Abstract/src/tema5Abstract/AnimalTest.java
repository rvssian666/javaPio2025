package tema5Abstract;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo de herencia y polimorfismo. Clase Perro: ");
		AnimalPerro perro = new AnimalPerro();
		perro.moverse();
		perro.buscaPelota();
		
		System.out.println("Ejemplo de herencia y polimorfismo. Clase gato: ");
		AnimalGato gato = new AnimalGato();
		gato.hacerSonido();
		gato.moverse();
		gato.arañar();

	}

}
