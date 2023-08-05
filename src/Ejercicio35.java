public class Ejercicio35 {
    public static void main(String[] args) {

        int numero_tablas = 10;

        // Crear una matriz de 10x10 para almacenar las tablas de multiplicar
        int[][] tablas = new int[numero_tablas][numero_tablas];

        // Llenar la matriz con las tablas de multiplicar
        for (int i = 0; i < numero_tablas; i++) {
            for (int j = 0; j < numero_tablas; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < numero_tablas; i++) {
            System.out.println("Tabla del " + (i + 1) + ":");
            for (int j = 0; j < numero_tablas; j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + tablas[i][j]);
            }
            System.out.println();
        }

        // Imprimir la matriz completa
        System.out.println("Matriz de " + numero_tablas + "x" + numero_tablas + ":");
        for (int i = 0; i < numero_tablas; i++) {
            for (int j = 0; j < numero_tablas; j++) {
                System.out.print(tablas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
