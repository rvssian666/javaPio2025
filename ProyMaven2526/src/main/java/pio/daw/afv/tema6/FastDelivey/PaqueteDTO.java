package pio.daw.afv.tema6.FastDelivey;

public class PaqueteDTO {
	 private double peso;
	    private String detalleDireccion;
	    private String nombreCliente;
	    private String ciudadDestino;

	    public PaqueteDTO(double peso, String detalleDireccion, String nombreCliente, String ciudadDestino) {
	        this.peso = peso;
	        this.detalleDireccion = detalleDireccion;
	        this.nombreCliente = nombreCliente;
	        this.ciudadDestino = ciudadDestino;
	    }

	    @Override
	    public String toString() {
	        return "\n PaqueteDTO [peso=" + peso + ", detalleDireccion=" + detalleDireccion 
	               + ", nombreCliente=" + nombreCliente + ", ciudadDestino=" + ciudadDestino + "]";
	    }

	    public double getPeso() { return peso; }
	    public String getDetalleDireccion() { return detalleDireccion; }
	    public String getNombreCliente() { return nombreCliente; }
	    public String getCiudadDestino() { return ciudadDestino; }
}
