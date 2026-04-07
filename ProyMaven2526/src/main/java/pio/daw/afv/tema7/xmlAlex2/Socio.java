package pio.daw.afv.tema7.xmlAlex2;

import javax.xml.bind.annotation.*;
//Usamos anotaciones para decir que esta clase es espejo de un xml
@XmlRootElement(name="socio") //El element raíz es socio
//Indicamos ahora el orden de los campos
@XmlType(propOrder= {"nombreSocio", "direccion", "fechaAlta"})
//Ahora usamos la propiedad XmlAccessType.FIELD para decirle a JAXB que acceda directamente a los campos de la clase
@XmlAccessorType(XmlAccessType.FIELD)

public class Socio {
	@XmlAttribute(required=true)
	private Integer id;
	@XmlElement(name="nombre")
	private String nombreSocio;
	@XmlElement(name="direccion")
	private String direccion;
	@XmlElement(name="alta")
	private String fechaAlta;
	
	public Socio() {
		super();
	}
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombreSocio=" + nombreSocio + ", direccion=" + direccion + ", fechaAlta="
				+ fechaAlta + "]";
	}
	public Socio(Integer id, String nombreSocio, String direccion, String fechaAlta) {
		super();
		this.id = id;
		this.nombreSocio = nombreSocio;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
	}

}