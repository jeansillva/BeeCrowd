import java.util.HashMap;
import java.util.Scanner;

public class Lanche1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Double> codigoValor = new HashMap<>();
        codigoValor.put(1, 4.0);
        codigoValor.put(2, 4.50);
        codigoValor.put(3, 5.0);
        codigoValor.put(4, 2.0);
        codigoValor.put(5, 1.50);

        System.out.println("Digite o codigo do item: ");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        sc.close();

        double preco = codigoValor.get(codigo);
        double calculo = preco * quantidade;

        System.out.printf("Total: R$ %.2f", calculo);
    }
}
