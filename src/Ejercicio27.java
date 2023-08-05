
/**
 * Este es un programa que solicita al usuario una frase y 
 * luego muestra las palabras ordenadas alfabéticamente
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio27 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una frase
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        // Dividir la frase en palabras utilizando espacios como separadores
        String[] palabras = frase.split("\\s+");

        // Ordenar las palabras alfabéticamente

        // Crear una cadena con las palabras ordenadas
        StringBuilder mensaje = new StringBuilder("Palabras ordenadas:\n");
        for (String palabra : palabras) {
            mensaje.append(palabra).append("\n");
        }

        // Mostrar las palabras ordenadas en un cuadro de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
