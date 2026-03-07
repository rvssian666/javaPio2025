package pio.daw.afv.tema7.lectura;

public class AlumnoPio {
	private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int nia;
    private String ciclo;
    private int curso;

    // Constructor vacío
    public AlumnoPio() {
    }

    // Constructor completo
    public AlumnoPio(String dni, String nombre, String primerApellido,
                     String segundoApellido, int nia, String ciclo, int curso) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nia = nia;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    // Getters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getPrimerApellido() { return primerApellido; }
    public String getSegundoApellido() { return segundoApellido; }
    public int getNia() { return nia; }
    public String getCiclo() { return ciclo; }
    public int getCurso() { return curso; }

    // Setters
    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }
    public void setNia(int nia) { this.nia = nia; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
    public void setCurso(int curso) { this.curso = curso; }

    // toString
    @Override
    public String toString() {
        return "AlumnoPio [dni=" + dni + ", nombre=" + nombre +
               ", primerApellido=" + primerApellido +
               ", segundoApellido=" + segundoApellido +
               ", nia=" + nia + ", ciclo=" + ciclo + ", curso=" + curso + "]";
    }
}
