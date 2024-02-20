package Categoria4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParesEImpares1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite vários números inteiros positivos: (Digite um negativo para sair) ");
        int numeroDigitado = sc.nextInt();

        do {
            numeros.add(numeroDigitado);
            numeroDigitado = sc.nextInt();
        } while (numeroDigitado > 0);
        sc.close();

        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        for (int n : numeros) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
        }

    }
}
