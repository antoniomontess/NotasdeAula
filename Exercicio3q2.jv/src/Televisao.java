import java.util.List;
class Televisao extends Produto {
    public Televisao(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public void acessarCanais() {
        System.out.println("Acessando canais da televisão " + nome);
    }
}