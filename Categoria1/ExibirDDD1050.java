import java.util.HashMap;
import java.util.Scanner;

public class ExibirDDD1050 {
    /*
     * Desafio:Leia um número inteiro que representa um código de DDD. Em seguida,
     * informe à qual cidade o DDD pertence.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cria uma lista (chave, valor) e armazena dados
        HashMap<Integer, String> id = new HashMap<>();
        id.put(11, "São Paulo");
        id.put(61, "Brasilia");
        id.put(71, "Salvador");
        id.put(21, "Rio de Janeiro");
        id.put(32, "Juiz de fora");
        id.put(19, "Campinas");
        id.put(27, "Vitoria");
        id.put(31, "Belo Horizonte");

        // Lê o DDD
        int ddd = sc.nextInt();
        sc.close();

        // Verifica a lista com .containsKey
        if (id.containsKey(ddd)) {
            System.out.println(id.get(ddd));
        } else {
            System.out.println("DDD não cadastrado!");
        }

    }
}
