package org.karamon.poo.intefaces.tienda.dominio;

public class Television extends Electronico {
    private final int pulgadas;

    public Television(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }
}
