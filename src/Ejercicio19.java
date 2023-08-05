
/**
 * Este es un programa en Java que solicita al usuario su nombre y 
 * luego lo imprime en mayúsculas y minúscula
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Obtener el nombre del usuario
        String nombre = JOptionPane.showInputDialog(
                null,
                "Ingrese su nombre:",
                "Imprimir nombre mayuscula & minuscula",
                JOptionPane.PLAIN_MESSAGE);


        String resultado = "Nombre Digitado: " + nombre + "\n\n";
        resultado += "Resultado\n\n";
        resultado += "Mayuscula: " + nombre.toUpperCase() + "\n";
        resultado += "Minuscula: " + nombre.toLowerCase();

        // Imprimir el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
