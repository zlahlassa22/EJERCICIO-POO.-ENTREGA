import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private int salario;
    private TelefonoMovil movil;
    Empleado(String nomb,int salar, TelefonoMovil mov){
        nombre=nomb;
        salario=salar;
        movil=mov;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }
    public TelefonoMovil getMovil(){
        return movil;
    }

    public String toString() {
        return "Nombre: "+getNombre()+" Salario: "+getSalario()+" Movil: "+getMovil();
    }
    public void trabajo(){
        salario=salario+10;
        movil.llamada(15);
    }
    public void trabajo2(int g, int m){
        salario=salario+g;
        movil.llamada(m);
    }

}
