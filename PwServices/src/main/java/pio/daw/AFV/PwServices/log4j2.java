package pio.daw.AFV.PwServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2 {
	// Paso 1: Inicializar el Logger para esta clase
    private static final Logger logger = LogManager.getLogger(log4j2.class);

    /**
     * Procesa una orden y registra el estado en cada paso.
     * * @param ordenId El identificador de la orden a procesar.
     * @param cliente El nombre del cliente.
     */
    public boolean procesarOrden(String ordenId, String cliente) {
        
        // El nivel DEBUG se usa para información detallada que se puede apagar fácilmente
        logger.debug("Iniciando procesamiento de orden ID: {}", ordenId);
        
        // El nivel INFO se usa para eventos clave
        logger.info("Verificando stock para el cliente: {}", cliente);
        
        try {
            if (ordenId.length() < 5) {
                // Simular una excepción de negocio
                throw new IllegalArgumentException("ID de orden inválido.");
            }
            
            // Simulación de un paso exitoso
            logger.info("Orden {} procesada y lista para envío.", ordenId);
            return true;
            
        } catch (IllegalArgumentException e) {
            // El nivel ERROR es para fallos importantes. 
            logger.error("Error al procesar la orden {}. Motivo: {}", ordenId, e.getMessage(), e);
            return false;
        }
    }
}
