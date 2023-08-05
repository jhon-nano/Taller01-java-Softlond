
/**
 * Este es un programa ue cuenta la frecuencia de cada elemento en un arreglo de enteros
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */



import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Ejercicio33 {
        public static void main(String[] args) {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));

        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }

        // Crear un mapa para almacenar la frecuencia de cada elemento
        Map<Integer, Integer> frecuencia = new HashMap<>();

        // Contar la frecuencia de cada elemento en el arreglo
        for (int elemento : arreglo) {
            if (frecuencia.containsKey(elemento)) {
                frecuencia.put(elemento, frecuencia.get(elemento) + 1);
            } else {
                frecuencia.put(elemento, 1);
            }
        }

        // Mostrar la frecuencia de cada elemento en un cuadro de diálogo JOptionPane
        StringBuilder resultado = new StringBuilder("Frecuencia de elementos:\n");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            resultado.append("Elemento ").append(entry.getKey()).append(": ").append(entry.getValue()).append(" veces\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
