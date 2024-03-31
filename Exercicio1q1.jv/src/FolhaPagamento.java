import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Cadastro do funcionário " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome completo: ");
            String nome = scanner.nextLine();

            System.out.print("Salário bruto: ");
            double salarioBruto = scanner.nextDouble();

            double inss = salarioBruto * 0.15;
            double salarioLiquido = salarioBruto - inss;

            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome completo: " + nome);
            System.out.println("Salário Bruto: " + salarioBruto);
            System.out.println("Dedução INSS: " + inss);
            System.out.println("Salário Líquido: " + salarioLiquido);
        }
    }
}
