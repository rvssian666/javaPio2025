package tema4;

import javax.sound.sampled.LineUnavailableException;

public class NotaTest {

	public static void main(String[] args) throws LineUnavailableException {
		// TODO Auto-generated method stub
		Nota nota1=new Nota();
		//Nota.suena(8, 6000);
		Nota.suena(6, 2000, 5);
	}

}
