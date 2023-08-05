
/**
 * Este es un programa que determina si un numero entero ingresado por el usuario 
 * es par o impar.
 *
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Obtener el numero del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero entero:",
                "Par o Impar",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, verificarParImpar(numero));
    }

    public static String verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            return "El numero " + numero + " es par.";
        } else {
            return "El numero " + numero + " es impar.";
        }
    }

}