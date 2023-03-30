import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin {
    private static final String PASSWORD_CORRECTA = "damocles";

    private JFrame frame;
    private JTextField campoTexto;
    private JButton botonAceptar;

    public VentanaLogin() {
        frame = new JFrame("Login");

        JLabel etiqueta = new JLabel("Introduce la contraseña:");
        campoTexto = new JTextField(10);
        botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = campoTexto.getText();

                if (password.equals(PASSWORD_CORRECTA)) {
                    frame.setVisible(false);
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                    ventanaPrincipal.mostrar();
                } else {
                    JOptionPane.showMessageDialog(frame, "Contraseña incorrecta. La aplicación se cerrará.");
                    System.exit(0);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(botonAceptar);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}
}
