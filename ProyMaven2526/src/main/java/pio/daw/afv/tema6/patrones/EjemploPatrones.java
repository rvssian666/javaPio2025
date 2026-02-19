package pio.daw.afv.tema6.patrones;

import java.util.regex.Matcher;//Permite buscar coincidencias con un patron
import java.util.regex.Pattern;//Compila una expresion regular en un patron 

public class EjemploPatrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "hola,mi numero de telefono es 132-456-7688 y mi correo electronico es ejemplo@dominio.com";
		// Creo un patron que busque telefonos con formato xxx-xxx-xxxx
		Pattern patronTelefono = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher macherTelefono = patronTelefono.matcher(texto);
		System.out.println("Inicio de comprobacion ");
		if (macherTelefono.find())
			System.out.println("Numero de telefono encontrado : " + macherTelefono.group());
		else
			System.out.println("Numero de telefono no encontrado ");
		
		//patron correo
		Pattern patronCorreo=Pattern.compile("[A-Za-z0-9._+-]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{2,}");
		Matcher matcherCorreo=patronCorreo.matcher(texto);
		if (matcherCorreo.find())
			System.out.println("Numero de telefono encontrado : " + matcherCorreo.group());
		else
			System.out.println("Numero de telefono no encontrado ");
	}

}
