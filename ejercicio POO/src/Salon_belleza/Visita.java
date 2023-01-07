package Salon_belleza;
import java.util.Date;
public class Visita {
    Cliente clien;
    private Date fecha;
    double importetotal;

    Visita(Cliente cl, Date fe){
        clien=cl;
        fecha=fe;
        importetotal=0;
    }
    Date getFecha(){
        return fecha;
    }
    void setImporteTotal(double importe) {
        double descuento = clien.getdescuento();
        this.importetotal = importe - (importe * descuento);
    }
    public String toString(){
        return "cliente: "+clien.getNombre()+" fecha: "+fecha+" importe: "+importetotal;
    }



}
