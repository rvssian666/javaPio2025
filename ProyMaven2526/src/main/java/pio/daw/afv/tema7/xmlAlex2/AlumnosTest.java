package pio.daw.afv.tema7.xmlAlex2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class AlumnosTest {
	static String RUTA_FICH = "src\\main\\java\\pio\\daw\\wkh\\tema7\\xmlweikang2\\";
    public static void main(String[] args) {
        String rutaOut = RUTA_FICH+"alumnosOut.xml";
        String rutaIn = RUTA_FICH+"alumnosIn.xml";

        try {
            // 1. Contexto JAXB asociado a la clase contenedora
            JAXBContext contexto = JAXBContext.newInstance(Alumnos.class);

            System.out.println("--- Iniciando proceso de Escritura (Marshalling) ---");
            
            // Crear alumnos
            Alumno a1 = new Alumno(1, "Erwin", "Schrodinger", 7.0);
            Alumno a2 = new Alumno(2, "Guillermo", "Marconi", 8.0);

            // Meterlos en la clase contenedora
            Alumnos misAlumnos = new Alumnos();
            misAlumnos.addAlumno(a1);
            misAlumnos.addAlumno(a2);

            // Objeto Marshaller para escribir
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Escribir al archivo XML
            marshaller.marshal(misAlumnos, new File(rutaOut));
            System.out.println("*** Archivo " + rutaOut + " generado correctamente.\n");

            System.out.println("--- Iniciando proceso de Lectura (Unmarshalling) ---");
            
            // Objeto Unmarshaller para leer
            Unmarshaller unmarshaller = contexto.createUnmarshaller();

            // Leer el xml y mapearlo al objeto Alumnos
            File archivoEntrada = new File(rutaIn);
            if(archivoEntrada.exists()) {
                Alumnos alumnosLeidos = (Alumnos) unmarshaller.unmarshal(archivoEntrada);
                
                System.out.println("*** Datos leídos del archivo " + rutaIn + ":");
                for (Alumno al : alumnosLeidos.getListaAlumnos()) {
                    System.out.println(al.toString());
                }
            } else {
                System.out.println("El archivo " + rutaIn + " no existe. Por favor, créalo primero.");
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}