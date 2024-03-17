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
 * @date 17-3-2024 Multiplicación y división
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import controlador.CalculadoraControlador;
import java.awt.Color;

public class CalculadoraVista1 extends JFrame implements CalculadoraInterfaz {

    private JTextField numField1, numField2, resultField, voidField;
    private JButton sumButton, restaButton, mulButton, divButton;

    public CalculadoraVista1() {
        setTitle("Calculadora de Suma MVC nuevo interfaz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        Color miColor = new Color(255, 128, 0); // Un color naranja personalizado
        panel.setBackground(miColor);

        panel.add(new JLabel("Número 1:"));
        numField1 = new JTextField(10);
        panel.add(numField1);

        panel.add(new JLabel("Número 2:"));
        numField2 = new JTextField(10);
        panel.add(numField2);

        sumButton = new JButton("Sumar");
        panel.add(sumButton);

        restaButton = new JButton("Restar");
        panel.add(restaButton);

        mulButton = new JButton("Producto");
        panel.add(mulButton);

        divButton = new JButton("Dividir");
        panel.add(divButton);

        panel.add(new JLabel("Resultado:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        panel.add(resultField);

        add(panel);
        setVisible(true);
    }

    @Override
    public void setControlador(CalculadoraControlador c) {
        sumButton.addActionListener((ActionListener) c);
        sumButton.setActionCommand("Sumar");

        restaButton.addActionListener((ActionListener) c);
        restaButton.setActionCommand("Restar");

        mulButton.addActionListener((ActionListener) c);
        mulButton.setActionCommand("Producto");

        divButton.addActionListener((ActionListener) c);
        divButton.setActionCommand("Dividir");
    }

    @Override
    public double getNum1() {
        return Double.parseDouble(numField1.getText());
    }

    @Override
    public double getNum2() {
        return Double.parseDouble(numField2.getText());
    }

    @Override
    public void setResult(double result) {
        resultField.setText(String.valueOf(result));
    }

    public void addSumListener(ActionListener listener) {
        sumButton.addActionListener(listener);
    }
}
