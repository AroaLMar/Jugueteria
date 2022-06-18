package com.company;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) throws EinvalidPropertyException {


        //JUGUETES
        Juguete j1 = new Juguete("Bici", 7, 133.5F);
        Juguete j2 = new Juguete("Muñeca",  8, 15.5F);
        Juguete j3 = new Juguete("Lego", 2,7, 23.5F);
        Juguete j4 = new JugueteEducativo("Puzzle", 7, 23.5F, 9, 12.5F);
        Juguete j5 = new JugueteElectronico("Consola", 4, 8, 450f, 50F);
        Juguete j6 =new Juguete("Muñeca",  18, 15.5F);


        //CREAMOS CLIENTES Y LES AÑADIMOS LOS JUGUETES

        Cliente cli = new Cliente("Guille", new ArrayList<Juguete>());
        cli.addJuguete(j1);
        cli.addJuguete(j4);
        cli.addJuguete(j5);


        Cliente cli2 = new Cliente("Beatriz", new ArrayList<Juguete>());
        cli2.addJuguete(j2);
        cli2.addJuguete(j3);
        cli2.addJuguete(j6);


        Cliente cli3= new Cliente("Guille", new ArrayList<Juguete>());
        cli3.addJuguete(j6);




        //CREAMOS JUGUETERIA Y LE AÑADIMOS 2 CLIENTES
        Jugueteria jug1 = new Jugueteria();
        jug1.addCliente(cli);
        jug1.addCliente(cli2);
        jug1.addCliente(cli3);



        //LISTAR CLIENTES ORDENADOR POR NOMBRE
        System.out.println("CLIENTES:");
        jug1.listarCLientes();
        System.out.println();

        //LISTAR JUGUETES CLIENTES

        System.out.println("JUGUETES, CLIENTE:"+cli.getNombre());
        jug1.listarJuguetesCLiente(cli);
        System.out.println();

        //LISTAR JUGUETES DE UN CLIENTE POR PRECIO BASE

        System.out.println("JUGUETES, CLIENTE:"+cli2.getNombre());
        cli2.listarJuguetesPrecioBase();


    }
}
