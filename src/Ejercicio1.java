
/**
 * Este es un programa que realiza operaciones aritméticas básicas
 * con dos números enteros ingresados por el usuario. Muestra la
 * suma, resta, multiplicación y división de los números.
 *
 * Autor: Jhon Nestor Sanchez Vallejo
 *
 */

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Obtener el primer numero del usuario
        String numero1String = JOptionPane.showInputDialog(
                null,
                "Ingrese el primer numero entero:",
                "OperacionesAritmeticas",
                JOptionPane.PLAIN_MESSAGE);

        int numero1 = Integer.parseInt(numero1String);

        // Obtener el segundo numero del usuario
        String numero2Str = JOptionPane.showInputDialog(null, "Ingrese el segundo numero entero:",
                "OperacionesAritmeticas",
                JOptionPane.PLAIN_MESSAGE);
        int numero2 = Integer.parseInt(numero2Str);

        // Mostrar los resultados utilizando JOptionPane
        String resultado = "Numero 1: " + numero1 + "   -   Numero 2: " + numero2 + "\n\n";
        resultado += "Resultados\n\n";
        resultado += "Suma: " + suma(numero1, numero2) + "\n";
        resultado += "Resta: " + resta(numero1, numero2) + "\n";
        resultado += "Multiplicacion: " + multiplicacion(numero1, numero2) + "\n";
        if (numero2 != 0) {
            resultado += "Division: " + division(numero1, numero2);
        } else {
            resultado += "Division: No se puede dividir por cero.";
        }

        JOptionPane.showMessageDialog(null, resultado);

    }

    // Función para sumar dos números
    public static double suma(double a, double b) {
        return a + b;
    }

    // Función para restar dos números
    public static double resta(double a, double b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Función para dividir dos números
    public static double division(double a, double b) {

        if (b != 0) {
            return a / b;
        }
        return 0;
    }

}
