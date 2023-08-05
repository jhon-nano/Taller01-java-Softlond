
/**
 * Este es un programa que rota los elementos de un arreglo hacia
 * la izquierda o la derecha una cierta cantidad de posiciones, 
 * según lo especificado por el usuario
 * 
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */



import javax.swing.JOptionPane;

public class Ejercicio34 {

    public static void main(String[] args) {
        // Solicitar al usuario la longitud del arreglo
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));

        // Crear un arreglo para almacenar los elementos ingresados por el usuario
        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }

        int posiciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para rotar:"));

        // Crear un array de opciones para los botones de direccion
        String[] opciones = { "Izquierda", "Derecha" };

        // Mostrar los botones de direccion y obtener la opcion seleccionada
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione la direccion de rotacion:",
                "Direccion de Rotacion",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion == 0) {
            rotarIzquierda(arreglo, posiciones);
        } else if (seleccion == 1) {
            rotarDerecha(arreglo, posiciones);
        } else {
            JOptionPane.showMessageDialog(null, "Direccion de rotacion no valida.");
            return;
        }



        JOptionPane.showMessageDialog(null, "Arreglo despues de la rotacion: " + java.util.Arrays.toString(arreglo));
    }

    public static void rotarIzquierda(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] temp = new int[posiciones];

        // Copiar los primeros 'posiciones' elementos en un arreglo temporal
        for (int i = 0; i < posiciones; i++) {
            temp[i] = arreglo[i];
        }

        // Mover los elementos restantes hacia la izquierda
        for (int i = posiciones; i < n; i++) {
            arreglo[i - posiciones] = arreglo[i];
        }

        // Copiar los elementos del arreglo temporal al final
        for (int i = 0; i < posiciones; i++) {
            arreglo[n - posiciones + i] = temp[i];
        }
    }

    public static void rotarDerecha(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] temp = new int[posiciones];

        // Copiar los ultimos 'posiciones' elementos en un arreglo temporal
        for (int i = n - posiciones, j = 0; i < n; i++, j++) {
            temp[j] = arreglo[i];
        }

        // Mover los elementos restantes hacia la derecha
        for (int i = n - posiciones - 1; i >= 0; i--) {
            arreglo[i + posiciones] = arreglo[i];
        }

        // Copiar los elementos del arreglo temporal al inicio
        for (int i = 0; i < posiciones; i++) {
            arreglo[i] = temp[i];
        }
    }

}
