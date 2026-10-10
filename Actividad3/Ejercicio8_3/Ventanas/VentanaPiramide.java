package Ventanas;

import Figuras.Piramide;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class VentanaPiramide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie, lblImagen;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(480, 270);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        base = new JLabel("Base (cm):");
        base.setBounds(20, 20, 100, 23);
        campoBase = new JTextField();
        campoBase.setBounds(120, 20, 110, 23);

        altura = new JLabel("Altura (cm):");
        altura.setBounds(20, 50, 100, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 50, 110, 23);

        apotema = new JLabel("Apotema (cm):");
        apotema.setBounds(20, 80, 100, 23);
        campoApotema = new JTextField();
        campoApotema.setBounds(120, 80, 110, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 110, 110, 25);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm³):");
        volumen.setBounds(20, 150, 220, 23);

        superficie = new JLabel("Superficie (cm²):");
        superficie.setBounds(20, 180, 220, 23);

        lblImagen = new JLabel();
        lblImagen.setBounds(250, 20, 200, 180);
        cargarImagen("assets/piramide.png", lblImagen);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(lblImagen);
    }

    private void cargarImagen(String ruta, JLabel destino) {
        File f = new File(ruta);
        if (f.exists()) {
            ImageIcon icon = new ImageIcon(ruta);
            Image img = icon.getImage().getScaledInstance(180, 160, Image.SCALE_SMOOTH);
            destino.setIcon(new ImageIcon(img));
        } else {
            destino.setText("Imagen no encontrada");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double b = Double.parseDouble(campoBase.getText().trim());
            double h = Double.parseDouble(campoAltura.getText().trim());
            double a = Double.parseDouble(campoApotema.getText().trim());

            if (b <= 0 || h <= 0 || a <= 0) {
                JOptionPane.showMessageDialog(this, "Todos los parámetros deben ser mayores a cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Piramide p = new Piramide(b, h, a);
            volumen.setText(String.format("Volumen (cm³): %.2f", p.calcularVolumen()));
            superficie.setText(String.format("Superficie (cm²): %.2f", p.calcularSuperficie()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}