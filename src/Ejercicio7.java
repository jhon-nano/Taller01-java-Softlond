
/**
 * Este es un programa que solicita al usuario un numero y 
 * muestra su tabla de multiplicar hasta el 10.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Obtener el número del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero entero positivo:",
                "Tabla de multiplicar",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        // Mostrar la tabla de multiplicar utilizando JOptionPane
        JOptionPane.showMessageDialog(null, mostrarTablaMultiplicar(numero));
    }

    public static String mostrarTablaMultiplicar(int numero) {
        if (numero <= 0) {
            return "El numero debe ser entero positivo.";
        }

        String resultado = "Tabla de multiplicar del numero " + numero + ":\n\n";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        return resultado;

    }

}
