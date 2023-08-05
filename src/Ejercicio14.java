
/**
 * Programa para verificar si un numero entero positivo y es un numero perfecto
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 * Ejemplo: 6, 28 , 496 , 8128....
 */

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Obtener el numero del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero entero positivo:",
                "Verificacion de numero perfecto",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        // Verificar si el numero es un numero perfecto
        boolean esPerfecto = esNumeroPerfecto(numero);

        // Mostrar el resultado utilizando JOptionPane
        if (esPerfecto) {
            JOptionPane.showMessageDialog(null, numero + " es un numero perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un numero perfecto.");
        }
    }

    // Funcion para verificar si un numero entero positivo es un numero perfecto
    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 0) {
            return false;
        }

        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
}
