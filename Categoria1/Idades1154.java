import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Idades1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();
        int soma = 0;
        System.out.println("Digite idades para ter a media! DIGITE UM NUMERO NEGATIVO PARA SAIR!!");

        int id;
        while ((id = sc.nextInt()) >= 0) {
            idades.add(id);
            soma += id;
        }

        System.out.println("A media é " + soma / idades.size());
        sc.close();

    }
}
