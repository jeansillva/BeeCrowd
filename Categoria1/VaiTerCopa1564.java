
import java.util.Scanner;

public class VaiTerCopa1564 {
    public static void main(String[] args) {
        /*
         * O Brasil é o país sede da copa esse ano. Porém, há muitas pessoas protestando
         * contra o governo. Em redes sociais é possível ver pessoas afirmando que não
         * vai ter copa devido aos protestos.
         * Mas esses rumores de que não haverá copa são totalmente falsos, a presidente
         * Dilma Roussef já avisou: vai ter copa sim, e se reclamar vai ter duas!
         */
        Scanner sc = new Scanner(System.in);
        int reclamacao = sc.nextInt();

        if (reclamacao == 0) {
            System.out.println("Vai ter copa!");
        } else if (reclamacao > 0 && reclamacao <= 100) {
            System.out.println("Vai ter duas!");
        } else {
            System.out.println("O numero precisa estar entre 0 e 100");
        }
        sc.close();
    }
}
