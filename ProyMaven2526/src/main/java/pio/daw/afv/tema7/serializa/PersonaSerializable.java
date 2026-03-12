package pio.daw.afv.tema7.serializa;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class PersonaSerializable {
	final static String RUTA_FICH="src\\main\\java\\pio\\daw\\afv\\tema7\\serializa\\";
	public static void main(String[] args) throws ClassNotFoundException {
		 PersonaDTO[] listaPersonas=new PersonaDTO[4];
		 listaPersonas[0]=new PersonaDTO("Pepe", 20);
		 listaPersonas[1]=new PersonaDTO("Guiomar", 18);
		 listaPersonas[2]=new PersonaDTO("Jimena", 22);
		 listaPersonas[3]=new PersonaDTO("Pepe", 21);
		 
		 
		 //mostrar por consola la lista de personas 
		 System.out.println("Lista de personas a volcar a fichero: " +Arrays.deepToString(listaPersonas));
		 try(ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream(RUTA_FICH+"personas.dat"));){
			 salida.writeObject(listaPersonas);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //ahora montamos un array de objetos PersonasDTO leyendo personas.dat
		 try(ObjectInputStream entrada =new ObjectInputStream(new FileInputStream(RUTA_FICH+"personas.dat"))){
			 PersonaDTO [] listaPersonaIn= (PersonaDTO[]) entrada.readObject();
			 System.out.println("Lista de personas leidas de fichero:"+ Arrays.deepToString(listaPersonaIn));
			 
		 }//fin try 
		 catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}

}
