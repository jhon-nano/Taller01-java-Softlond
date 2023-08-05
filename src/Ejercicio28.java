
/**
 * Este es un programa encuentra el número más grande en un arreglo de enteros
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio28 {

    public static void main(String[] args) {

         // Solicitar al usuario la longitud del arreglo
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));

         // Crear un arreglo para almacenar los elementos ingresados por el usuario
        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }

        // Crear una cadena para mostrar los elementos del arreglo en el resultado
        StringBuilder elementosTexto = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            elementosTexto.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                elementosTexto.append(" + ");
            }
        }

         // Calcular la suma total de los elementos del arreglo
        int sumaTotal = calcularSuma(arreglo);

        // Mostrar la suma detallada en el resultado utilizando un cuadro de diálogo
        JOptionPane.showMessageDialog(null, elementosTexto + " = " + sumaTotal+ "\nLa suma de los elementos del arreglo es: " + sumaTotal);
    }

    // Función para calcular la suma de los elementos en un arreglo de enteros
    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
