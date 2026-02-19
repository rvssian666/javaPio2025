package practicosOwnEjercicios;

public class Gerente extends EmpleadoAbstract {
	private double bonoObjetivos;

	public Gerente(String nombre, String apellidos, double salarioBase,double paramBono) {
		super(nombre, apellidos, salarioBase);
		this.bonoObjetivos=paramBono;
	}

	
	//aqui podemos ver como modificamos el metodo abstracto que definimos en la clase padre Abstract 
	@Override
	public double calcularSalario() {
		return getSalarioBase()+this.bonoObjetivos;
	}


	@Override
	public String toString() {
		return super.toString()+" bonoObjetivos=" + bonoObjetivos + "]";
	}
	
	

}
