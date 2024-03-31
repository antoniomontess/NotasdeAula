class Professor {
    private String nome;
    private int idade;
    private double salario;

    public Professor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void mostrarInformacoes() {
        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
}
