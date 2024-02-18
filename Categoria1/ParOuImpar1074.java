import java.util.Scanner;

public class ParOuImpar1074 {
    public static void main(String[] args) {
        /*
         * Leia um valor inteiro N. Este valor será a quantidade de valores que serão
         * lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo
         * se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo
         * (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta
         * seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir
         * apenas NULL.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes que deseja entrar com um numero: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.println("Digite o numero: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.print("NULL");
            } else {
                if (numero % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }
            }

            if (numero > 0) {
                System.out.print("POSITIVE\n");
            } else {
                System.out.print("NEGATIVE\n");
            }

        }
        sc.close();
    }
}
