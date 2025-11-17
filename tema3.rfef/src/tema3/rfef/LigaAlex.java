package tema3.rfef;

import java.util.Random;

public class LigaAlex {

	private EquipoFutbolAlex equipo1;
	private EquipoFutbolAlex equipo2;
	private EquipoFutbolAlex equipo3;
	private EquipoFutbolAlex equipo4;

	public LigaAlex(EquipoFutbolAlex equipo1, EquipoFutbolAlex equipo2, EquipoFutbolAlex equipo3,
			EquipoFutbolAlex equipo4) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
	}

	public EquipoFutbolAlex getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(EquipoFutbolAlex equipo1) {
		this.equipo1 = equipo1;
	}

	public EquipoFutbolAlex getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(EquipoFutbolAlex equipo2) {
		this.equipo2 = equipo2;
	}

	public EquipoFutbolAlex getEquipo3() {
		return equipo3;
	}

	public void setEquipo3(EquipoFutbolAlex equipo3) {
		this.equipo3 = equipo3;
	}

	public EquipoFutbolAlex getEquipo4() {
		return equipo4;
	}

	public void setEquipo4(EquipoFutbolAlex equipo4) {
		this.equipo4 = equipo4;
	}

	
	public void simularPartido(EquipoFutbolAlex e1, EquipoFutbolAlex e2) {
		Random ra = new Random();
		int scoreE1 = ra.nextInt(4); // Genera un marcador aleatorio de 0-4
		int scoreE2 = ra.nextInt(4);

		System.out.println(e1.getNombreEquipo() + " " + scoreE1 + " -- " + scoreE2 + " " + e2.getNombreEquipo());

		if (scoreE1 > scoreE2) {
			e1.setPuntos(e1.getPuntos() + 3);
			e1.getPorteroTitular().setGolesRecibidos(e1.getPorteroTitular().getGolesRecibidos() + scoreE2);
			e2.getPorteroTitular().setGolesRecibidos(e2.getPorteroTitular().getGolesRecibidos()+scoreE1);

			switch (scoreE1) {
			case 0: {
				e1.getExtremoIzq().setGolesAnotados(scoreE1);
				break;
			}
			case 1: {
				e1.getExtremoDcha().setGolesAnotados(scoreE1);
				break;
			}
			case 2: {
				e1.getExtremoDcha().setGolesAnotados(scoreE1);
				e1.getCentrocampista1().setNumAsistencias(scoreE1 - 1);
				e1.getCentrocampista2().setNumAsistencias(scoreE1 - 1);
				break;
			}
			case 3: {
				e1.getDelanteroCentro().setGolesAnotados(scoreE1);
				e1.getCentrocampista1().setNumAsistencias(scoreE1 - 1);
				e1.getCentrocampista2().setNumAsistencias(scoreE1 - 2);
				break;
			}
			case 4: {
				e1.getDelanteroCentro().setGolesAnotados(scoreE1);
				e1.getCentrocampista3().setNumAsistencias(scoreE1);
				break;
			}
			}

		} else if (scoreE2 > scoreE1) {
			e2.setPuntos(e2.getPuntos() + 3);
			e2.getPorteroTitular().setGolesRecibidos(e2.getPorteroTitular().getGolesRecibidos() + scoreE1);
			e1.getPorteroTitular().setGolesRecibidos(e1.getPorteroTitular().getGolesRecibidos() + scoreE2);

			switch (scoreE2) {
			case 0: {
				e2.getExtremoIzq().setGolesAnotados(scoreE2);
				break;
			}
			case 1: {
				e2.getExtremoDcha().setGolesAnotados(scoreE2);
				break;
			}
			case 2: {
				e2.getExtremoDcha().setGolesAnotados(scoreE2);
				e2.getCentrocampista1().setNumAsistencias(scoreE2 - 1);
				e2.getCentrocampista2().setNumAsistencias(scoreE2 - 1);
				break;
			}
			case 3: {
				e2.getDelanteroCentro().setGolesAnotados(scoreE2);
				e2.getCentrocampista1().setNumAsistencias(scoreE2 - 1);
				e2.getCentrocampista2().setNumAsistencias(scoreE2 - 2);
				break;
			}
			case 4: {
				e2.getDelanteroCentro().setGolesAnotados(scoreE2);
				e2.getCentrocampista3().setNumAsistencias(scoreE2);
				break;
			}
			}

		} else { // EMPATE
			e1.setPuntos(e1.getPuntos() + 1);
			e2.setPuntos(e2.getPuntos() + 1);

			// Ambos porteros reciben goles
			e1.getPorteroTitular().setGolesRecibidos(e1.getPorteroTitular().getGolesRecibidos() + scoreE2);
			e2.getPorteroTitular().setGolesRecibidos(e2.getPorteroTitular().getGolesRecibidos() + scoreE1);

			// Distribuir goles para e1
			switch (scoreE1) {
			case 1:
				e1.getDelanteroCentro().setGolesAnotados(1);
				break;
			case 2: {
				e1.getExtremoIzq().setGolesAnotados(1);
				e1.getExtremoDcha().setGolesAnotados(1);
				break;
			}
			case 3: {
				e1.getDelanteroCentro().setGolesAnotados(2);
				e1.getExtremoDcha().setGolesAnotados(1);
				break;
			}
			}

			// Distribuir goles para e2
			switch (scoreE2) {
			case 1:
				e2.getDelanteroCentro().setGolesAnotados(1);
				break;
			case 2: {
				e2.getExtremoIzq().setGolesAnotados(1);
				e2.getExtremoDcha().setGolesAnotados(1);
				break;
			}
			case 3: {
				e2.getDelanteroCentro().setGolesAnotados(2);
				e2.getExtremoDcha().setGolesAnotados(1);
				break;
			}
			}
		}
	}

	public void listarPuntos() {
		// Mostrar puntos de cada equipo
		System.out.println(equipo1.getNombreEquipo() + " tiene: " + equipo1.getPuntos() + " puntos");
		System.out.println(equipo2.getNombreEquipo() + " tiene: " + equipo2.getPuntos() + " puntos");
		System.out.println(equipo3.getNombreEquipo() + " tiene: " + equipo3.getPuntos() + " puntos");
		System.out.println(equipo4.getNombreEquipo() + " tiene: " + equipo4.getPuntos() + " puntos \n");

		System.out.println("*******Clasificación*******");

		// Variables auxiliares para ordenar
		EquipoFutbolAlex primero = equipo1;
		EquipoFutbolAlex segundo = equipo2;
		EquipoFutbolAlex tercero = equipo3;
		EquipoFutbolAlex cuarto = equipo4;

		// Ordenar manualmente con comparaciones (tipo burbuja pero con ifs)
		if (segundo.getPuntos() > primero.getPuntos()) {
			EquipoFutbolAlex temp = primero;
			primero = segundo;
			segundo = temp;
		}
		if (tercero.getPuntos() > primero.getPuntos()) {
			EquipoFutbolAlex temp = primero;
			primero = tercero;
			tercero = temp;
		}
		if (cuarto.getPuntos() > primero.getPuntos()) {
			EquipoFutbolAlex temp = primero;
			primero = cuarto;
			cuarto = temp;
		}
		if (tercero.getPuntos() > segundo.getPuntos()) {
			EquipoFutbolAlex temp = segundo;
			segundo = tercero;
			tercero = temp;
		}
		if (cuarto.getPuntos() > segundo.getPuntos()) {
			EquipoFutbolAlex temp = segundo;
			segundo = cuarto;
			cuarto = temp;
		}
		if (cuarto.getPuntos() > tercero.getPuntos()) {
			EquipoFutbolAlex temp = tercero;
			tercero = cuarto;
			cuarto = temp;
		}

		// Mostrar clasificación final
		System.out.println("1º " + primero.getNombreEquipo() + " (" + primero.getPuntos() + " pts)");
		System.out.println("2º " + segundo.getNombreEquipo() + " (" + segundo.getPuntos() + " pts)");
		System.out.println("3º " + tercero.getNombreEquipo() + " (" + tercero.getPuntos() + " pts)");
		System.out.println("4º " + cuarto.getNombreEquipo() + " (" + cuarto.getPuntos() + " pts)");
		System.out.println();
		System.out.println("Campéon de la Liga "+ primero.getNombreEquipo());
		System.out.println("Desciende a 2da división "+ cuarto.getNombreEquipo());
	}

	public void mostrarPichichi() {
		// Empezamos suponiendo que el pichichi es el delantero centro del equipo1
		DelanteroAlex pichichi = equipo1.getDelanteroCentro();

		// Comparaciones manuales con los demás delanteros
		if (equipo1.getExtremoIzq().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo1.getExtremoIzq();
		}
		if (equipo1.getExtremoDcha().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo1.getExtremoDcha();
		}

		if (equipo2.getDelanteroCentro().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo2.getDelanteroCentro();
		}
		if (equipo2.getExtremoIzq().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo2.getExtremoIzq();
		}
		if (equipo2.getExtremoDcha().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo2.getExtremoDcha();
		}

		// Repetir lo mismo para equipo3 y equipo4
		if (equipo3.getDelanteroCentro().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo3.getDelanteroCentro();
		}
		if (equipo3.getExtremoIzq().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo3.getExtremoIzq();
		}
		if (equipo3.getExtremoDcha().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo3.getExtremoDcha();
		}

		if (equipo4.getDelanteroCentro().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo4.getDelanteroCentro();
		}
		if (equipo4.getExtremoIzq().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo4.getExtremoIzq();
		}
		if (equipo4.getExtremoDcha().getGolesAnotados() > pichichi.getGolesAnotados()) {
			pichichi = equipo4.getExtremoDcha();
		}

		// Mostrar resultado
		System.out.println(
				"🏆 Pichichi de la liga: " + pichichi.getNombre() + " con " + pichichi.getGolesAnotados() + " goles");
	}

	public void mostrarZamora() {
		// Empezamos suponiendo que el Zamora es el portero del equipo1
		PorteroAlex zamora = equipo1.getPorteroTitular();

		// Comparaciones manuales
		if (equipo2.getPorteroTitular().getGolesRecibidos() < zamora.getGolesRecibidos()) {
			zamora = equipo2.getPorteroTitular();
		}
		if (equipo3.getPorteroTitular().getGolesRecibidos() < zamora.getGolesRecibidos()) {
			zamora = equipo3.getPorteroTitular();
		}
		if (equipo4.getPorteroTitular().getGolesRecibidos() < zamora.getGolesRecibidos()) {
			zamora = equipo4.getPorteroTitular();
		}

		// Mostrar resultado
		System.out.println("🧤 Zamora de la liga: " + zamora.getNombre() + " con " + zamora.getGolesRecibidos()
				+ " goles recibidos");
	}

	@Override
	public String toString() {
		return "LigaAlex [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", equipo3=" + equipo3 + ", equipo4=" + equipo4
				+ "]";
	}

}