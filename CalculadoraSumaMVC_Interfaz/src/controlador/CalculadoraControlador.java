/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024
 */

import java.awt.event.*;
import vista.CalculadoraInterfaz;
import modelo.CalculadoraModelo;

public class CalculadoraControlador implements ActionListener{

    private CalculadoraInterfaz view;
    private CalculadoraModelo model;

    public CalculadoraControlador(CalculadoraInterfaz view, CalculadoraModelo model) {
        this.view = view;
        this.model = model;
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = view.getNum1();
        double num2 = view.getNum2();
        double result = model.sumar(num1, num2);
        view.setResult(result);

    }

}
