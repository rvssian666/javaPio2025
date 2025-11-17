package POO;

public class CuentaBancaria {
	// es recomendable poner los atributos siempre con visibilidad private
	private String IBAN;
	private String titular;
	private double saldo;
	private String tipoCuenta;
	private double ivestSaldo;

	public CuentaBancaria(String Iban, String titular, double s, String tipo, double i) throws Exception {
		this.IBAN = Iban;
		this.titular = titular;
		if (saldo < 0)
			throw new Exception("Este banco no admite descuebierto tácito");
		this.saldo = s;
		this.tipoCuenta = tipo;
		this.ivestSaldo = i;

	}

//Inicializando uno de los constructores en valores ceros o vacios::::::
	public CuentaBancaria() {
		this.IBAN = "";
		this.titular = "";
		this.saldo = 0;
		this.tipoCuenta = "Ahorros";
		this.ivestSaldo = 0;

	}

	public void enterMoney(double cant) {
		this.saldo += cant;
		System.out.println("Saldo cuenta " + this.saldo);

	}

	public void withdrawlsMoney(double r) throws Exception {
		if (r > saldo) {
			throw new Exception("La cantidad a retirar no puede ser mayor que el saldo en la cuenta ");
		} else
			saldo -= r;
	}

	public void calcularIvesting() {
		this.ivestSaldo = (saldo * 0.20);
		this.tipoCuenta = "Ahorros";
	}

	public void infoBankAccount() {
		System.out.println(" \nIBAN :" + this.IBAN);
		System.out.println("Nombre :" + this.titular);
		System.out.println("Saldo Cuenta :" + this.saldo);
		System.out.println("Saldo para inversión : " + this.ivestSaldo);
		System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
	}
//Los metodos setter and getter se utilizan cuando los atributos son privados (no se pueden acceder desde clases externas)
	public String getIBAN() {
		return IBAN;
	}

}
