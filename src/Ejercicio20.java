
/**
 * Este es un programa solicita al usuario una cadena
 *  y luego invierte su orden 
 * 
 * se utiliza StringBuilder que permite realizar operaciones de concatenación 
 * y modificación de cadenas sin crear objetos adicionales
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 * 
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Obtener la cadena del usuario
        String cadena = JOptionPane.showInputDialog(
                null,
                "Ingrese una cadena:",
                "Invertir Cadena",
                JOptionPane.PLAIN_MESSAGE);

        // Invertir la cadena
        String cadenaInvertida = invertirCadena(cadena);

        // Mostrar la cadena invertida
        JOptionPane.showMessageDialog(null, "Cadena invertida: " + cadenaInvertida);
    }

    public static String invertirCadena(String cadena) {
        StringBuilder stringBuilder = new StringBuilder(cadena);
        // System.out.println(stringBuilder.toString());
        stringBuilder.reverse();
        // System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
