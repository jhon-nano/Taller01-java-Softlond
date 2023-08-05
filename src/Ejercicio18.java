
/**
 * programa que genera una contraseña aleatoria de 8 caracteres que contiene 
 * letras mayúsculas, letras minúsculas y dígitos
 * 
 * Autor: Jhon Nestor Sanchez Vallejo
 * 
 */

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {
        String contrasena = generarContrasena();

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena);
    }

    public static String generarContrasena() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 8;

        Random random = new Random();
        StringBuilder contrasenaBuilder = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(index);
            contrasenaBuilder.append(caracter);
        }

        return contrasenaBuilder.toString();
    }
}
