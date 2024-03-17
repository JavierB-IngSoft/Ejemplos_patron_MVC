/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasumamvc_interfaz;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024 Suma
 * @date 15-3-2024 Resta
 * @date 17-3-2024 Multiplicación y división
 */

import controlador.CalculadoraControlador;
import modelo.CalculadoraModelo;
import vista.CalculadoraVista;
import vista.CalculadoraInterfaz;

/**
 *
 * @author Francisco Javier
 */
public class CalculadoraSumaMVC_Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraInterfaz vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(vista, modelo);
        vista.setControlador(controlador);
    }
}

