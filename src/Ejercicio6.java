/**
 * Este es un programa que solicita al usuario un numero y 
 * verificar si un número es positivo, negativo o cero.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Obtener el numero del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero:",
                "Verificacion de numero positivo, negativo o cero",
                JOptionPane.PLAIN_MESSAGE);

        double numero = Double.parseDouble(numeroString);

        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, determinarPositivoNegativo(numero));
    }

    public static String determinarPositivoNegativo(Double numero) {
        String resultado;
        
        if (numero > 0) {
            resultado = "El numero ingresado es positivo.";
        } else if (numero < 0) {
            resultado = "El numero ingresado es negativo.";
        } else {
            resultado = "El numero ingresado es cero.";
        }
        
        return resultado;
    }



}
