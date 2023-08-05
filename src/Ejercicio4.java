
/**
 * Este es un programa que pide al usuario su edad y muestra un mensaje indicando
 * si es mayor de edad o menor de edad.
 *
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Obtener la edad del usuario
        String edadStr = JOptionPane.showInputDialog(
                null,
                "Ingrese su edad:",
                "Verificacion de mayoria de edad",
                JOptionPane.PLAIN_MESSAGE);

        int edad = Integer.parseInt(edadStr);

        // Verificar si es mayor o menor de edad
        String mensaje;
        if (esMayorEdad(edad)) {
            mensaje = "Eres mayor de edad.";
        } else {
            mensaje = "Eres menor de edad.";
        }

        // Mostrar el mensaje utilizando JOptionPane
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

}
