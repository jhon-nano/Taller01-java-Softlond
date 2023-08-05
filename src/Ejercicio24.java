
/**
 * Este es un programa que solicita al usuario una cadena y reemplaza todas las 
 * apariciones de una letra específica por otra
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio24 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una cadena, la letra original y la letra
        // nueva
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        char letraOriginal = JOptionPane.showInputDialog("Ingrese la letra a reemplazar:").charAt(0);
        char letraNueva = JOptionPane.showInputDialog("Ingrese la nueva letra:").charAt(0);

        // Llamar a la función para reemplazar la letra en la cadena
        String nuevaCadena = reemplazarLetra(cadena, letraOriginal, letraNueva);

        // Mostrar la cadena original y la nueva cadena resultante después del reemplazo
        JOptionPane.showMessageDialog(null, "Cadena original: " + cadena +
                "\nNueva cadena: " + nuevaCadena);
    }

    // Función para reemplazar todas las apariciones de una letra en una cadena
    public static String reemplazarLetra(String cadena, char letraOriginal, char letraNueva) {
        // Reemplazar todas las apariciones de la letra original por la letra nueva
        String nuevaCadena = cadena.replace(letraOriginal, letraNueva);
        return nuevaCadena; // Devolver la cadena con los reemplazos
    }

}
