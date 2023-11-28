import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaPares = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int cantidadCeros = 0;

        System.out.println("Introduce números enteros. Introduce un número negativo para salir.");

        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;  // Salir del bucle si se introduce un número negativo
            }

            if (numero == 0) {
                cantidadCeros++;
            } else if (numero % 2 == 0) {
                sumaPares += numero;
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        // Calcular la media de la suma de los números pares
        double mediaPares = cantidadPares > 0 ? (double) sumaPares / cantidadPares : 0;

        // Presentar los resultados
        System.out.println("Media de la suma de números pares: " + mediaPares);
        System.out.println("Número de impares introducidos: " + cantidadImpares);
        System.out.println("Número de ceros introducidos: " + cantidadCeros);

        scanner.close();
    }
}
