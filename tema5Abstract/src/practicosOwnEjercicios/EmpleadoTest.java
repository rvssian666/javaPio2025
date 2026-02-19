package practicosOwnEjercicios;

public class EmpleadoTest {

	public static void main(String[] args) {
		
		Vendedor vendedor1=new Vendedor("Esteban ", "Martinez", 1800, 0.2, 5);
		Vendedor vendedor2=new Vendedor("Scott ", "Bessent", 1800, 0.2, 20);
		Gerente gerente1=new Gerente("Sheng", "Huang", 2400, 478);
		
		System.out.println(gerente1.toString());
		System.out.println(vendedor1.toString());
		System.out.println(vendedor2.toString());
		System.out.println("El salario del vendedor "+vendedor1.getNombre() + "es  " + vendedor1.calcularSalario()+"$$" );
		System.out.println("El salario del vendedor "+vendedor2.getNombre()+ vendedor2.getApellidos()+ " es "+vendedor2.calcularSalario());
		System.out.println("El salario del gerente "+ gerente1.getNombre()+"  es "+ gerente1.calcularSalario() );

	}

}
