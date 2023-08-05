
/**
 * Este es un programa solicita a usuario una cadena y verifique si es un
 * palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {

        // Solicitar al usuario que ingrese una frase
        String frase = JOptionPane.showInputDialog(
                null,
                "Ingrese una frase:",
                "Verificar frase palindromo",
                JOptionPane.PLAIN_MESSAGE);

        // Verificar si la frase es un palíndromo y mostrar el resultado
        if (esPalindromo(frase)) {
            JOptionPane.showMessageDialog(null, "La frase es un palindromo.",
                    "Resultado", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La frase no es un palindromo.",
                    "Resultado", JOptionPane.PLAIN_MESSAGE);
        }
    }

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String frase) {
        // Eliminar espacios y convertir la frase a minúsculas
        String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();
        int longitud = fraseSinEspacios.length();

        // Verificar si la frase es un palíndromo
        for (int i = 0; i < longitud / 2; i++) {
            // Comparar caracteres simétricos de la frase
            if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(longitud - 1 - i)) {
                return false; // Si hay una diferencia, no es un palíndromo
            }
        }

        return true; // Si no se encontraron diferencias, es un palíndromo
    }

}
