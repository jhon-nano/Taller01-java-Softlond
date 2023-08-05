
/**
 * Este es un programa usa el algoritmo de ordenamiento de selección
 *  para ordenar un arreglo de enteros de manera ascendente
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio31 {

    public static void main(String[] args) {
        // Solicitar al usuario la longitud del arreglo
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));

        // Crear un arreglo para almacenar los elementos ingresados por el usuario
        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }

        // Llamar a la función de ordenamiento de selección
        ordenarSeleccion(arreglo);

        // Mostrar el arreglo ordenado en un cuadro de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "Arreglo ordenado: " + java.util.Arrays.toString(arreglo));
    }

    // Función para intercambiar dos elementos en un arreglo
    public static void intercambiar(int[] arreglo, int indice1, int indice2) {
        int temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }

    // Función para ordenar un arreglo de enteros utilizando el algoritmo de
    // selección
    public static void ordenarSeleccion(int[] arreglo) {
        int n = arreglo.length;

        // Recorrer el arreglo
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            // Encontrar el índice del mínimo elemento en el subarreglo no ordenado
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el elemento mínimo con el elemento en la posición actual
            if (indiceMinimo != i) {
                intercambiar(arreglo, i, indiceMinimo);
            }
        }
    }

}
