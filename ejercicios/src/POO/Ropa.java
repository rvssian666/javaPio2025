package POO;

import java.util.ArrayList;
import java.util.List;

public class Ropa {
	public String categoria;
	public String  origen;
	public double price;
	public List<String> tejido;
	
	public Ropa(){
		this.tejido=new ArrayList<>();
		}
	public Ropa(String cat,String o,double p,List<String> t) {
		this.categoria=cat;
		this.origen=o;
		this.price=p;
		this.tejido=t;
		
	}
	
	

	public static void main(String[] args) {
		Ropa prenda=new Ropa();
		Ropa prenda1=new Ropa();
		prenda.categoria="Jeans";
		prenda.origen="India";
		prenda.price=39.99;
		prenda.tejido.add("poliester");
		prenda.tejido.add("cotton");
		prenda.tejido.add("viscose");
		prenda.tejido.add("elastano");
		System.out.println("Descripcion de la prenda "+prenda.categoria);
		System.out.println("Tipo de prenda " + prenda.categoria);
		System.out.println("origen "+ prenda.origen);
		System.out.println("El precio seria "+prenda.price);
		System.out.println("Los tejidos incluidos son "+ prenda.tejido);

}
}
