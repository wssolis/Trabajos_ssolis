/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santiago
 */
public class Estudiante {
    private String ci;
    private String nombre;
    private String apellido;
    private int nivel;

    public Estudiante() {
    }

    public Estudiante(String ci, String nombre, String apellido, int nivel) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Datos del estudiante:\n"
                + "Cedula: "+getCi()+"\n"
                + "Nombre completo: "+getNombre()+" "+getApellido();
                }
    
    
    
}
