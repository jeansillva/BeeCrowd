import java.util.Scanner;

public class Tabuada1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Digite um valor para exibir a Tabuada: ");
            numero = sc.nextInt();

            if (numero >= 2 && numero <= 1000) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = i * numero;
                    System.out.println(i + " x " + numero + " = " + resultado);
                }
            } else {
                System.out.println("Insira um valor entre 2 e 1000!");
            }
        } while (numero < 2 || numero > 1000);

        sc.close();
    }
}
