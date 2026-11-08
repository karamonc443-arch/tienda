package org.karamon.poo.intefaces.tienda.dominio;

public class IPhone extends Electronico {
    private final String modelo;
    private final String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }
}
