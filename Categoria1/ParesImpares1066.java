import java.util.Scanner;

public class ParesImpares1066 {
    public static void main(String[] args) {
        /*
         * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram
         * pares, quantos valores digitados foram ímpares, quantos valores digitados
         * foram positivos e quantos valores digitados foram negativos.
         */
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        System.out.println("Digite 5 numeros diferentes: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (numeros[i] >= 0) {
                positivo++;
            } else {
                negativo++;
            }

        }

        System.out.println(par + " valor(es) par(es)\n" +
                impar + " valor(es) impar(es)\n" +
                positivo + " valor(es) positivo(s)\n" +
                negativo + " valor(es) negativo(s)");

        sc.close();
    }
}
