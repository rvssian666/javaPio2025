package practicosOwnEjercicios;

public class Vendedor extends EmpleadoAbstract {
	private double comisionVenta;
	private double ventasRealizadas;

	public Vendedor(String nombre, String apellidos, double salarioBase, double param_comision, double cant_ventas) {
		super(nombre, apellidos, salarioBase);
		this.comisionVenta = param_comision;
		this.ventasRealizadas = cant_ventas;

	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return (this.ventasRealizadas * this.comisionVenta) + getSalarioBase();
	}

	public void registraVenta(double montoVenta) {
		System.out.println("Venta realizada con exito! , cantidad: " + montoVenta);

	}

	@Override
	public String toString() {
		return super.toString() + "Vendedor [comisionVenta=" + comisionVenta + ", ventasRealizadas=" + ventasRealizadas
				+ "]";
	}

}
