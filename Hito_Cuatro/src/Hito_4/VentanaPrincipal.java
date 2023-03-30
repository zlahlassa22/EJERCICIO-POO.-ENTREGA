package Hito_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JFrame miframe;
    private JPanel mipanel;
    private JPanel mipanel2;
    private JPanel mipanel3;
    private JButton boton;
    private JComboBox<String> opciones;
    private JLabel fotos;
    private JTextField texto;
    private JCheckBox cajita;
    private ImageIcon foto;
    private Listener milistener;


    VentanaPrincipal() {

        miframe = new JFrame("Swing - Example 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mipanel = new JPanel();
        mipanel2 = new JPanel();
        mipanel3 = new JPanel();
        opciones = new JComboBox<>();
        opciones.setPreferredSize(new Dimension(100, 25));
        opciones.setMaximumSize(new Dimension(200, opciones.getPreferredSize().height));
        milistener= new Listener();
        opciones.addActionListener(milistener);
        opciones.addItem(load_combo(1));
        opciones.addItem(load_combo(2));
        opciones.addItem(load_combo(3));
        texto = new JTextField(10);
        cajita = new JCheckBox("Save your comment");
        cajita.setSelected(true);
        foto= new ImageIcon();
        fotos = new JLabel(foto);
        boton = new JButton("SAVE");
        boton.addActionListener(this);
        mipanel.setLayout(new BorderLayout());
        mipanel.add(opciones, BorderLayout.NORTH);
        mipanel.add(fotos, BorderLayout.CENTER);
        mipanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        mipanel2.add(cajita);
        mipanel2.add(texto);
        mipanel.add(mipanel2, BorderLayout.EAST);
        mipanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        mipanel3.add(boton);
        mipanel.add(mipanel3, BorderLayout.SOUTH);
        miframe.add(mipanel);
        miframe.setSize(700, 700);
        miframe.setVisible(true);

        miframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "¡Adios!");
                dispose();
            }
        });


    }



    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton) {
            String qimagen = (String) opciones.getSelectedItem();
            try {
                FileWriter leer = new FileWriter("src/Hito_4/Coment/" + qimagen + ".txt", true);
                BufferedWriter escr = new BufferedWriter(leer);
                if (cajita.isSelected()) {
                    escr.write(qimagen + ": " + texto.getText());
                } else {
                    escr.write(qimagen);
                }
                escr.close();
                leer.close();

            } catch (IOException ex) {
                System.err.println("Error no se puedo escruibir en el archivo: " + ex.getMessage());
            }

        }
    }
    public class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == opciones) {
                    String opcion = (String) opciones.getSelectedItem();
                    switch (opcion) {
                        case "foto1":
                            foto = new ImageIcon("src/Hito_4/Fotos/foto1.png");
                            break;
                        case "foto2":
                            foto = new ImageIcon("src/Hito_4/Fotos/foto2.png");
                            break;
                        case "foto3":
                            foto = new ImageIcon("src/Hito_4/Fotos/foto3.png");
                            break;
                    }
                    Image img = foto.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
                    foto = new ImageIcon(img);
                    fotos.setIcon(foto);
                }
            } catch (Exception b) {

            }
        }
    }
    public String load_combo(int n) {
        switch (n) {
            case 1:
                return "foto1";
            case 2:
                return "foto2";
            case 3:
                return "foto3";
        }
        return null;
    }

}






