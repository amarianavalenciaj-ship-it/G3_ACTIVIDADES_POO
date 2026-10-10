package Ejercicio8_2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel nota1, nota2, nota3, nota4, nota5;
    private JLabel promedio, desvest, mayor, menor;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcular, limpiar;

    public VentanaPrincipal() {
        inicio();
        setTitle("Notas del curso");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // Etiquetas y campos de notas
        nota1 = new JLabel("Nota 1:");
        nota1.setBounds(20, 20, 100, 23);
        campoNota1 = new JTextField();
        campoNota1.setBounds(120, 20, 135, 23);
        contenedor.add(nota1);
        contenedor.add(campoNota1);

        nota2 = new JLabel("Nota 2:");
        nota2.setBounds(20, 50, 100, 23);
        campoNota2 = new JTextField();
        campoNota2.setBounds(120, 50, 135, 23);
        contenedor.add(nota2);
        contenedor.add(campoNota2);

        nota3 = new JLabel("Nota 3:");
        nota3.setBounds(20, 80, 100, 23);
        campoNota3 = new JTextField();
        campoNota3.setBounds(120, 80, 135, 23);
        contenedor.add(nota3);
        contenedor.add(campoNota3);

        nota4 = new JLabel("Nota 4:");
        nota4.setBounds(20, 110, 100, 23);
        campoNota4 = new JTextField();
        campoNota4.setBounds(120, 110, 135, 23);
        contenedor.add(nota4);
        contenedor.add(campoNota4);

        nota5 = new JLabel("Nota 5:");
        nota5.setBounds(20, 140, 100, 23);
        campoNota5 = new JTextField();
        campoNota5.setBounds(120, 140, 135, 23);
        contenedor.add(nota5);
        contenedor.add(campoNota5);

        // Botones
        calcular = new JButton("Calcular:");
        calcular.setBounds(20, 175, 100, 25);
        calcular.addActionListener(this);
        contenedor.add(calcular);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(140, 175, 100, 25);
        limpiar.addActionListener(this);
        contenedor.add(limpiar);

        // Etiquetas de resultados
        promedio = new JLabel("Promedio = ");
        promedio.setBounds(20, 215, 240, 23);
        contenedor.add(promedio);

        desvest = new JLabel("Desviación estándar = ");
        desvest.setBounds(20, 245, 240, 23);
        contenedor.add(desvest);

        mayor = new JLabel("Nota mayor = ");
        mayor.setBounds(20, 275, 240, 23);
        contenedor.add(mayor);

        menor = new JLabel("Nota menor = ");
        menor.setBounds(20, 305, 240, 23);
        contenedor.add(menor);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                Notas notas = new Notas();
                double n1 = Double.parseDouble(campoNota1.getText());
                double n2 = Double.parseDouble(campoNota2.getText());
                double n3 = Double.parseDouble(campoNota3.getText());
                double n4 = Double.parseDouble(campoNota4.getText());
                double n5 = Double.parseDouble(campoNota5.getText());

                if (n1 < 0 || n1 > 5 || n2 < 0 || n2 > 5 || n3 < 0 || n3 > 5 || n4 < 0 || n4 > 5 || n5 < 0 || n5 > 5) {
                    JOptionPane.showMessageDialog(this, "Las notas deben estar en el rango de 0.0 a 5.0", "Error de rango", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                notas.listaNotas[0] = n1;
                notas.listaNotas[1] = n2;
                notas.listaNotas[2] = n3;
                notas.listaNotas[3] = n4;
                notas.listaNotas[4] = n5;

                promedio.setText(String.format("Promedio = %.2f", notas.calcularPromedio()));
                desvest.setText(String.format("Desviación estándar = %.2f", notas.calcularDesvest()));
                mayor.setText(String.format("Nota mayor = %.2f", notas.calcularMayor()));
                menor.setText(String.format("Nota menor = %.2f", notas.calcularMenor()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos en todas las notas.", "Campo inválido", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (evento.getSource() == limpiar) {
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            promedio.setText("Promedio = ");
            desvest.setText("Desviación estándar =  ");
            mayor.setText("Nota mayor = ");
            menor.setText("Nota menor = ");
        }
    }   
}
