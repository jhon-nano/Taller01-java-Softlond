
/**
 * Este es un programa que solicita al usuario dos números enteros y 
 * determina cuál es el mayor de ellos.
 *
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Obtener el primer numero del usuario
        String numero1Str = JOptionPane.showInputDialog(
                null,
                "Ingrese el primer numero entero:",
                "Comparacion de dos numeros enteros",
                JOptionPane.PLAIN_MESSAGE);

        int numero1 = Integer.parseInt(numero1Str);

        // Obtener el segundo numero del usuario
        String numero2Str = JOptionPane.showInputDialog(
                null,
                "Ingrese el segundo numero entero:",
                "Comparacion de dos numeros enteros",
                JOptionPane.PLAIN_MESSAGE);

        int numero2 = Integer.parseInt(numero2Str);


        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, encontrarNumeroMayor(numero1, numero2));
    }

    public static String encontrarNumeroMayor(int numero1, int numero2) {
        String resultado;

        if (numero1 > numero2) {
            resultado = "El numero mayor es: " + numero1;
        } else if (numero1 < numero2) {
            resultado = "El numero mayor es: " + numero2;
        } else {
            resultado = "Los numeros son iguales.";
        }

        return resultado;
    }

}
