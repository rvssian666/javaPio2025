package tema3.rfef;

import java.time.LocalDate;

public class EquipoFutbolAlex {
	private String nombreEquipo;
	private String ciudad;
	private String nombreCampo;
	private LocalDate fechaFundacion;
	private EntrenadorAlex entrenador;
	private PorteroAlex porteroTitular;
	private DefensaAlex Central1;
	private DefensaAlex Central2;
	private DefensaAlex interiorIzq;
	private DefensaAlex interiorDerecha;
	private CentrocampistaAlex centrocampista1;
	private CentrocampistaAlex centrocampista2;
	private CentrocampistaAlex centrocampista3;
	private DelanteroAlex extremoIzq;
	private DelanteroAlex extremoDcha;
	private DelanteroAlex delanteroCentro;
	private int puntos;
	public EquipoFutbolAlex(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
			EntrenadorAlex entrenador, PorteroAlex porteroTitular, DefensaAlex central1, DefensaAlex central2,
			DefensaAlex interiorIzq, DefensaAlex interiorDerecha, CentrocampistaAlex centrocampista1,
			CentrocampistaAlex centrocampista2, CentrocampistaAlex centrocampista3, DelanteroAlex extremoIzq,
			DelanteroAlex extremoDcha, DelanteroAlex delanteroCentro, int puntos) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.ciudad = ciudad;
		this.nombreCampo = nombreCampo;
		this.fechaFundacion = fechaFundacion;
		this.entrenador = entrenador;
		this.porteroTitular = porteroTitular;
		Central1 = central1;
		Central2 = central2;
		this.interiorIzq = interiorIzq;
		this.interiorDerecha = interiorDerecha;
		this.centrocampista1 = centrocampista1;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.extremoIzq = extremoIzq;
		this.extremoDcha = extremoDcha;
		this.delanteroCentro = delanteroCentro;
		this.puntos = puntos;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public EntrenadorAlex getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(EntrenadorAlex entrenador) {
		this.entrenador = entrenador;
	}
	public PorteroAlex getPorteroTitular() {
		return porteroTitular;
	}
	public void setPorteroTitular(PorteroAlex porteroTitular) {
		this.porteroTitular = porteroTitular;
	}
	public DefensaAlex getCentral1() {
		return Central1;
	}
	public void setCentral1(DefensaAlex central1) {
		Central1 = central1;
	}
	public DefensaAlex getCentral2() {
		return Central2;
	}
	public void setCentral2(DefensaAlex central2) {
		Central2 = central2;
	}
	public DefensaAlex getInteriorIzq() {
		return interiorIzq;
	}
	public void setInteriorIzq(DefensaAlex interiorIzq) {
		this.interiorIzq = interiorIzq;
	}
	public DefensaAlex getInteriorDerecha() {
		return interiorDerecha;
	}
	public void setInteriorDerecha(DefensaAlex interiorDerecha) {
		this.interiorDerecha = interiorDerecha;
	}
	public CentrocampistaAlex getCentrocampista1() {
		return centrocampista1;
	}
	public void setCentrocampista1(CentrocampistaAlex centrocampista1) {
		this.centrocampista1 = centrocampista1;
	}
	public CentrocampistaAlex getCentrocampista2() {
		return centrocampista2;
	}
	public void setCentrocampista2(CentrocampistaAlex centrocampista2) {
		this.centrocampista2 = centrocampista2;
	}
	public CentrocampistaAlex getCentrocampista3() {
		return centrocampista3;
	}
	public void setCentrocampista3(CentrocampistaAlex centrocampista3) {
		this.centrocampista3 = centrocampista3;
	}
	public DelanteroAlex getExtremoIzq() {
		return extremoIzq;
	}
	public void setExtremoIzq(DelanteroAlex extremoIzq) {
		this.extremoIzq = extremoIzq;
	}
	public DelanteroAlex getExtremoDcha() {
		return extremoDcha;
	}
	public void setExtremoDcha(DelanteroAlex extremoDcha) {
		this.extremoDcha = extremoDcha;
	}
	public DelanteroAlex getDelanteroCentro() {
		return delanteroCentro;
	}
	public void setDelanteroCentro(DelanteroAlex delanteroCentro) {
		this.delanteroCentro = delanteroCentro;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
	    return "EquipoFutbol(\n" +
	           "  nombreEquipo='" + nombreEquipo + "',\n" +
	           "  ciudad='" + ciudad + "',\n" +
	           "  nombreCampo='" + nombreCampo + "',\n" +
	           "  fechaFundacion=" + fechaFundacion + ",\n" +
	           "  entrenador=" + entrenador + ",\n" +
	           "  porteroTitular=" + porteroTitular + ",\n" +
	           "  central1=" + Central1 + ",\n" +
	           "  central2=" + Central2 + ",\n" +
	           "  interiorIzq=" + interiorIzq + ",\n" +
	           "  interiorDerecha=" + interiorDerecha + ",\n" +
	           "  centrocampista1=" + centrocampista1 + ",\n" +
	           "  centrocampista2=" + centrocampista2 + ",\n" +
	           "  centrocampista3=" + centrocampista3 + ",\n" +
	           "  extremoIzq=" + extremoIzq + ",\n" +
	           "  extremoDcha=" + extremoDcha + ",\n" +
	           "  delanteroCentro=" + delanteroCentro + ",\n" +
	           "  puntos=" + puntos + "\n" +
	           ")";
	}


	
	
	
	

}
