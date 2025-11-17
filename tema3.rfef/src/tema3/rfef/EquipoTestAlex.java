package tema3.rfef;

import java.time.LocalDate;

public class EquipoTestAlex {

	public static void main(String[] args) {
		//EquipoFutbolAlex equipo2=new EquipoFutbolAlex("Bayer", "Alemania", "Alianz Arena", null, null, null, null, null, null, null, null, null, null, null, null, null, 0);
		EquipoFutbolAlex equipo1 = new EquipoFutbolAlex(
			    "Real Madrid", // nombreEquipo
			    "Madrid", // ciudad
			    "Santiago Bernabéu", // nombreCampo
			    LocalDate.of(1902, 3, 6), // fechaFundacion

			    new EntrenadorAlex("Pep Guardiola", 50, 20, 30), // entrenador

			    new PorteroAlex("Manuel Neuer", 35, 20), // porteroTitular

			    new DefensaAlex("Gerard Piqué", 34, 8), // centralIzq
			    new DefensaAlex("Sergio Ramos", 35, 10), // centralDer
			    new DefensaAlex("Dani Carvajal", 30, 5), // lateralIzq
			    new DefensaAlex("Marcelo", 33, 7), // lateralDer

			    new CentrocampistaAlex("Luka Modric", 35, 20), // centrocampistaIzq
			    new CentrocampistaAlex("Toni Kroos", 33, 45), // centrocampistaCentral
			    new CentrocampistaAlex("Casemiro", 32, 30), // centrocampistaDer

			    new DelanteroAlex("Eden Hazard", 32, 20), // extremoIzq
			    new DelanteroAlex("Lionel Messi", 34, 70), // delanteroCentro
			    new DelanteroAlex("Karim Benzema", 36, 30), // extremoDer

			    85 // puntosEquipo
			);
	
		



		System.out.println("\n"+equipo1.toString());
		//System.out.println("\n"+equipo2.toString());
	}

}
