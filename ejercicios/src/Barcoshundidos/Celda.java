package Barcoshundidos;

public enum Celda {
	AGUA("~~~"),
	BARCO("B"),
	FALLIDO("F"),
	HUNDIDO("X");
	private  String comentario ;

	private Celda(String coment) {
		this.comentario=coment;
		
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	

}
