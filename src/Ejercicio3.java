
/**
 * Este es un programa que calcula y muestra el area y el perimetro de un circulo.
 * El usuario debe proporcionar el radio del circulo.
 *
 * Autor: Jhon Nestor Sanchez Vallejo.
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Obtener el radio del circulo del usuario
        String radioString = JOptionPane.showInputDialog(
                null,
                "Ingrese el radio del circulo:",
                "Calculo de area y perimetro del circulo",
                JOptionPane.PLAIN_MESSAGE);

        double radio = Double.parseDouble(radioString);

        // Mostrar los resultados utilizando JOptionPane
        String resultado = "Radio del circulo: " + radio + "\n\n";
        resultado += "Resultados\n\n";
        resultado += "area: " + calcularArea(radio) + "\n";
        resultado += "Perimetro: " + calcularPerimetro(radio);

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static double calcularArea(double radio) {
        return radio * radio;
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

}
