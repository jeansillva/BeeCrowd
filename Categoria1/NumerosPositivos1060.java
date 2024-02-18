import java.util.Scanner;

public class NumerosPositivos1060 {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou
         * positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de
         * valores positivos digitados.
         */
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Digite 6 valores diferentes: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int numerosPositivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                numerosPositivos++;
            }
        }
        sc.close();

        System.out.println(numerosPositivos + " valores positivos");
    }
}
