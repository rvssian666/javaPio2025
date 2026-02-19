package inhiritance;

import inhiritance.Electro.MARCA;

public class Electro {

	protected enum MARCA

	{
		BOSCH, SAMSUNG, LG, Whirpol, SIEMENS

	};

	// ----------------------------------------------------
	// CONSTANTES MODIFICADAS: MARCA_BASE ahora es de tipo Marca (Enum)
	// ----------------------------------------------------
	protected static final MARCA MARCA_BASE = MARCA.BOSCH;
	protected final static String MODELO_BASE = "7200";
	protected final static String COLOR_BASE = "gris";
	protected static final double PRECIO_BASE = 400, POTENCIA_BASE = 2300, PRECIO_ENERGIA_BASE = 0.40397;
	protected static final int DIAS_BASE = 3, HORAS_BASE = 1;

	//Atributos de instancia
	private MARCA eMarca;
	private String sModel, sColor;
	protected double precioBase, dPrecioEnergia, dPotencia;
	protected int iDias, iHoras;

	// Constructor por defecto sin parametros
	public Electro() {
		this(MARCA_BASE, MODELO_BASE, PRECIO_BASE, COLOR_BASE, POTENCIA_BASE, HORAS_BASE, DIAS_BASE,
				PRECIO_ENERGIA_BASE);

	}

	public Electro(MARCA marcaBase, String paramModel, double paramPrecio, String paramColor, double potenciaBase,
			int paramHorasBase, int paramDiasBase, double parmaPEnergiaBase) {
		super();
		this.eMarca = marcaBase;
		this.sModel = paramModel;

		this.precioBase = paramPrecio;
		this.sColor = paramColor;
		this.dPotencia = potenciaBase;
		this.dPrecioEnergia = parmaPEnergiaBase;
		this.iHoras = paramHorasBase;
		this.iDias = paramDiasBase;

	}

	/*
	 * public Electrodomestico(String mar,String model ,float price, String col,int
	 * pot,int horasDia,int diasAnno,float pEnergia);
	 */
	/*
	 * public float consumoAnual(){ return
	 * this.getPotencia()*(this.getDiasUtilizAnno()*24); }
	 */
	public double consumoAnual() {

		return this.dPotencia * iDias * 24;

	}

	public Enum<MARCA> getMarca() {
		return eMarca;
	}

	public void setMarca(MARCA marca) {
		this.eMarca = marca;
	}

	public String getModelo() {
		return sModel;
	}

	public void setModelo(String modelo) {
		this.sModel = modelo;
	}

	public String getColor() {
		return sColor;
	}

	public void setColor(String color) {
		this.sColor = color;
	}

}
