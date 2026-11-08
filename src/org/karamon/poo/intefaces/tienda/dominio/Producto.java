package org.karamon.poo.intefaces.tienda.dominio;

import org.karamon.poo.intefaces.tienda.intefaces.IProducto;

public abstract class Producto implements IProducto {
    private final int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
