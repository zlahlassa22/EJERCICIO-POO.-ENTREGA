package Hito_4;

import javax.swing.*;
public class VentanaContraseña {
    VentanaContraseña(){
        JOptionPane ventanita= new JOptionPane("Input password");
        String contraseña= "damocles";
        String contraseñaIngresada = JOptionPane.showInputDialog("Ingrese su contraseña:");
        if (contraseña.equals(contraseñaIngresada)){
           VentanaPrincipal ventana= new VentanaPrincipal();
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta. La aplicación se cerrará.");
            System.exit(0);
        }

    }




}
