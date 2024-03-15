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
 */

import modelo.CalculadoraModelo;
import vista.CalculadoraVista;
//import vista.CalculadoraVista1;      //CAMBIAR
import java.awt.event.*;

public class CalculadoraControlador implements ActionListener {

    private CalculadoraVista view;
   //private CalculadoraVista1 view;      //CAMBIAR
    private CalculadoraModelo model;

    public CalculadoraControlador(CalculadoraVista view, CalculadoraModelo model) {
    //public CalculadoraControlador(CalculadoraVista1 view, CalculadoraModelo model) {   //CAMBIAR
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
    }
}
