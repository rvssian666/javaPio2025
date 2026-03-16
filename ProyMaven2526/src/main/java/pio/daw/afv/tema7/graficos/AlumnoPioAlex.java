package pio.daw.afv.tema7.graficos;

import java.io.Serializable;

import java.io.Serializable;

/**
 * Clase AlumnoPio con campos específicos.
 * Implementa Serializable para permitir la persistencia de datos.
 */
public class AlumnoPioAlex implements Serializable {

    // Recomendado para asegurar la compatibilidad en la serialización
    private static final long serialVersionUID = 1L;

    // Atributos privados
    private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String nia;
    private String ciclo;
    private String curso;

    // Constructor vacío
    public AlumnoPioAlex() {
    }

    // Constructor con todos los campos
    public AlumnoPioAlex(String dni, String nombre, String primerApellido, 
                            String segundoApellido, String nia, String ciclo, String curso) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nia = nia;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    // Métodos Getter y Setter
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }

    public String getNia() { return nia; }
    public void setNia(String nia) { this.nia = nia; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    // Método toString para representar el objeto como cadena de texto
    @Override
    public String toString() {
        return "AlumnoPioAlex [" +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", 1º Apellido='" + primerApellido + '\'' +
                ", 2º Apellido='" + segundoApellido + '\'' +
                ", NIA='" + nia + '\'' +
                ", Ciclo='" + ciclo + '\'' +
                ", Curso='" + curso + '\'' +
                ']';
    }
}