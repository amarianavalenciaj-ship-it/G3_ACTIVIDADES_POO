package Ventanas;

import Figuras.Cubo;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class VentanaCubo extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel lado, volumen, superficie, lblImagen;
    private JTextField campoLado;
    private JButton calcular;

    public VentanaCubo() {
        inicio();
        setTitle("Cubo");
        setSize(460, 230);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lado = new JLabel("Lado (cm):");
        lado.setBounds(20, 20, 100, 23);
        campoLado = new JTextField();
        campoLado.setBounds(110, 20, 110, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(110, 55, 110, 25);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm³):");
        volumen.setBounds(20, 100, 220, 23);

        superficie = new JLabel("Superficie (cm²):");
        superficie.setBounds(20, 135, 220, 23);

        lblImagen = new JLabel();
        lblImagen.setBounds(240, 20, 190, 150);
        cargarImagen("assets/cubo.png", lblImagen);

        contenedor.add(lado);
        contenedor.add(campoLado);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(lblImagen);
    }

    private void cargarImagen(String ruta, JLabel destino) {
        File f = new File(ruta);
        if (f.exists()) {
            ImageIcon icon = new ImageIcon(ruta);
            Image img = icon.getImage().getScaledInstance(160, 140, Image.SCALE_SMOOTH);
            destino.setIcon(new ImageIcon(img));
        } else {
            destino.setText("Imagen no encontrada");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double l = Double.parseDouble(campoLado.getText().trim());
            if (l <= 0) {
                JOptionPane.showMessageDialog(this, "El lado debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Cubo c = new Cubo(l);
            volumen.setText(String.format("Volumen (cm³): %.2f", c.calcularVolumen()));
            superficie.setText(String.format("Superficie (cm²): %.2f", c.calcularSuperficie()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}