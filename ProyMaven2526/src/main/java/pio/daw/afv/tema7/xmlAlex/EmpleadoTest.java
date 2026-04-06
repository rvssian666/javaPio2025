package pio.daw.afv.tema7.xmlAlex;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Text;


import com.google.gson.Gson;




public class EmpleadoTest {
	static String RUTA_FICH = "src\\main\\java\\pio\\daw\\wkh\\tema7\\xmlAlex\\";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Empleado empleadoDeFich = fromFich2Json("empleado.json");
		System.out.println("Empleado:" + empleadoDeFich);
		// Convertimos el objeto empleado a XML
		Document docEmpleado = fromEmpleado2XML(empleadoDeFich);
		System.out.println(docEmpleado);

		List<Empleado> listaEmpleados = Utilidades.fromFich2Json(RUTA_FICH + "empleado2.json", Empleado[].class);
		System.out.println("empleadoDeFich= " + listaEmpleados);
		// Convertimos a la lista a XML
		Document docXMLEmpleados = fromListaEmpleado2XML(listaEmpleados);
		Utilidades.imprimirXmlPorPantalla(docXMLEmpleados);
		// Pasarlo a fichero
		Utilidades.imprimirXml2Fichero(docXMLEmpleados, RUTA_FICH + "empleadoOut.xml");
	}
	private static Document fromEmpleado2XML(Empleado empleadoDeFich) {
		Document docSalida = null;

		try {
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			docSalida = documentBuilder.newDocument();

			// Creamos elementos atributos y texto
			Element elemEmpleado = docSalida.createElement("empleado");
			Element elemNombreEmpleado = docSalida.createElement("nombre");
			Text testNombreEmpleado = docSalida.createTextNode(empleadoDeFich.getNombre());
			Element elemApellidoEmpleado = docSalida.createElement("apellido");
			Text testApellidoEmpleado = docSalida.createTextNode(empleadoDeFich.getApellido());
			Element elemEmailEmpleado = docSalida.createElement("email");
			Text testEmailEmpleado = docSalida.createTextNode(empleadoDeFich.getGmail());
			Element elemDeptEmpleado = docSalida.createElement("departamento");
			Text testDeptEmpleado = docSalida.createTextNode(empleadoDeFich.getDepartamento());

			// Ahora establecemos las relaciones
			elemNombreEmpleado.appendChild(testNombreEmpleado);
			elemApellidoEmpleado.appendChild(testApellidoEmpleado);
			elemEmailEmpleado.appendChild(testEmailEmpleado);
			elemDeptEmpleado.appendChild(testDeptEmpleado);

			// Relación final
			docSalida.appendChild(elemEmpleado);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return docSalida;
	}
	private static void agregarElementoHijo(Document doc, Element padre, String nombreEtiqueta, String valor) {
		if(valor != null) {
			Element hijo = doc.createElement(nombreEtiqueta);
			hijo.appendChild(doc.createTextNode(valor));
			padre.appendChild(hijo);
		}
	}
	private static Document fromListaEmpleado2XML(List<Empleado> listaEmpleados) {
		Document docSalida = null;
		try {
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			docSalida = documentBuilder.newDocument();

			// 1 Creamos un elemento raíz porque hay varios elementos
			Element root = docSalida.createElement("empleados");
			docSalida.appendChild(root);
			// 2 Recorremos la lista de empleados
			for (Empleado objEmplEntrada : listaEmpleados) {
				//Creamos el contenedor de cada empleado
				Element elemEmpleado = docSalida.createElement("empleado");
				root.appendChild(elemEmpleado);
				
				//Añadimos los elementos nombre, apellido, email, dep, etc
				agregarElementoHijo(docSalida, elemEmpleado, "nombre", objEmplEntrada.getNombre());
				agregarElementoHijo(docSalida, elemEmpleado, "apellido", objEmplEntrada.getApellido());
				agregarElementoHijo(docSalida, elemEmpleado, "email", objEmplEntrada.getGmail());
				agregarElementoHijo(docSalida, elemEmpleado, "departamento", objEmplEntrada.getDepartamento());
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return docSalida;
	}

	private static Empleado fromFich2Json(String sNombreFichero) throws IOException {
		Empleado empIn = null;
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + sNombreFichero));
		empIn = gson.fromJson(reader, Empleado.class);
		return empIn;
	}

}
