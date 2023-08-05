
/**
 * Programa para calcular el area de un triangulo utilizando la formula de Heron.
 * 
 * Para que el triangulo exista, la suma de las longitudes de dos lados de un triangulo 
 * siempre debe ser mayor que la longitud del tercer lado
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Obtener las longitudes de los lados del triangulo del usuario
        String lado1Str = JOptionPane.showInputDialog(
                null,
                "Ingrese la longitud del lado 1:",
                "Calculo del area de un triangulo",
                JOptionPane.PLAIN_MESSAGE);

        String lado2Str = JOptionPane.showInputDialog(
                null,
                "Ingrese la longitud del lado 2:",
                "Calculo del area de un triangulo",
                JOptionPane.PLAIN_MESSAGE);

        String lado3Str = JOptionPane.showInputDialog(
                null,
                "Ingrese la longitud del lado 3:",
                "Calculo del area de un triangulo",
                JOptionPane.PLAIN_MESSAGE);

        double lado1 = Double.parseDouble(lado1Str);
        double lado2 = Double.parseDouble(lado2Str);
        double lado3 = Double.parseDouble(lado3Str);

        double area = calcularAreaTriangulo(lado1, lado2, lado3);
        if (area != -1.0) {
            JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);
        } else {
            JOptionPane.showMessageDialog(null, "Las longitudes ingresadas no forman un triangulo valido.");
        }
    }

    public static double calcularAreaTriangulo(double lado1, double lado2, double lado3) {
        // Verificar si las longitudes forman un triángulo válido
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Calcular el semiperímetro
            double s = (lado1 + lado2 + lado3) / 2;

            // Calcular el área utilizando la fórmula de Herón
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        } else {
            return -1.0; // Valor inválido si no se forma un triángulo válido
        }
    }


}
