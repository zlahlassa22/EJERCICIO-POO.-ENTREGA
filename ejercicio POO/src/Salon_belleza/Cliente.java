package Salon_belleza;

public class Cliente {
    private String nombre;
    private String DNI;
    private boolean socio;
    private String membresia;

    Cliente(String n, String D,boolean s, String m){
        nombre=n;
        DNI=D;
        socio=s;
        membresia=m;
    }
    Cliente(String n,String D){
        nombre=n;
        DNI=D;
        socio=false;
    }
    String getNombre(){
        return nombre;
    }
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String getDNI(){
        return DNI;
    }
    void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public boolean isSocio() {
        return socio;
    }
    public void setSocio(boolean socio) {
        this.socio = socio;
    }
    public String getMembresia() {
        return membresia;
    }
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }


    Double getdescuento(){
        if (socio==false){
            return 0.0;
        }
        if (membresia.equals("platino")){
            return 0.1;
        } else if (membresia.equals("oro")) {
            return 0.15;
        } else if (membresia.equals("premium")) {
            return 0.2;
        }else{
            return 0.0;
        }


    }
    public String toString(){
        String estadoSocio = socio ? "sí" : "no";
        return "Nombre: " + nombre + ", DNI: " + DNI + ", es socio: " + estadoSocio + ", membresía: " + membresia;
    }

    }




