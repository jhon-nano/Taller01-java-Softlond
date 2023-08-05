
/**
 * Este es un programa que solicita al usuario un numero que debe de adivinar y 
 * y el programa le muestra si el numero ingresado es mayo o menor.
 * Al adivinarlo muestra la cantidad de intentos.
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Generar un numero aleatorio entre 1 y 100
        int numeroAdivinar = (int) (Math.random() * 100) + 1;

        adivinarNumero(numeroAdivinar);
    }

    public static void adivinarNumero(int numeroAdivinar) {
        int intentos = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Adivina el numero:");
            int numeroIngresado = Integer.parseInt(input);

            intentos++;

            if (numeroIngresado > numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El numero es menor.");
            } else if (numeroIngresado < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El numero es mayor.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Felicidades, has adivinado el numero en " + intentos + " intentos.");
                break;
            }
        }
    }

}
