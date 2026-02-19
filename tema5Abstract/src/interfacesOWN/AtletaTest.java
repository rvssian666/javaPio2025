package interfacesOWN;

public class AtletaTest {

	public static void main(String[] args) {
		Entrenable atleta1=new Atleta();
		Competidor atleta2=new Atleta();
		Atleta atleta3=new Atleta();
		
		((Atleta) atleta1).competir();
		atleta1.entrenar();
		((Atleta) atleta1).descansar();

	}

}
