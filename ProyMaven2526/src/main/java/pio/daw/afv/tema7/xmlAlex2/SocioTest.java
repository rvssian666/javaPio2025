package pio.daw.afv.tema7.xmlAlex2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class SocioTest {
	static String RUTA_FICH = "src\\main\\java\\pio\\daw\\afv\\tema7\\xmlAlex2\\";
	public static void main(String[] args) {
		try {
			//1 Objeto JAXBContext
			JAXBContext contexto = JAXBContext.newInstance(Socio.class);
			//2 Ojeto Unmarshaller --> deserializador o conversor
			Unmarshaller um = contexto.createUnmarshaller();
			//3 Leer el xml
			Socio objSocio = (Socio) um.unmarshal(new File(RUTA_FICH+"socio.xml"));
			System.out.println("objetoSoci= "+objSocio);
			
			/*
			 * VOLCADO A FICHERO**/
			// 2. Crear el Marshaller (el que escribe)
			Marshaller jaxbMarshaller = contexto.createMarshaller();
			// 3. Configurar para que el XML sea legible (con sangrías)
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// 4. Escribir el objeto wrapper (que contiene la lista) en el archivo
			jaxbMarshaller.marshal(objSocio, new File(RUTA_FICH+"socioOUT.xml"));
			System.out.println("Fichero XML generado correctamente");
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}