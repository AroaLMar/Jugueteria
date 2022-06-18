package com.company;

public class JugueteEducativo extends Juguete {

    private int edadMaxima;
    private float bonificacionPrecio;

    public JugueteEducativo(String nombre, int edadMinima, float precioBase, int edadMaxima, float bonificacionPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        this.edadMaxima = edadMaxima;
        if (edadMaxima <= edadMinima)
            throw new EinvalidPropertyException("La edad maxima no puede ser menor a la edad minima");
        this.bonificacionPrecio = bonificacionPrecio;
        if (bonificacionPrecio >= precioBase)
            throw new EinvalidPropertyException("La bonificacion no puede ser mayor o igual que el precio base");
        if (bonificacionPrecio <= 0) throw new EinvalidPropertyException("Bonificacion no valida");

    }

    public JugueteEducativo(String nombre, int numJugadores, int edadMinima, float precioBase) throws EinvalidPropertyException {
        super(nombre, numJugadores, edadMinima, precioBase);
    }

    public float getPrecioFinal() {
        return getPrecioBase() - bonificacionPrecio;
    }
}


