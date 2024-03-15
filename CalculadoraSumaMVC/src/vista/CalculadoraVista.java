/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024 Suma
 * @date 15-3-2024 Resta
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import controlador.CalculadoraControlador;

public class CalculadoraVista extends JFrame {

    private JTextField numField1, numField2, resultField, voidField;
    private JButton sumButton, restaButton;

    public CalculadoraVista() {
        setTitle("Calculadora de Suma MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Número 1:"));
        numField1 = new JTextField(10);
        panel.add(numField1);

        panel.add(new JLabel("Número 2:"));
        numField2 = new JTextField(10);
        panel.add(numField2);

        sumButton = new JButton("Sumar");
        panel.add(sumButton);
        panel.add(new JLabel(""));
        voidField = new JTextField(10);

        restaButton = new JButton("Restar");
        panel.add(restaButton);
        panel.add(new JLabel(""));
        voidField = new JTextField(10);

        panel.add(new JLabel("Resultado:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        panel.add(resultField);

        add(panel);
        setVisible(true);
    }

    public void setControlador(CalculadoraControlador c) {
        sumButton.addActionListener((ActionListener) c);
        sumButton.setActionCommand("Sumar");
        
        restaButton.addActionListener((ActionListener) c);
        restaButton.setActionCommand("Restar");
    }

    public double getNum1() {
        return Double.parseDouble(numField1.getText());
    }

    public double getNum2() {
        return Double.parseDouble(numField2.getText());
    }

    public void setResult(double result) {
        resultField.setText(String.valueOf(result));
    }

    public void addSumListener(ActionListener listener) {
        sumButton.addActionListener(listener);
    }
}
