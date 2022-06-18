package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Jugueteria {

    ArrayList<Cliente> clientes = new ArrayList<>();


    public void addCliente(Cliente c) {

        //Si existe se borra de la lista y se añade la nueva informacion
        if (clientes.contains(c)) {
            int posicion = clientes.indexOf(c);
            clientes.remove(posicion);
            System.out.println("Se ha eliminado el cliente");
            clientes.add(c);
            System.out.println("Se ha añadido el cliente nuevo");
        } else {
            clientes.add(c);

        }


    }


    public void listarJuguetesCLiente(Cliente c) {

        if (clientes.contains(c)) {
            if (clientes.isEmpty()) {
                System.out.println("No hay juguetes en la lista");
            } else {
                c.listarJuguetesPrecioFinal();

            }
        } else {
            System.out.println("El cliente no existe en esta jugueteria");
        }

    }

    public void listarCLientes() {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en la lista");
        } else {
            Collections.sort(clientes);
            for(Cliente c:clientes){
                System.out.println(c.getNombre());
            }
        }

    }
}


