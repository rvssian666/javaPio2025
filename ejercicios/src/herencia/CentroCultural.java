package herencia;

import java.util.ArrayList;
import java.util.List;

public class CentroCultural {
	private String name;
	private List<Eventos> centroCultural;
	
	
	public CentroCultural(String name) {
		centroCultural=new ArrayList<Eventos>();
		this.name=name;
		
	}
	

}
