package pio.daw.afv.tema6.listCRUD;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import com.google.gson.*;

public class AlumnoDAOImplementationAFV implements AlumnoDAO {

	private List<Alumno> listaAlumnos;
	private static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema6\\listCRUD\\";
	private Gson gson = new Gson();

	/*
	 * Genera un constructor en el que se inicialice el gson y se cargen los alumnos
	 * en el arrayList
	 */
	public AlumnoDAOImplementationAFV() {
		// Creamos el json para que lo pinte de forma indentada
		this.gson = new GsonBuilder().setPrettyPrinting().create();
		this.listaAlumnos = cargarDatos();
		System.out.println("alumnos leídos: " + listaAlumnos);
	}

	// Carga de datos
	public AlumnoDAOImplementationAFV(String ruta_fich_json) {
		this.gson = new GsonBuilder().setPrettyPrinting().create();
		this.RUTA_FICH = ruta_fich_json;
		this.listaAlumnos = cargarDatos();
	}

	private List<Alumno> cargarDatos() {
	    Reader readerEntrada;
	    try {
	        readerEntrada = Files.newBufferedReader(Paths.get(RUTA_FICH + "alumnos.json"));
	        // Convertimos el array de Gson a una ArrayList de Java real
	        Alumno[] arrayAux = gson.fromJson(readerEntrada, Alumno[].class);
	        listaAlumnos = new java.util.ArrayList<>(Arrays.asList(arrayAux)); 
	        
	        readerEntrada.close(); 
	    } catch (IOException e) {
	        // Si el archivo no existe, inicializamos lista vacía
	        listaAlumnos = new java.util.ArrayList<>();
	    }
	    return listaAlumnos;
	}

	private void guardarDatos() {
		java.io.Writer escritura;
		try {
			escritura = Files.newBufferedWriter(Paths.get(RUTA_FICH + "alumnos.json"));
			// Convertimos la lista de alumnos a JSON y lo escribimos en el archivo
			gson.toJson(listaAlumnos, escritura);
			System.out.println("Datos guardados correctamente.");
		} catch (IOException e) {
			System.err.println("Error al guardar los datos en el archivo JSON.");
			e.printStackTrace();
		}
	}

	@Override
	public int create(Alumno nuevoAlum) throws Exception {
		listaAlumnos.add(nuevoAlum);// añades
		guardarDatos();
		return 1;
	}

	@Override
	public Alumno read(int niaBuscar) throws Exception {
		for (Alumno alum : listaAlumnos) {
			if (alum.getNia() == niaBuscar)
				return alum;
		}
		return null;
	}

	@Override
	public void update(int niaActualizar, Alumno alumnoCambiado) throws Exception {
		// he decidido utilizar un for clasico , para ser más accesible al indice de la lista
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getNia() == niaActualizar) {
				listaAlumnos.set(i, alumnoCambiado);
				guardarDatos();
				return;
			}
		}
		throw new Exception("El alumno no existe en la Lista ");
	}

	@Override
	public void delete(int niaBorrar) throws Exception {
		// he decidido utilizar un for clasico , para ser más accesible al indice de la lista
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getNia() == niaBorrar) {
				listaAlumnos.remove(i);
				guardarDatos();
				return; 
			}

		}
		throw new Exception("Error el alumno no se ha encontrado");
	}
}
