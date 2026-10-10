package Ventanas;

import Figuras.Esfera;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class VentanaEsfera extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, volumen, superficie, lblImagen;
    private JTextField campoRadio;
    private JButton calcular;

    public VentanaEsfera() {
        inicio();
        setTitle("Esfera");
        setSize(460, 230);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        radio = new JLabel("Radio (cm):");
        radio.setBounds(20, 20, 100, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(110, 20, 110, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(110, 55, 110, 25);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm³):");
        volumen.setBounds(20, 100, 220, 23);

        superficie = new JLabel("Superficie (cm²):");
        superficie.setBounds(20, 135, 220, 23);

        lblImagen = new JLabel();
        lblImagen.setBounds(240, 20, 190, 150);
        cargarImagen("assets/esfera.png", lblImagen);

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(lblImagen);
    }

    private void cargarImagen(String ruta, JLabel destino) {
        File f = new File(ruta);
        if (f.exists()) {
            ImageIcon icon = new ImageIcon(ruta);
            Image img = icon.getImage().getScaledInstance(170, 140, Image.SCALE_SMOOTH);
            destino.setIcon(new ImageIcon(img));
        } else {
            destino.setText("Imagen no encontrada");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double r = Double.parseDouble(campoRadio.getText().trim());
            if (r <= 0) {
                JOptionPane.showMessageDialog(this, "El radio debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Esfera esf = new Esfera(r);
            volumen.setText(String.format("Volumen (cm³): %.2f", esf.calcularVolumen()));
            superficie.setText(String.format("Superficie (cm²): %.2f", esf.calcularSuperficie()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}