package Salon_belleza;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Cliente cli1=new Cliente("zaka","12345x",true,"oro");
        Cliente cli2=new Cliente("zakaria2","12345Y",true,"premium");
        Cliente cli3 = new Cliente("Zaka3","12345n");
        Date date = new Date(2021, 6, 21);
        Visita vis1 = new Visita(cli1 , date);
        Visita vis2 = new Visita(cli2 , date);
        Visita vis3 = new Visita(cli3 , date);
        vis1.setImportetotal(1000);
        vis2.setImportetotal(100);
        vis3.setImportetotal(50);
       Salon sal = new Salon(3 , 3);
        sal.añadircliente(cli3);
        sal.añadircliente(cli2);
        sal.añadircliente(cli1);
        sal.anadirVisita(vis2);
        sal.anadirVisita(vis3);
        sal.anadirVisita(vis1);
        System.out.println(sal.getCliente("12345x"));
        sal.mostrarClientes();
        sal.bajacliente(cli2);
        System.out.println(cli2.getSocio());
        sal.mostrarVisitas();

    }
}



