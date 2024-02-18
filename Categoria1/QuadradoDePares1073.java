import java.util.Scanner;

public class QuadradoDePares1073 {
    public static void main(String[] args) {
        // Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares,
        // de 1 até N, inclusive N, se for o caso
        Scanner sc = new Scanner(System.in);
        double numeroElevado = 0;

        System.out.println("Insira um numero inteiro: ");
        int numero = sc.nextInt();

        for (int i = 2; i <= numero; i += 2) {
            if (numero % 2 == 1) {
                numero++;
            }
            numeroElevado = Math.pow(i, 2);
            System.out.println(i + "^2 = " + numeroElevado);
        }
        sc.close();
    }
}
