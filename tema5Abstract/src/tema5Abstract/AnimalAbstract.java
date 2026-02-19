package tema5Abstract;

/*Una clase abdtracta es una clase que declara la exitencia de los método pero no su implementación
 * Es decir, está la cabecera pero no el código.
 * Una clase abstracta puede tener tanto métodos abstractos como no abstractos pero al menos uno deber ser abstracto
 */
public abstract class AnimalAbstract {
	/*Método abstracto*/
	public abstract void hacerSonido();
	
	//Método no abstracto
	public void moverse() {
		System.out.println("El animal se está moviendo");
	}
}
