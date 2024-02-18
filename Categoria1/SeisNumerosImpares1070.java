import java.util.Scanner;

public class SeisNumerosImpares1070 {
    public static void main(String[] args) {
        // Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares
        // consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            numero++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(numero);
            numero += 2;
        }

        sc.close();

    }
}
