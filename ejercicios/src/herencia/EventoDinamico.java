package herencia;

public class EventoDinamico extends Eventos{
	private static double price;
	private String info;
	private boolean habraSorteo;

	public EventoDinamico(int id, String n, String h, String tema,boolean sorteo,String info) {
		super(n, h, tema, price);
		this.habraSorteo=sorteo;
		this.info=info;
		
	}

}
