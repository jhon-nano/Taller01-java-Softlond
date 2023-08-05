
/**
 * Este es un programa muestra los primeros 20 numeros de la serie Fibonacci.
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
 * 
 * la serie Fibonacci es la suma del numero anterior con el actual.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int n = 20; // Número de términos de la serie Fibonacci a mostrar

        // Mostrar los primeros 20 términos de la serie Fibonacci
        String resultado = "Serie Fibonacci de " + n + " terminos:\n";
        int prev1 = 0;
        int prev2 = 1;
        resultado += prev1 + ", " + prev2;

        for (int i = 2; i < n; i++) {
            int current = prev1 + prev2;
            resultado += ", " + current;
            prev1 = prev2;
            prev2 = current;
        }

        //System.out.println(resultado);
        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, resultado);
    }
}
