package pio.daw.afv.tema7.xmlAlex2;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "alumnos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumnos {

    @XmlElement(name = "alumno")
    private List<Alumno> listaAlumnos = new ArrayList<>();

    // Getters y Setters
    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public void addAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }
}