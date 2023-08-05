
/**
 * Programa pide al usuario un numero decimal y muestra su resultado redondeando
 * a un numero especifico de decimales
 * 
 *  10.1236516235712
 *  3   
 *  10.123
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Obtener el numero decimal del usuario
        String numeroString = JOptionPane.showInputDialog(
                null,
                "Ingrese un numero decimal:",
                "Redondeo a un numero especifico de decimales",
                JOptionPane.PLAIN_MESSAGE);

        double numero = Double.parseDouble(numeroString);

        // Obtener el numero de decimales a redondear
        String decimalesStr = JOptionPane.showInputDialog(
                null,
                "Ingrese el numero de decimales a redondear:",
                "Redondeo a un numero especifico de decimales",
                JOptionPane.PLAIN_MESSAGE);

        int numDecimales = Integer.parseInt(decimalesStr);

        // Redondear el numero a la cantidad de decimales especificos
        double redondeado = redondearDecimal(numero, numDecimales);

        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "El numero redondeado es: " + redondeado);
    }

    // Funcion para redondear un numero decimal a un numero especifico de decimales
    public static double redondearDecimal(double numero, int numDecimales) {
        double factor = Math.pow(10, numDecimales);
        System.out.println(factor);
        return Math.round(numero * factor) / factor;
    }
}
