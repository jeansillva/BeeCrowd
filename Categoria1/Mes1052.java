import java.util.HashMap;
import java.util.Scanner;

public class Mes1052 {
    public static void main(String[] args) {
        /*
         * Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
         * deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a
         * primeira letra maiúscula.
         */
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> mes = new HashMap<>();

        System.out.println("Digite algum numero entre 1 e 12 para saber o mes: ");
        int numeroMes = sc.nextInt();
        sc.close();

        mes.put(1, "Janeiro");
        mes.put(2, "Fevereiro");
        mes.put(3, "Março");
        mes.put(4, "Abril");
        mes.put(5, "Maio");
        mes.put(6, "Junho");
        mes.put(7, "Julho");
        mes.put(8, "Agosto");
        mes.put(9, "Setembro");
        mes.put(10, "Outubro");
        mes.put(11, "Novembro");
        mes.put(12, "Dezembro");

        System.out.println(mes.get(numeroMes));
    }
}
