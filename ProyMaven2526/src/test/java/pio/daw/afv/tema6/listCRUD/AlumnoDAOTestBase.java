package pio.daw.afv.tema6.listCRUD;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Paths;
import java.nio.file.Files;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import pio.daw.jagd.tema6.listCRUD.Alumno;

abstract class AlumnoDAOTestBase {
	private AlumnoDAOImplementationAFV dao;
	// Usamos un archivo de test diferente al de origen para no borrar datos reales
	private final String RUTA_TEST = "src/main/java/pio/daw/afv/tema6/listCRUD/alumnos.json";
	// Método que cada hijo implementará para dar su propia clase
    
	// Usamos la interfaz AlumnoDAO para que todos encajen    
	public abstract AlumnoDAO crearInstancia(String ruta);
    
    
	@BeforeEach
	void setUp() throws Exception {
		// 1. Borrar el archivo de test si existe para empezar de cero
		Files.deleteIfExists(Paths.get(RUTA_TEST + "alumnos.json"));
		// 2. Instanciar el DAO
		dao = new AlumnoDAOImplementationAFV(RUTA_TEST);
	}

	// Probamos crear un alumno y buscarlo posteriormente
	@Test
	void testCreateAndRead() throws Exception {
		Alumno nuevo = new Alumno(123, "Alberto", "Pérez", "DAW", "2.6");

		int resultado = dao.create(nuevo);

		assertEquals(1, resultado, "El método create debería devolver 1");

		Alumno recuperado = dao.read(123);
		assertNotNull(recuperado, "El alumno debería existir en el JSON");
		assertEquals("Alberto", recuperado.getNombre());
	}

	// Probamos a buscar un alumno que no existe
	@Test
	void testReadNonExistent() throws Exception {
		Alumno recuperado = dao.read(999);
		assertNull(recuperado, "Debería devolver null si el NIA no existe");
	}

	@Test
	void testUpdate() throws Exception {
		// Insertamos uno primero
		Alumno original = new Alumno(666, "Norman", "Bates", "DAM", "B3");
		dao.create(original);

		// Cambiamos a Normal al aula de castigados
		Alumno modificado = new Alumno(666, "Norman", "Bates", "Castigados", "Sótano");
		dao.update(666, modificado);

		Alumno resultado = dao.read(666);
		System.out.println("resultado leer 666="+resultado);
		assertEquals("Sótano", resultado.getAula(), "El aula debería haberse actualizado");
	}
	//Probamos el caso de actualizar un alumno que no existe
	@Test
	void testUpdateThrowsException() {
		Alumno modificadoError = new Alumno(99, "Lotso", "", "DAM", "B3");

		assertThrows(Exception.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				dao.update(99, modificadoError);
			}
		}, "Debería lanzar excepción si el alumno no existe");
	}
	
	@Test
    void testDelete() throws Exception {
		Alumno alumBorrar = new Alumno(99, "Lotso", "", "DAM", "B3");
        dao.create(alumBorrar);
        
        dao.delete(99);
        
        Alumno resultado = dao.read(99);
        assertNull(resultado, "El alumno debería haber sido borrado del JSON");
    }

}
