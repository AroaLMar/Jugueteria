package com.company;

public class Juguete implements Comparable<Juguete> {

    private String nombre;
    private int numJugadores;
    private int edadMinima;
    private float precioBase;


    public Juguete(String nombre, int edadMinima, float precioBase) throws EinvalidPropertyException {
        this.nombre = nombre;
        if (nombre == null) throw new EinvalidPropertyException("El nombre no puede ser nulo");
        this.edadMinima = edadMinima;
        if (edadMinima < 0) throw new EinvalidPropertyException("La edad minima no puede ser menor que cero");
        this.precioBase = precioBase;
        if (precioBase <= 0) throw new EinvalidPropertyException("El precio no puede ser menor o igual que cero");
    }

    public Juguete(String nombre, int numJugadores, int edadMinima, float precioBase) throws EinvalidPropertyException {
        this.nombre = nombre;
        if (nombre == null) throw new EinvalidPropertyException("El nombre no puede ser nulo");
        this.numJugadores = numJugadores;
        if (numJugadores <= 0)
            throw new EinvalidPropertyException("El numero de jugadores no puede ser menor que cero");
        this.edadMinima = edadMinima;
        if (edadMinima < 0) throw new EinvalidPropertyException("La edad minima no puede ser menor que cero");
        this.precioBase = precioBase;
        if (precioBase <= 0) throw new EinvalidPropertyException("El precio no puede ser menor o igual que cero");

    }

    public float getPrecioBase() {
        return precioBase;
    }

    public float getPrecioFinal() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }


    public int compareTo(Juguete other) {
        if (this.precioBase > other.getPrecioBase()) return 1;
        if (this.precioBase < other.getPrecioBase()) return -1;
        return other.getNombre().compareTo(this.nombre) * (-1);
    }


    @Override
    public boolean equals(Object jugueteRepetido) {
        if (this == jugueteRepetido) return true;
        if (jugueteRepetido == null || getClass() != jugueteRepetido.getClass()) return false;
        Juguete juguete = (Juguete) jugueteRepetido;
        return nombre.equals(juguete.nombre);
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", numJugadores=" + numJugadores +
                ", edadMinima=" + edadMinima +
                ", precioBase=" + precioBase +
                ", precioFinal=" + getPrecioFinal() +
                '}';
    }
}

