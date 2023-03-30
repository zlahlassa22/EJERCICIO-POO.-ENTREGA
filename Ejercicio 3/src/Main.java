import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String archivo = "C:/Users/zakaria/IdeaProjects/EJERCICIO-POO.-ENTREGA/Ejercicio 3/src/ejercicio3.txt";
        String archivo2 = "C:/Users/zakaria/IdeaProjects/EJERCICIO-POO.-ENTREGA/Ejercicio 3/src/ejercicio3moviles.txt";
        GestorEmpleados ge1 = new GestorEmpleados(archivo);
        ArrayList<Empleado> empleados= new ArrayList<>();
        empleados.add(new Empleado("Zakaria1",1870,new TelefonoMovil(1234,100)));
        empleados.add(new Empleado("Zakaria2",2000,new TelefonoMovil(5678,100)));
        empleados.add(new Empleado("Zakaria3",3000,new TelefonoMovil(9123,100)));
        empleados.add(new Empleado("Zakaria4",4000,new TelefonoMovil(4567,100)));
        empleados.add(new Empleado("Zakaria5",5000,new TelefonoMovil(8912,100)));
        ge1.guardaEmpleados(empleados);
        ge1.mostrar();
        System.out.println(ge1.buscarEmpleado("Zakaria8"));
        ge1.generaFicheroMoviles(archivo2);

    }
}