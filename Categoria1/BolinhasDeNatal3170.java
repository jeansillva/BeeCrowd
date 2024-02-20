import java.util.Scanner;

public class BolinhasDeNatal3170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bolinhasFaltando = 0;

        System.out.println("Digite a quantidade de bolinhas: ");
        int bolinhas = sc.nextInt();

        System.out.println("Digite a quantidade de galhos: ");
        int galhos = sc.nextInt();

        if (galhos % 2 == 1) {
            galhos--;
        }

        bolinhasFaltando = (galhos / 2) - bolinhas;

        if (bolinhasFaltando > 0) {
            System.out.println("Faltam " + bolinhasFaltando + " bolinha(s)");
        } else {
            System.out.println("Amelia tem todas bolinhas!");
        }
        sc.close();

    }
}
