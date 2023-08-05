
/**
 * Este es un programa encuentra el número más grande en un arreglo de enteros
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio29 {

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

        // Encontrar el número más grande en el arreglo
        int numeroMasGrande = encontrarNumeroMasGrande(arreglo);

        // Mostrar el número más grande en un cuadro de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "El numero mas grande en el arregl2o es: " + numeroMasGrande);
    }

    // Función para encontrar el número más grande en un arreglo de enteros
    public static int encontrarNumeroMasGrande(int[] arreglo) {
        int maximo = arreglo[0]; // Suponemos que el primer elemento es el máximo

        // Recorremos el arreglo para encontrar el número más grande
        for (int elemento : arreglo) {
            if (elemento > maximo) {
                maximo = elemento; // Actualizar el valor del máximo si se encuentra un número mayor
            }
        }

        return maximo; // Devolver el número más grande encontrado
    }
}
