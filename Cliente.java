package com.company;


import java.util.ArrayList;
import java.util.Collections;
;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private ArrayList<Juguete> juguetes;

    public Cliente(String nombre, ArrayList<Juguete> juguetes) {
        this.nombre = nombre;
        this.juguetes = juguetes;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object clienteRepetido) {
        if (this == clienteRepetido) return true;
        if (clienteRepetido == null || getClass() != clienteRepetido.getClass()) return false;
        Cliente cliente = (Cliente) clienteRepetido;
        return nombre.equals(cliente.getNombre());
    }

    public void addJuguete(Juguete j) {

        //Si existe se borra de la lista y se añade la nueva informacion
        if (juguetes.contains(j)) {
            int posicion = juguetes.indexOf(j);
            juguetes.remove(posicion);
            System.out.println("Se ha eliminado el juguete");
            juguetes.add(j);
            System.out.println("Se ha añadido el juguete nuevo");
        } else {
            juguetes.add(j);

        }


    }

    public float calcularGasto() {
        float precioTotal = 0;
        for (Juguete ju : juguetes) {
            precioTotal += ju.getPrecioFinal();
        }
        return precioTotal;
    }

    public void listarJuguetesPrecioBase() {

        if (juguetes.isEmpty()) {
            System.out.println("No hay juguetes en la lista");
        } else {
            Collections.sort(juguetes);
            for(Juguete j:juguetes){
                System.out.println(j);
            }
        }
    }

    public void listarJuguetesPrecioFinal() {
        if (juguetes.isEmpty()) {
            System.out.println("No hay juguetes en la lista");
        } else {
            Collections.sort(juguetes, new CompararJuguetePrecioFinal());
            for(Juguete j:juguetes){
                System.out.println(j);
            }
        }
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", juguetes=" + juguetes +
                '}';
    }

    @Override
    public int compareTo(Cliente other) {

        return other.getNombre().compareTo(this.nombre) * (-1);

    }
}
