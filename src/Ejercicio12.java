
/**
 * Programa para verificar si un numero entero es primo o no
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Obtener el numero del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero entero:",
                "Verificacion de numero primo",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        // Verificar si el numero es primo
        boolean esPrimo = esNumeroPrimo(numero);

        // Mostrar el resultado utilizando JOptionPane
        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un numero primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un numero primo.");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo, por definición
        if (numero <= 1) {
            return false;
        }

        // Se verifica si el número es divisible por algún valor desde 2 hasta su raíz
        // cuadrada
        // Si se encuentra un divisor, el número no es primo y se retorna false
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        // Si no se encontró ningún divisor, el número es primo y se retorna true
        return true;
    }
}
