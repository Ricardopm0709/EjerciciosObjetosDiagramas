package com.biblioteca.mantener;

public class Libro extends General {

    private int edicion;
    private int añoPublicacion;
    private  Autor autor;

    public Libro() {

    }

    public Libro(int edicion, int añoPublicacion, Autor autor) {
        this.edicion = edicion;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getEdicion () {
        return edicion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro {" + "Edicion =" + edicion + ", Año de Publicacion = " + añoPublicacion + "Autor = " + autor + '}';
    }
}
