package POO;

public class Empleado {
	private int id;
	private String name;
	private String rol;
	private double salary;
//para  inicializar atributos como vacios es necesario poner "" en string `para que no lance NullPointerException
	public Empleado(int id, String name) {
		this.id = id;
		this.name = name;
		this.rol = "";
		this.salary =0;

	}

	public Empleado(int cod, String name, String puesto, double sal) throws Exception {
		this.id = cod;
		this.name = name;
		this.rol = puesto;
		if(sal<0)
			throw new Exception("El salario de un empleado no puede ser negativo");
		this.salary = sal;

	}

	public void increaseSalary(double porCiento) throws Exception {
		if (porCiento <= 0) {
			throw new Exception("Error en el % de salario a aumentar");
		} else {
			salary = salary * (porCiento / 100) + salary;
			System.out.println(salary);
		}
	}
	public void changeRol(String r) {
		this.rol=r;
		
	}
	public void ShowInformation() {
		System.out.println("\nIdentificador empleado "+ this.id);
		System.out.println("Nombre :" + this.name );
		System.out.println("Puesto de trabajo :" + this.rol);
		System.out.println("Salario :" + this.salary);
	}
}
