package tema3.rfef;

public class DefensaAlex {
	private String nombre;
	private int edad;
	private int penaltisCometidos;
	public DefensaAlex(String nombre, int edad, int penaltisCometidos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.penaltisCometidos = penaltisCometidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPenaltisCometidos() {
		return penaltisCometidos;
	}
	public void setPenaltisCometidos(int penaltisCometidos) {
		this.penaltisCometidos = penaltisCometidos;
	}
	@Override
	public String toString() {
		return "DefensaAlex [nombre=" + nombre + ", edad=" + edad + ", penaltisCometidos=" + penaltisCometidos + "]";
	}
	
	
	

}
