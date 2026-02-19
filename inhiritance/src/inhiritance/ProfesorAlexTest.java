package inhiritance;
import java.util.Calendar;
public class ProfesorAlexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fecha=Calendar.getInstance();
		fecha.set(2020, Calendar.SEPTEMBER,1);
		ProfesorInterinoAlex profeInterino1=new ProfesorInterinoAlex("avavvav", "Jose", "Hernandez", 45, 1700.0f,ProfesorAlex.ASIGNATURAS.BBDD,fecha);
		
		
		System.out.println("Listado claustro profesores*******");
		System.out.println(profeInterino1.toString());
	}
	
	
	

}
