
/**
 * Programa para verificar si un numero entero es capicua
 * 
 * Un numero capicua es un numero que se lee igual de izquierda 
 * a derecha que de derecha a izquierda.
 * 
 * Ejemplo: 121, 12321 , 45654 , 1001....
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 

 */

import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Obtener el numero del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero entero:",
                "Verificacion de numero capicua",
                JOptionPane.PLAIN_MESSAGE);

        int numero = Integer.parseInt(numeroString);

        // Verificar si el numero es un numero capicua
        boolean esCapicua = esNumeroCapicua(numero);

        // Mostrar el resultado utilizando JOptionPane
        if (esCapicua) {
            JOptionPane.showMessageDialog(null, numero + " es un numero capicua.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un numero capicua.");
        }
    }

    // Funcion para verificar si un numero entero es capicua
    public static boolean esNumeroCapicua(int numero) {
        int numeroReverso = 0;
        int numeroOriginal = numero;

        while (numero != 0) {
            // Paso 1: Se extrae el ultimo digito del numero original
            //System.out.println("numero: " + numero);
            int digito = numero % 10;
            //System.out.println("Digito: " + digito);
            // Paso 2: Se agrega el digito extraido al numero reverso multiplicado por 10
            numeroReverso = numeroReverso * 10 + digito;
            //System.out.println("numeroReverso: " + numeroReverso);
            // Paso 3: Se elimina el ultimo digito del numero original
            numero = numero / 10;

        }

        // Paso 4: Se compara el numero original con el numero inverso
        return numeroOriginal == numeroReverso;
    }
}
