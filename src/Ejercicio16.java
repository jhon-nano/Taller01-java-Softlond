
/**
 * Programa para calcular e imprimir la serie de Fibonacci hasta un número dado
 * 
 * la serie Fibonacci es la suma del numero anterior con el actual.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Obtener el número dado por el usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un número entero para calcular la serie de Fibonacci:",
                "Cálculo de la serie de Fibonacci",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        // Mostrar los primeros 20 términos de la serie Fibonacci
        String resultado = "Serie Fibonacci de " + numero + " terminos:\n";
        int prev1 = 0;
        int prev2 = 1;
        resultado += prev1 + ", " + prev2;

        for (int i = 2; i < numero; i++) {
            int current = prev1 + prev2;
            resultado += ", " + current;
            prev1 = prev2;
            prev2 = current;
        }

        // System.out.println(resultado);
        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, resultado);
    }

}
