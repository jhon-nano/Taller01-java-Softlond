
/**
 * Este es un programa solicita a usuario una cadena y muestra cuántas veces
 * aparece una letra
 * específica en ella
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */
import javax.swing.JOptionPane;

public class Ejercicio21 {
    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog(
                null,
                "Ingrese una cadena:",
                "Contador de Letras",
                JOptionPane.PLAIN_MESSAGE);

        char letra = JOptionPane.showInputDialog(
                null,
                "Ingresa la letra que quieres contar:",
                "Contador de Letras",
                JOptionPane.PLAIN_MESSAGE).charAt(0);

        long cantidad = contarLetra(cadena, letra);

        String resultado = cadena.replaceAll(String.valueOf(letra).toLowerCase(),
                "<u>" + letra + "</u>").replaceAll(String.valueOf(letra).toUpperCase(),
                        "<u>" + letra + "</u>");

        // Quitar el icono predeterminado (PLAIN_MESSAGE)
        JOptionPane.showMessageDialog(null, "<html>Cadena con resaltado:<br><pre>" + resultado +
                "</pre><br>La letra '" + letra + "' aparece " + cantidad + " veces en la cadena.</html>",
                "Resultado", JOptionPane.PLAIN_MESSAGE);

    }

    public static long contarLetra(String cadena, char letra) {
        System.out.println(cadena.chars());
        return cadena.chars()
                .filter(c -> Character.toLowerCase(c) == Character.toLowerCase(letra))
                .count();
    }

}
