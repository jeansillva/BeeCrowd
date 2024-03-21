import java.util.Scanner;

public class Area1012 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();

       double areaTriangulo = (a * c)/2;
       double areaCirculo = 3.14159 * (Math.pow(c, 2));
       double areaTrapezio = (a + b) * c/2;
       double areaQuadrado = b*b;
       double areaRetangulo = a*b;

       System.out.printf("TRIANGULO: %.3f\n",areaTriangulo);
       System.out.printf("CIRCULO: %.3f\n", areaCirculo);
       System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
       System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
       System.out.printf("RETANGULO: %.3f\n",areaRetangulo);

       sc.close();

    }
}
