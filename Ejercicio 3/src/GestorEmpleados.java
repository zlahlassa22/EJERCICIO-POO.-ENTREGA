import java.io.*;
import java.util.ArrayList;

public class GestorEmpleados {
    private String archivo;
    GestorEmpleados(String arch){
        archivo=arch;
    }
    public void guardaEmpleados(ArrayList<Empleado> empleados){
        FileOutputStream doc= null;
        ObjectOutputStream doc2=null;
        try {
            doc=new FileOutputStream(archivo);
            doc2=new ObjectOutputStream(doc);
            for (int i = 0; i < empleados.size(); i++) {
                doc2.writeObject(empleados.get(i));
            }
            doc2.writeObject(null);
            doc.close();
            doc2.close();
            System.out.println("Empleados guardados en el archivo " + archivo);

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("ERROR, NO SE PUDO GUARDAR AL EMPLEADO");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void mostrar(){
        FileInputStream doc= null;
        ObjectInputStream doc2= null;
        try {
            doc= new FileInputStream(archivo);
            doc2=new ObjectInputStream(doc);
            Empleado empleado;
            while ((empleado=(Empleado) doc2.readObject()) !=null ){
               System.out.println(empleado.toString());

            }
            doc.close();
            doc2.close();

        }catch (EOFException e){

            e.printStackTrace();
            System.out.println("FINAL DEL ARCHIVO ALCANZADO");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR IOexception , NO SE PUEDE MOSTRAR");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public Empleado buscarEmpleado(String nombre){
        FileInputStream doc=null;
        ObjectInputStream doc2= null;
        try{
            Empleado empleado;
            doc=new FileInputStream(archivo);
            doc2=new ObjectInputStream(doc);
            while ((empleado=(Empleado) doc2.readObject()) !=null ){
                if (empleado.getNombre().equals(nombre)){
                    System.out.println("SE HA ENCONTRADO A "+nombre+" :");
                    return empleado;
                }
            }

        }catch (EOFException e){
            System.out.println("FINAL DEL ARCHIVO ALCANZADO");
        }catch (IOException e){
            throw new RuntimeException("ERROR");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ERROR "+nombre+" NO EXISTE");
        return null;


    }
    public void generaFicheroMoviles(String archivo) {
        FileInputStream doc = null;
        ObjectInputStream doc2 = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            doc = new FileInputStream(this.archivo);
            doc2 = new ObjectInputStream(doc);
            Empleado empleado;
            ArrayList<Empleado> empleados = new ArrayList<Empleado>();
            while ((empleado = (Empleado) doc2.readObject()) != null) {
                empleados.add(empleado);
            }
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Empleado e : empleados) {
                bw.write(e.getNombre() + ","+e.getMovil().getNumero()+" ," + 0);
                bw.newLine();
            }
            bw.close();
            fw.close();
            doc.close();
            doc2.close();
            System.out.println("El fichero de móviles se ha generado correctamente");
        } catch (EOFException e) {
            System.out.println("Fin de archivo alcanzado");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error de E/S");
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha encontrado la clase");
        }
    }


}
