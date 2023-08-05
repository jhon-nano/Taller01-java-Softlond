
/**
 * Este es un programa que solicita al usuario un numero entero y 
 * validar si el numero es positivo y el programa le calcula su factorial.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Obtener el numero del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero entero positivo:",
                "Calculo del factorial",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El numero debe ser entero positivo.");
            numero = -1; // Retornar un valor inválido si el número no es positivo
        } else if (numero >= 0) {
            long resultado = calcularFactorial(numero);

            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + resultado);
        }

    }

    public static long calcularFactorial(int numero) {

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

}
