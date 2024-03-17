/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024 Suma
 * @date 15-3-2024 Resta
 * @date 17-3-2024 Multiplicación y división
 */

import controlador.CalculadoraControlador;

public interface CalculadoraInterfaz {

    double getNum1();

    double getNum2();

    void setResult(double valor);
    
    void setControlador(CalculadoraControlador c);

}
