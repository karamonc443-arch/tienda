package org.karamon.poo.intefaces.tienda.dominio;

import org.karamon.poo.intefaces.tienda.intefaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private final Date fechaPublicacion = new Date();
    private final String autor;
    private final String titulo;
    private final String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }
}
