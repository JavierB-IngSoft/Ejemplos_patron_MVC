/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasumamvc;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024
 */

import controlador.CalculadoraControlador;
import modelo.CalculadoraModelo;
import vista.CalculadoraVista;
//import vista.CalculadoraVista1;    //CAMBIAR

public class CalculadoraSumaMVC {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        //CalculadoraVista1 vista = new CalculadoraVista1();     //CAMBIAR
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraControlador controlador = new CalculadoraControlador(vista, modelo);
        
        vista.setControlador(controlador);
    }
}

