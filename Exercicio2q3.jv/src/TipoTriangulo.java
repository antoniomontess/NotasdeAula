import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        if (ehTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os comprimentos informados não formam um triângulo.");
        }
    }

    public static boolean ehTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
