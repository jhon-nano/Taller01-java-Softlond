
/**
 * Este es un programa usa el algoritmo de ordenamiento de selección
 *  para ordenar un arreglo de enteros de manera ascendente
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */


import javax.swing.JOptionPane;

public class Ejercicio32 {

    public static void main(String[] args) {
        // Solicitar al usuario la longitud del arreglo
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));

        // Crear un arreglo para almacenar los elementos ingresados por el usuario
        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }

        // Solicitar al usuario el número que desea buscar
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea buscar:"));

        // Llamar a la función buscarNumero para obtener el índice del número buscado
        int indiceEncontrado = buscarNumero(arreglo, numeroBuscado);

        // Mostrar un mensaje indicando si se encontró el número y su índice, o si no se
        // encontró
        if (indiceEncontrado != -1) {
            JOptionPane.showMessageDialog(null,
                    "El numero " + numeroBuscado + " se encuentra en el indice: " + indiceEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }

    // Función para buscar un número específico en un arreglo y devolver su índice
    // Devuelve -1 si el número no se encuentra en el arreglo
    public static int buscarNumero(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i; // Devolver el índice si se encuentra el número
            }
        }
        return -1; // Devolver -1 si el número no se encuentra en el arreglo
    }
}
