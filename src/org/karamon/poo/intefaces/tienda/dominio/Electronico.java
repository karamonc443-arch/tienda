package org.karamon.poo.intefaces.tienda.dominio;

import org.karamon.poo.intefaces.tienda.intefaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    private final String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
