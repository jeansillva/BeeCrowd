import java.util.Arrays;
import java.util.Scanner;

public class SortSimples1042 {
    public static void main(String[] args) {
        /*
         * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os
         * valores em ordem crescente, uma linha em branco e em seguida, os valores na
         * sequência como foram lidos.
         */
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int[] numerosDigitados = new int[3];

        System.out.println("Digite 3 numeros diferentes: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            numerosDigitados[i] = numeros[i];
        }

        Arrays.sort(numeros);
        System.out.println("\n");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("\n");

        for (int numero : numerosDigitados) {
            System.out.println(numero);
        }
        sc.close();

    }
}
