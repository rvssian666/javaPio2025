package herencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Eventos {
	protected List<Participantes> asistentes;
	protected HashMap<String, List<String>> notification;
	protected static int id;
	protected String name;
	protected String hora;
	protected String tematica;
	protected static double price;

	public Eventos(String n, String h, String tema, double p) {
		// de esta manera el "id" se accede desde la clase y no desde
		// el el objeto (this.id) no esta mal pero ....se ve mejor
		// Eventos.id
		Eventos.id += 1;
		this.hora = h;
		this.name = n;
		this.tematica = tema;
		this.price = p;

	}

	public void addPerson() {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Ingresame tu nombre completo");
		String fullname = sc.nextLine();
		System.out.println("Indicame tu edad");
		age = sc.nextInt();
		while (age < 12) {
			System.out.println("No tienes edad suficiente para asistir al evento");
			break;
		}
		System.out.println("Deme un correo electronico suyo");
		String correoE = sc.nextLine();
		System.out.println("Indiqueme la temática que le gustaria asisistir");
		String tema = sc.nextLine();
		sc.close();
		Participantes persona1 = new Participantes(fullname, age, correoE, tema);
		asistentes.add(persona1);

	}

	public void addNotification(String tema,String notiToSent) {
		if(notification.containsKey(tema)) {
			notification.get(tematica).add(notiToSent);
		}
		
	}

}
