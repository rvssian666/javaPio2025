package POO;

public class Tester {

	public static void main(String[] args) {
		try {
			// creando objeto e inicializando parametros para que tome valores
			Empleado employer = new Empleado(01, "Elon", "Programmer", 4350.68);
			Empleado employer2 = new Empleado(02, "Jeff", "Sales", 3980.67);
			Empleado employer3 = new Empleado(03, "Bernal", "Designer", 4000.67);
			CuentaBancaria c1 = new CuentaBancaria("ES9089876565","Paredes",4600.14,"Corriente",0);
			CuentaBancaria c2=new CuentaBancaria("ES0998766654321","Jhon",12900.12,"Corriente",0);

			// employer.increaseSalary(2);
			// employer.ShowInformation();
			// employer2.ShowInformation();
			// employer3.ShowInformation();
			//c1.enterMoney(500);//clase CuentaBancaria
			//c2.calcularIvesting();//clase CuentaBancaria
			//c2.infoBankAccount();//clase CuentaBancaria
		} catch (Exception e) {

		}

	}

}
