import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        if (quantidade < 12) {
            precoUnitario = 1.30;
        } else {
            precoUnitario = 1.00;
        }

        double custoTotal = quantidade * precoUnitario;

        System.out.println("O custo total da compra é: R$" + custoTotal);
    }
}
