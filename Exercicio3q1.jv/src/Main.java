import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastro de Gerente\nNome: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioGerente = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, salarioGerente, departamento);

        System.out.print("Cadastro de Diretor\nNome: ");
        String nomeDiretor = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioDiretor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Quantidade de ações: ");
        int acoes = scanner.nextInt();

        Diretor diretor = new Diretor(nomeDiretor, salarioDiretor, acoes);

        System.out.println("Dados do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("Bônus: " + gerente.calcularBonus());

        System.out.println("Dados do Diretor:");
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("Salário: " + diretor.getSalario());
        System.out.println("Ações: " + diretor.getAcoes());
    }
}