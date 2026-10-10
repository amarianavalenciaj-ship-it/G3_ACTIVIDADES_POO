package Ventanas;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaMain extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide, cubo, prisma;

    public VentanaMain() {
        inicio();
        setTitle("Figuras Geométricas");
        setSize(320, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(5, 1, 5, 5));

        cilindro = new JButton("Cilindro");
        cilindro.addActionListener(this);

        esfera = new JButton("Esfera");
        esfera.addActionListener(this);

        piramide = new JButton("Pirámide");
        piramide.addActionListener(this);

        cubo = new JButton("Cubo");
        cubo.addActionListener(this);

        prisma = new JButton("Prisma Rectangular");
        prisma.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(cubo);
        contenedor.add(prisma);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cilindro) new VentanaCilindro().setVisible(true);
        if (e.getSource() == esfera) new VentanaEsfera().setVisible(true);
        if (e.getSource() == piramide) new VentanaPiramide().setVisible(true);
        if (e.getSource() == cubo) new VentanaCubo().setVisible(true);
        if (e.getSource() == prisma) new VentanaPrisma().setVisible(true);
    }
}