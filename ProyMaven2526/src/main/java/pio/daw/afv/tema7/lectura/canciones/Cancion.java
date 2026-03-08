package pio.daw.afv.tema7.lectura.canciones;

public class Cancion {
	private String nombreCancion;
	private String compositor;
	private int anyoPublicacion;

	
	public Cancion() {
		super();
	}

	public Cancion(String nombreCancion, String compositor, int anyoPublicacion) {
		super();
		this.nombreCancion = nombreCancion;
		this.compositor = compositor;
		this.anyoPublicacion = anyoPublicacion;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public String getCompositor() {
		return compositor;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	@Override
	public String toString() {
		return "Cancion [nombreCancion=" + nombreCancion + ", compositor=" + compositor + ", anyoPublicacion="
				+ anyoPublicacion + "]";
	}
	

}
