package Salon_belleza;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Salon salon = new Salon(10, 10);
        Cliente cli1= new Cliente("Maria","12345A");
        Cliente cli2= new Cliente("Fer","12345B");
        Cliente cli3= new Cliente("Wanda","12345C");
        salon.añadircliente(cli1);
        salon.añadircliente(cli2);
        salon.añadircliente(cli3);
        salon.setmembresia("12345A","premium");
        salon.setmembresia("12345B","oro");
        Date date = new Date(2021, 6, 21);
        salon.anadirVisita("12345A",date,96);
        salon.
    }
}



