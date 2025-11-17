package tema3.rfef;

import java.time.LocalDate;

public class LigaTestAlex {

	

	public static void main(String[] args) {
		EquipoFutbolAlex equipo1 = new EquipoFutbolAlex(
			    "Real Madrid",
			    "España",
			    "Santiago Bernabéu",
			    LocalDate.of(1902, 3, 6),
			    new EntrenadorAlex("Carlo Ancelotti", 65, 40, 25), // edad, experiencia, títulos
			    new PorteroAlex("Thibaut Courtois", 33, 0),
			    new DefensaAlex("Éder Militão", 28, 0),
			    new DefensaAlex("David Alaba", 32, 0),
			    new DefensaAlex("Antonio Rüdiger", 31, 0),
			    new DefensaAlex("Ferland Mendy", 30, 0),
			    new CentrocampistaAlex("Toni Kroos", 35, 0),
			    new CentrocampistaAlex("Luka Modric", 39, 0),
			    new CentrocampistaAlex("Federico Valverde", 27, 0),
			    new DelanteroAlex("Vinícius Jr.", 25, 0),
			    new DelanteroAlex("Rodrygo Goes", 24, 0),
			    new DelanteroAlex("Kylian Mbappé", 26, 0),
			    0
			);

			EquipoFutbolAlex equipo2 = new EquipoFutbolAlex(
			    "FC Barcelona",
			    "España",
			    "Spotify Camp Nou",
			    LocalDate.of(1899, 11, 29),
			    new EntrenadorAlex("Xavi Hernández", 45, 15, 5),
			    new PorteroAlex("Marc-André ter Stegen", 33, 0),
			    new DefensaAlex("Ronald Araújo", 28, 0),
			    new DefensaAlex("Jules Koundé", 27, 0),
			    new DefensaAlex("Andreas Christensen", 30, 0),
			    new DefensaAlex("Alejandro Balde", 23, 0),
			    new CentrocampistaAlex("Pedri", 24, 0),
			    new CentrocampistaAlex("Gavi", 22, 0),
			    new CentrocampistaAlex("Frenkie de Jong", 29, 0),
			    new DelanteroAlex("Robert Lewandowski", 36, 0),
			    new DelanteroAlex("Raphinha", 29, 0),
			    new DelanteroAlex("Lamine Yamal", 20, 0),
			    0
			);

			EquipoFutbolAlex equipo3 = new EquipoFutbolAlex(
			    "Bayern Múnich",
			    "Alemania",
			    "Allianz Arena",
			    LocalDate.of(1900, 2, 27),
			    new EntrenadorAlex("Thomas Tuchel", 52, 20, 10),
			    new PorteroAlex("Manuel Neuer", 39, 0),
			    new DefensaAlex("Matthijs de Ligt", 28, 0),
			    new DefensaAlex("Dayot Upamecano", 29, 0),
			    new DefensaAlex("Kim Min-jae", 28, 0),
			    new DefensaAlex("Alphonso Davies", 25, 0),
			    new CentrocampistaAlex("Joshua Kimmich", 30, 0),
			    new CentrocampistaAlex("Leon Goretzka", 31, 0),
			    new CentrocampistaAlex("Jamal Musiala", 23, 0),
			    new DelanteroAlex("Serge Gnabry", 30, 0),
			    new DelanteroAlex("Harry Kane", 32, 0),
			    new DelanteroAlex("Kingsley Coman", 29, 0),
			    0
			);

			EquipoFutbolAlex equipo4 = new EquipoFutbolAlex(
			    "Paris Saint-Germain",
			    "Francia",
			    "Parc des Princes",
			    LocalDate.of(1970, 8, 12),
			    new EntrenadorAlex("Luis Enrique", 55, 25, 12),
			    new PorteroAlex("Keylor Navas", 38, 0),
			    new DefensaAlex("Marquinhos", 31, 0),
			    new DefensaAlex("Presnel Kimpembe", 30, 0),
			    new DefensaAlex("Achraf Hakimi", 28, 0),
			    new DefensaAlex("Lucas Hernández", 29, 0),
			    new CentrocampistaAlex("Vitinha", 26, 0),
			    new CentrocampistaAlex("Warren Zaïre-Emery", 22, 0),
			    new CentrocampistaAlex("Marco Asensio", 29, 0),
			    new DelanteroAlex("Ousmane Dembélé", 28, 0),
			    new DelanteroAlex("Gonçalo Ramos", 26, 0),
			    new DelanteroAlex("Kolo Muani", 27, 0),
			    0
			);


		//Creamos una liga 
		LigaAlex ChampionsLeague=new LigaAlex(equipo1,equipo2,equipo3,equipo4);
		System.out.println("\n *******Empieza la Liga********");
		//Simular jornadad de la Liga
		ChampionsLeague.simularPartido(equipo1, equipo2);
		ChampionsLeague.simularPartido(equipo1, equipo3);
		ChampionsLeague.simularPartido(equipo1, equipo4);
		ChampionsLeague.simularPartido(equipo2, equipo3);
		ChampionsLeague.simularPartido(equipo2, equipo4);
		ChampionsLeague.simularPartido(equipo3, equipo4);
		System.out.println("\n********Puntos tras la primera jornada********");
		//Imprimir resultados
		ChampionsLeague.listarPuntos();
		System.out.println();
		ChampionsLeague.mostrarPichichi();
		ChampionsLeague.mostrarZamora();

	}

}
