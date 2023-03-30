import java.io.Serializable;

public class TelefonoMovil implements Serializable {
    private int numero;
    private int credito;
    TelefonoMovil(int num, int cre){
        numero=num;
        credito=cre;

    }

    public int getNumero() {
        return numero;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String toString() {
        return "Numero: "+getNumero()+" Credito: "+getCredito();
    }
    public void recarga(int s){
        credito=credito+s;
    }
    public void llamada(int minutos){
        minutos=minutos*2;
        credito=credito-minutos;
    }


}
