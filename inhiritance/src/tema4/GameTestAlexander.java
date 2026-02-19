package tema4;

import java.util.Random;

import pio.daw.catalog.game.GameException;
import pio.daw.catalog.game.GameUtil;
import pio.daw.catalog.game.GameUtil.GameOptions;

public class GameTestAlexander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Iniciando el juego.....");

			for (int i = 0; i < 10; i++) {
				GameUtil.GameOptions gamer1 = jugada();
				GameUtil.GameOptions gamer2 = jugada();
				int iRes = GameUtil.rockPaperScissors(gamer1, gamer2);
				System.out.println("Quien ha ganado el juego??" + iRes);

			}
		} catch (GameException gex) {
			gex.printStackTrace();
		}
	}

	private static GameOptions jugada() throws GameException {
		Random rd = new Random();
		int randomNumber = rd.nextInt(3);
		switch (randomNumber) {
		case 0: {
			return GameOptions.rock;

		}
		case 1: {
			return GameOptions.paper;

		}
		case 2: {
			return GameOptions.scissors;

		}
		default:
			break;
		}
		return null;

	}

	public static void contarGanadoresEmpatesRonda() throws GameException {
		int contEmpates=0;
		int contGanarG1=0;
		int contGanarG2=0;
		for (int i = 0; i < 1000; i++) {
			jugada();

		}
	}

}
