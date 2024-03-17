/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024 Suma
 * @date 15-3-2024 Resta
 * @date 17-3-2024 Multiplicación y división
 */
import java.awt.event.*;
import vista.CalculadoraInterfaz;
import modelo.CalculadoraModelo;

public class CalculadoraControlador implements ActionListener {

    private CalculadoraInterfaz view;
    private CalculadoraModelo model;

    public CalculadoraControlador(CalculadoraInterfaz view, CalculadoraModelo model) {
        this.view = view;
        this.model = model;
    }

    public void actionPerformed(ActionEvent e) {

        if ("Sumar".equals(e.getActionCommand())) {

            double num1 = view.getNum1();
            double num2 = view.getNum2();
            double result = model.sumar(num1, num2);
            view.setResult(result);
        }

        if ("Restar".equals(e.getActionCommand())) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();
            double result = model.restar(num1, num2);
            view.setResult(result);
        }

        if ("Producto".equals(e.getActionCommand())) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();
            double result = model.multiplicar(num1, num2);
            view.setResult(result);
        }

        if ("Dividir".equals(e.getActionCommand())) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();          
            double result = model.dividir(num1, num2);
            view.setResult(result);
            //if (num2==0){view.setResult(808080808);}
        }
    }
}
