
import java.util.Scanner;

public class SenhaFixa1114 {
    public static void main(String[] args) {
        // Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares
        // consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
        sc.close();

    }
}
