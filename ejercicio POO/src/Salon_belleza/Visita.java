package Salon_belleza;
import java.util.Date;
public class Visita {
    private Cliente clien;
    private Date fecha;
    private double importetotal;

    Visita(Cliente cl, Date fe){
        clien=cl;
        fecha=fe;
        importetotal=0;
    }

    public void setClien(Cliente clien) {
        this.clien = clien;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setImportetotal(double importetotal) {
        this.importetotal = importetotal;
    }
    public Cliente getClien(){
        return clien;
    }
    Date getFecha(){
        return fecha;
    }

    public double getImportetotal() {
        return importetotal;
    }

    void Importefinal(double importe) {
        double descuento = clien.getdescuento();
        importe = importe - (importe * descuento);
    }
    public String toString(){
        return "clientee: "+clien.toString()+" fecha: "+getFecha()+" importe: "+getImportetotal()+" ";
    }



}
