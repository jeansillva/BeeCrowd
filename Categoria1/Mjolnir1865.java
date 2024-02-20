import java.util.Scanner;

public class Mjolnir1865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos personagens você deseja inserir? ");
        int numero = sc.nextInt();
        String[] personagens = new String[numero];

        System.out.println("Digite o nome do herói e sua força para ver se ele consegue levantar o Mjölnir: ");
        for (int i = 0; i < personagens.length; i++) {
            personagens[i] = sc.next();
        }

        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i].contains("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        sc.close();
    }
}
