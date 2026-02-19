package herencia;

public class EventoEstatico extends Eventos{
	private boolean asisteArtista;
	private String descripcion;
	

	public EventoEstatico(int id, String n, String h, String tema,boolean asisteArtista,String des) {
		super(n, h, tema, price);
		this.asisteArtista=asisteArtista;
		this.descripcion=des;
	
	}
	

}
