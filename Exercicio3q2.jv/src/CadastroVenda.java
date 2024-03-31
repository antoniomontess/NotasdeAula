import java.util.Scanner;

public class CadastroVenda {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Cadastrar Televisão");
            System.out.println("2 - Cadastrar Smartphone");
            System.out.println("3 - Vender Produto");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            if (opcao == 4) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome da televisão: ");
                    String nomeTV = scanner.nextLine();
                    System.out.print("Estoque: ");
                    int estoqueTV = scanner.nextInt();
                    System.out.print("Preço: ");
                    double precoTV = scanner.nextDouble();
                    produtos.add(new Televisao(nomeTV, estoqueTV, precoTV));
                    break;
                case 2:
                    System.out.print("Nome do smartphone: ");
                    String nomeSmartphone = scanner.nextLine();
                    System.out.print("Estoque: ");
                    int estoqueSmartphone = scanner.nextInt();
                    System.out.print("Preço: ");
                    double precoSmartphone = scanner.nextDouble();
                    produtos.add(new Smartphone(nomeSmartphone, estoqueSmartphone, precoSmartphone));
                    break;
                case 3:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    for (Produto p : produtos) {
                        if (p.getNome().equalsIgnoreCase(nomeProduto)) {
                            p.vender(quantidade);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
