/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024 Suma
 * @date 15-3-2024 Resta
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.Color;
import Dominio.CalculadoraModelo;

public class CalculadoraVista1 extends JFrame implements ActionListener {

    private JTextField numField1, numField2, resultField, voidField;
    private JButton sumButton, restaButton;
    private CalculadoraModelo calculadora;

    public CalculadoraVista1() {
        setTitle("Calculadora de Suma MV nuevo interfaz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        Color miColor = new Color(255, 128, 0); // Un color naranja personalizado
        panel.setBackground(miColor);

        panel.add(new JLabel("Número 1:"));
        numField1 = new JTextField(10);
        panel.add(numField1);

        panel.add(new JLabel("Número 2:"));
        numField2 = new JTextField(10);
        panel.add(numField2);

        sumButton = new JButton("Sumar");
        sumButton.addActionListener(this);
        panel.add(sumButton);
        
        restaButton = new JButton("Restar");
        restaButton.addActionListener(this);
        panel.add(restaButton);
        
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
        if (e.getSource() == restaButton) {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = calculadora.restar(num1, num2);
                resultField.setText(String.valueOf(result));
             
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
