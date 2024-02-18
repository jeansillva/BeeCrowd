import java.util.Scanner;

public class PUM1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de linhas que deseja: ");
        int linhas = sc.nextInt();
        int acumulador = 1;

        for (int i = 0; i < linhas; i++) {
            System.out.printf("%d %d %d PUM %n", acumulador, acumulador + 1, acumulador + 2);
            acumulador += 4;
        }
        sc.close();
    }
}
