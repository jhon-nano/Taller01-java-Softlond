
/**
 * Este es un programa que solicita al usuario una cadena y muestra cuántos 
 * caracteres tiene sin contar los espacios en blanco
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una cadena
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        // Contar los caracteres sin contar los espacios en blanco
        int cantidadCaracteres = contarCaracteresSinEspacios(cadena);

        JOptionPane.showMessageDialog(null,
                "La cadena tiene " + cantidadCaracteres + " caracteres sin contar los espacios.");
    }

    public static int contarCaracteresSinEspacios(String cadena) {
        // Eliminar espacios en blanco y contar la longitud resultante
        return cadena.replaceAll("\\s+", "").length();
    }
}
