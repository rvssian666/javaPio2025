package pio.daw.afv.tema7.xmlAlex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.google.gson.Gson;

public class Utilidades {
	/**
	 * Método fromFich2Json
	 * @param <T>
	 * @param sRutaNombreFichero
	 * @param objetoClase
	 * @return Lista de objetos leídos de json
	 * @author JAGD
	 */
	public static <T> List<T> fromFich2Json(String sRutaNombreFichero, Class<T[]> objetoClase) {
		// Objeto lista persona a devolver
		List<T> listaObjetosDeFichero = null;
		// 1-Instancia GSON
		Gson gson = new Gson();
		// Creamos un reader para leer el fichero
		try {
			System.out.println(sRutaNombreFichero);
			// 2-reader para leer el fichero
			Reader reader = Files.newBufferedReader(Paths.get(sRutaNombreFichero));
			// 3-convertir el fichero a lista de objetos JSON
			// listaPersonasLeidaFichero = Arrays.asList(gson.fromJson(reader,
			// Persona[].class));
			listaObjetosDeFichero = Arrays.asList(gson.fromJson(reader, objetoClase));
			//System.out.println(listaObjetosDeFichero);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaObjetosDeFichero;
	}

	/**
	 * Método para imprimir por pantalla
	 * @param document2print
	 * @author JAGD
	 */
	public static void imprimirXmlPorPantalla(Document document2print) {
	    if (document2print == null) {
	        System.err.println("Error: El documento XML es nulo.");
	        return;
	    }

	    try {
	        // 1. Configurar la fuente (el DOM) y el destino (un StringWriter)
	        DOMSource domSource = new DOMSource(document2print);
	        StringWriter writer = new StringWriter();
	        StreamResult result = new StreamResult(writer);

	        // 2. Crear y configurar el Transformer
	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer = tf.newTransformer();

	        // Propiedades para que el XML sea legible (Pretty Print)
	        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no"); // Mantiene el <?xml...?>
	        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	        
	        // Configurar la indentación a 4 espacios (específico para el motor de Java)
	        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

	        // 3. Transformar
	        transformer.transform(domSource, result);

	        // 4. Imprimir el resultado
	        System.out.println("--- Contenido del XML ---");
	        System.out.println(writer.toString());
	        System.out.println("-------------------------");

	    } catch (TransformerException e) {
	        System.err.println("Error al transformar el XML para pantalla: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	/**
	 * Método para imprimir a fichero 
	 * @param document2print
	 * @param sRutaOut
	 * @author JAGD
	 */
	public static void imprimirXml2Fichero(Document document2print, String sRutaOut) {
		try {
			// 1. Configurar la fuente y el destino
			DOMSource domSource = new DOMSource(document2print);

			// 2. Usar try-with-resources para asegurar el cierre del Stream
			try (FileOutputStream fos = new FileOutputStream(sRutaOut)) {
				StreamResult result = new StreamResult(fos);

				// 3. Configurar el Transformer
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer = tf.newTransformer();

				// Propiedades estándar
				transformer.setOutputProperty(OutputKeys.METHOD, "xml");
				transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");				 
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

				// 4. Transformar y escribir
				transformer.transform(domSource, result);

				System.out.println("Archivo XML guardado con éxito en: " + sRutaOut);
			}
		} catch (TransformerException | IOException e) {
			System.err.println("Error crítico al procesar o escribir el XML: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	}

