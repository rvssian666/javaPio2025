package inhiritance;

public class Television extends Electro {
	private static final int RESOLUCION_BASE = 30;
	private int iResolucion;

	public Television() {
		this(RESOLUCION_BASE);
	}

	public Television(int paramResolucion) {
		super(MARCA_BASE, MODELO_BASE, PRECIO_BASE, COLOR_BASE, POTENCIA_BASE, HORAS_BASE, DIAS_BASE,
				PRECIO_ENERGIA_BASE);
		this.iResolucion = paramResolucion;
	}

	public void consumoTelevision() {
		double consumo=iResolucion>50?super.consumoAnual()+30:0;
			
		}

	}


