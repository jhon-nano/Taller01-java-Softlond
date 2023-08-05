
/**
 * Programa para mostrar todos los números primos en un rango dado por el usuario
 * 
 * se valida que el segundo dato sea mayor que el primero si no, no calcula los 
 * primos en un rango.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args) {

        int numero1, numero2;

        String numero1Str = JOptionPane.showInputDialog(
                null,
                "Ingrese el primer numero entero:",
                "Busqueda de numeros primos en rango",
                JOptionPane.PLAIN_MESSAGE);

        numero1 = Integer.parseInt(numero1Str);

        do {
            // Obtener el primer numero entero

            // Obtener el segundo numero entero
            String numero2Str = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el segundo numero entero mayor que " + numero1 + ":",
                    "Busqueda de numeros primos en rango",
                    JOptionPane.PLAIN_MESSAGE);

            numero2 = Integer.parseInt(numero2Str);

            // Validar si el segundo numero es mayor que el primero
            if (numero2 <= numero1) {
                JOptionPane.showMessageDialog(null,
                        "El segundo numero debe ser mayor que el primero. Intente nuevamente.");
            }
        } while (numero2 <= numero1);

        // Mostrar los numeros primos en el rango
        String numerosPrimos = "Numeros primos en el rango [" + numero1 + ", " + numero2 + "]:\n";
        for (int i = numero1; i <= numero2; i++) {
            if (esNumeroPrimo(i)) {
                numerosPrimos += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, numerosPrimos);
    }

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
