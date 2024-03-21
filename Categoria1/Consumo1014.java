import java.util.Scanner;

public class Consumo1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaTotal = sc.nextInt();
        double combustivelGasto = sc.nextDouble();

        double calculaKM = distanciaTotal / combustivelGasto;

        System.out.printf("%.3f km/l\n", calculaKM);

        sc.close();
    }
}
