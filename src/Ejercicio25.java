
/**
 * Este es un programa que solicita al usuario una frase y muestra cada palabra por separado
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio25 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una frase
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        // Dividir la frase en palabras utilizando espacios como separadores
        String[] palabras = frase.split("\\s+");

        // Crear una cadena con las palabras separadas por saltos de línea
        StringBuilder mensaje = new StringBuilder("Palabras:\n");
        for (String palabra : palabras) {
            mensaje.append("- " + palabra).append("\n");
        }

        // Mostrar todas las palabras en un cuadro de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, mensaje.toString());

    }
}
