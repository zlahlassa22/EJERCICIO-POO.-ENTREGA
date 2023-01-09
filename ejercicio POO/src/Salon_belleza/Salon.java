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
    public Cliente getCliente(String DNI){
        for (int i=0;i<maxNumClientes;i++){
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
    public void bajacliente(String DNI){
        Cliente cliente = getCliente(DNI);
        if (cliente == null || !cliente.isSocio()) {
            return;
        }
        cliente.setSocio(false);
        cliente.setMembresia(null);

    }
    public void setmembresia(String DNI, String membresia){
        Cliente cliente = getCliente(DNI);
        if (cliente == null || !cliente.isSocio()) {
            return;
        }
        cliente.setMembresia(membresia);
    }
    public void anadirVisita(String DNI, Date fecha, double importe) {
        Cliente cliente = getCliente(DNI);
        if (cliente == null || maxNumVisitas == visitas.length) {
            return;
        }
        Visita visita = new Visita(cliente, fecha, importe);
        visitas[maxNumVisitas] = visita;
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
            if (visitas[i].clien.getDNI().equals(DNI)) {
                visitasCliente[count] = visitas[i];
                count++;
            }
        }
        return Arrays.copyOfRange(visitasCliente, 0, count);
    }
    public void mostrarClientes(){

        for (Cliente cliente: clientes){
            System.out.println(clientes.toString());
        }
    }
    public void mostrarVisitas() {
        for (Visita visita : visitas) {
            System.out.println(visita.toString());
        }
    }









}
