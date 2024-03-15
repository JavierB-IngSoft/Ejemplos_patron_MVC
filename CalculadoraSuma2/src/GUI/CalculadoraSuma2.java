/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

/**
 *
 * @author Francisco Javier Bueno Guillén
 * @date 18-2-2024 Suma
 * @date 15-3-2024 Resta
 */

import javax.swing.SwingUtilities;

public class CalculadoraSuma2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraVista1();
            }
        });
    }
    
}
