/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Dominio.CalculadoraModelo;

public class CalculadoraVista extends JFrame implements ActionListener {
    private JTextField numField1, numField2, resultField, voidField;
    private JButton sumButton;
    private CalculadoraModelo calculadora;

    public CalculadoraVista() {
        setTitle("Calculadora de Suma MV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Número 1:"));
        numField1 = new JTextField(10);
        panel.add(numField1);

        panel.add(new JLabel("Número 2:"));
        numField2 = new JTextField(10);
        panel.add(numField2);

        sumButton = new JButton("Sumar");
        sumButton.addActionListener(this);
        panel.add(sumButton);
        panel.add(new JLabel(""));
        voidField = new JTextField(10);

        panel.add(new JLabel("Resultado:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        panel.add(resultField);

        add(panel);
        setVisible(true);

        calculadora = new CalculadoraModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumButton) {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = calculadora.sumar(num1, num2);
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

