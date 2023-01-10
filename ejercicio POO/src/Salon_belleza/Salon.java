package Salon_belleza;

import java.util.Arrays;
import java.util.Date;

public class Salon {
    private Cliente [] clientes;
    private Visita [] visitas;
    private int maxNumClientes;
    private int maxNumVisitas;
    Salon(int maxNunCli, int maxNumVis){
        clientes = new Cliente[maxNunCli];
        visitas= new Visita[maxNumVis];
        maxNumClientes=0;
        maxNumVisitas=0;

    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void setVisitas(Visita[] visitas) {
        this.visitas = visitas;
    }

    public void setMaxNumClientes(int maxNumClientes) {
        this.maxNumClientes = maxNumClientes;
    }

    public void setMaxNumVisitas(int maxNumVisitas) {
        this.maxNumVisitas = maxNumVisitas;
    }
    public Cliente[] getClientes() {
        return clientes;
    }

    public Visita[] getVisitas() {
        return visitas;
    }

    public int getMaxNumClientes() {
        return maxNumClientes;
    }

    public int getMaxNumVisitas() {
        return maxNumVisitas;
    }

    public Cliente getCliente(String DNI){
        for (int i=0;i<clientes.length;i++){
            if (clientes[i].getDNI().equals(DNI)){
                System.out.println("SE HA ENCONTRADOO");
                return clientes[i];
            }
        }
        System.out.println("NO SE HA ENCONTRADO");
        return null;
    }
    public void añadircliente(Cliente cliente){
        if (maxNumClientes==clientes.length){
            return ;
        }
        clientes[maxNumClientes]=cliente;
        maxNumClientes++;

    }
    public void bajacliente(Cliente cliente){
       for (int i=0;i<clientes.length;i++){
           if (clientes[i]==cliente){
               cliente.setSocio(false);
           }
       }

    }
    public void setmembresia(String DNI, String membresia){
        Cliente cliente = getCliente(DNI);
        if (cliente == null || !cliente.getSocio()) {
            return;
        }else{
            cliente.setMembresia(membresia);
        }

    }
    public void anadirVisita(Visita visita) {
        if (maxNumVisitas==visitas.length){
            return ;
        }
        visitas[maxNumVisitas]=visita;
        maxNumVisitas++;



    }
    public Visita[] getVisitasCliente(String DNI) {
        int count = 0;
        Cliente cliente = getCliente(DNI);
        if (cliente == null) {
            return null;
        }
        Visita[] visitasCliente = new Visita[maxNumVisitas];
        for (int i = 0; i < maxNumVisitas; i++) {
            if (visitas[i].getClien().getDNI().equals(DNI)) {
                visitasCliente[count] = visitas[i];
                count++;
            }
        }
        return Arrays.copyOfRange(visitasCliente, 0, count);
    }
    public void mostrarClientes(){
        for (int i=0;i<clientes.length;i++){
            System.out.println(clientes[i].toString());
        }




    }
    public void mostrarVisitas() {
        for (int i=0;i<visitas.length;i++){
            System.out.println(visitas[i].toString());
        }
    }









}
