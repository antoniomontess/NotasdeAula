import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\nMédia: " + media);

        if (media >= 70) {
            System.out.println(nome + " está aprovado!");
        } else if (media < 40) {
            System.out.println(nome + " está reprovado!");
        } else {
            System.out.println(nome + " está na final.");
        }
    }
}
