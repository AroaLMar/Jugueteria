package com.company;

public class JugueteElectronico extends Juguete {

    private float recargoPrecio;

    public JugueteElectronico(String nombre, int edadMinima, float precioBase, float recargoPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        this.recargoPrecio = recargoPrecio;
        if (recargoPrecio >= precioBase)
            throw new EinvalidPropertyException("El recargo no puede ser mayor o igual que el precio base");
        if (recargoPrecio <= 0) throw new EinvalidPropertyException("Recarno no valido");

    }

    public JugueteElectronico(String nombre, int numJugadores, int edadMinima, float precioBase, float recargoPrecio) throws EinvalidPropertyException {
        super(nombre, numJugadores, edadMinima, precioBase);
        this.recargoPrecio = recargoPrecio;
        if (recargoPrecio > precioBase) throw new EinvalidPropertyException("El recargo no puede ser mayor que cero");
        if (recargoPrecio <= 0) throw new EinvalidPropertyException("Recargo no valido");

    }

    public float getPrecioFinal() {
        return getPrecioBase() + recargoPrecio;
    }
}


