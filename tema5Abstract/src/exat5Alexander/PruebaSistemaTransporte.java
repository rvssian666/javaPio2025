package exat5Alexander;

public class PruebaSistemaTransporte {
	public static void main(String[] args) {
		System.out.println("=== INICIO DE PRUEBAS DE VEHÍCULOS Examen 22 enero ===\n");

		try {
			// 1. Probar Vehículos Terrestres
			CocheAlexander miCoche = new CocheAlexander("1234ABC", "Toyota Corolla", 4, true);
			MotoAlexander miMoto = new MotoAlexander("5678DEF", "Honda CB500", 2, "Rojo");

			// Instanciar un terrestre genérico (permitido por el enunciado)
			VehiculoTerrestreAlex camion = new VehiculoTerrestreAlex("9999XYZ", "Volvo FH", 18);

			miCoche.imprimir();
			miMoto.imprimir();
			camion.imprimir();
			System.out.println();

			// 2. Probar Vehículos Acuáticos
			BarcoAlexander miBarco = new BarcoAlexander("LIBERTAD", "Yate Azimut", 15, true);
			SubmarinoAlexander miSubmarino = new SubmarinoAlexander("OCTUBREROJO", "Typhoon Class", 175, 500.0f);
			//creando mi propio Submarino
		

			miBarco.imprimir();
			miSubmarino.imprimir();
			//imprimiendo informacion de misubmarino2
			
			System.out.println();
		} catch (IllegalArgumentException e) {
			System.err.println("ERROR DE VALIDACIÓN: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Ocurrió un error inesperado: " + e.getMessage());
		}

		System.out.println("\n=== FIN DE LAS PRUEBAS ===");
	}
}