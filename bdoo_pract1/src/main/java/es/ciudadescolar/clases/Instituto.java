package es.ciudadescolar.clases;

import java.util.List;

public class Instituto {

    private String nombre;
    private String identificador;
    private List<Alumno> listaAlumnos;
    
    public Instituto(String nombre, String identificador, List<Alumno> listaAlumnos) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.listaAlumnos = listaAlumnos;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return nombre + "|" + identificador + "|" + listaAlumnos;
    }

    
}
