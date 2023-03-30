import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class VentanaPrincipal {
    private static final String CARPETA_IMAGENES = "imagenes";

    private JFrame frame;
    private JComboBox<String> combo;
    private JLabel etiqueta;
    private JCheckBox casillaComentar;
    private JTextField campoComentario;
    private JButton botonGuardar;

    public VentanaPrincipal() {
        frame = new JFrame("Ventana principal");

        // Cargar nombres de archivos en la carpeta de imágenes
        File carpeta = new File(CARPETA_IMAGENES);
        File[] archivos = carpeta.listFiles();
        String[] nombres = new String[archivos.length];
        for (int i = 0; i < archivos.length; i++) {
            nombres[i] = archivos[i].getName();
        }

        // Crear un menú desplegable con los nombres de archivo
        combo = new JComboBox<String>(nombres);
        combo.addActionListener(new ComboListener());

        // Crear una etiqueta para mostrar las imágenes
        etiqueta = new JLabel(new ImageIcon(CARPETA_IMAGENES + "/" + nombres[0]));

        // Crear una casilla para comentar las imágenes
        casillaComentar = new JCheckBox("Comentar");
        campoComentario = new JTextField(20);
        campoComentario.setEnabled(false);
        casillaComentar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoComentario.setEnabled(casillaComentar.isSelected());
            }
        });

        // Crear un botón para guardar el comentario
        botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreImagen = (String) combo.getSelectedItem();
                String comentario = campoComentario.getText();

                if (casillaComentar.isSelected() && !comentario.isEmpty()) {
                    guardarComentario(nombreImagen, comentario);
                }

                JOptionPane.showMessageDialog(frame, "Comentario guardado.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(combo);
        panel.add(etiqueta);
        panel.add(c
}
