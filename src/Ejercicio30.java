
/**
 * Este es un programa elimina los elementos duplicados de un arreglo de entero
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */


import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio30 {
    public static void main(String[] args) {
        // Solicitar al usuario la longitud del arreglo
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));

        // Crear un arreglo para almacenar los elementos ingresados por el usuario
        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }

        // Eliminar duplicados del arreglo
        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);

        // Mostrar el arreglo original y el arreglo resultante sin duplicados en un
        // cuadro de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "Arreglo original: " + Arrays.toString(arreglo) +
                "\nArreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }

    // Función para eliminar elementos duplicados de un arreglo de enteros
    public static int[] eliminarDuplicados(int[] arreglo) {
        
        // Ordenar el arreglo para que los elementos duplicados estén juntos
        Arrays.sort(arreglo);

        int longitud = arreglo.length;
        int[] arregloSinDuplicados = new int[longitud];
        int nuevoTamano = 0; // Tamaño del nuevo arreglo sin duplicados

        // Recorrer el arreglo y copiar elementos no duplicados al nuevo arreglo
        for (int i = 0; i < longitud; i++) {
            if (i == 0 || arreglo[i] != arreglo[i - 1]) {
                arregloSinDuplicados[nuevoTamano] = arreglo[i];
                nuevoTamano++;
            }
        }

        // Crear un nuevo arreglo con el tamaño adecuado para almacenar elementos no
        // duplicados
        return Arrays.copyOf(arregloSinDuplicados, nuevoTamano);
    }

}
