
/**
 * Este es un programa que solicita al usuario una oración y muestra cuántas palabras contiene.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una oración
        String oracion = JOptionPane.showInputDialog(
                null,
                "Ingrese una oracion:",
                "Contar palabras",
                JOptionPane.PLAIN_MESSAGE);

        // Contar la cantidad de palabras en la oración
        int cantidadPalabras = contarPalabras(oracion);

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "La oracion contiene " + cantidadPalabras + " palabras.");
    }

    // Función para contar la cantidad de palabras en una oración
    public static int contarPalabras(String oracion) {
        // Dividir la oración en palabras utilizando espacios como separadores
        String[] palabras = oracion.split("\\s+");
        return palabras.length; // Devolver la cantidad de palabras
    }

}
