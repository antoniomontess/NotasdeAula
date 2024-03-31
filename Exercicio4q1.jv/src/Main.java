public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("João", 40, 5000.0);
        Aluno aluno = new Aluno("Maria", 20, "2022001");

        professor.mostrarInformacoes();
        aluno.mostrarInformacoes();
    }
}