import java.util.Scanner;

public class MenorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros inteiros que deseja inserir na lista: ");
        int numeroDigitado = sc.nextInt();
        int[] numeros = new int[numeroDigitado];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + i + " valor");
            numeros[i] = sc.nextInt();
        }

        int menor = numeros[0];
        int posicaoMenor = 0;

        for (int i = 0; i < numeroDigitado; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicaoMenor = i;
            }
        }

        System.out.println(menor + " " + posicaoMenor);
        sc.close();
    }
}
