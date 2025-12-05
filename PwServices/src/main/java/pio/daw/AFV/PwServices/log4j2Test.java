package pio.daw.AFV.PwServices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2Test {

	// Paso 2: Inicializar el Logger principal
	private static final Logger logger = LogManager.getLogger(log4j2Test.class);

	public static void main(String[] args) {

		log4j2 servicio = new log4j2();

		logger.info("==================================================");
		logger.info("INICIO de la Prueba de Aplicación.");
		logger.info("==================================================");

		// Caso 1: Prueba Exitosa (ID Válido)
		logger.info("--- Ejecutando Prueba 1: Orden Válida ---");
		boolean exito1 = servicio.procesarOrden("ABC12345", "Ana García");
		logger.info("Resultado de Prueba 1: Éxito={}", exito1);

		// Caso 2: Prueba con Fallo (ID Demasiado Corto)
		logger.info("--- Ejecutando Prueba 2: Orden Inválida ---");
		boolean exito2 = servicio.procesarOrden("X", "Juan Pérez");
		logger.info("Resultado de Prueba 2: Éxito={}", exito2);

		logger.info("==================================================");
		logger.info("FIN de la Prueba de Aplicación.");
		logger.info("==================================================");
	}

}
