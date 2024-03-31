import java.util.ArrayList;
class Produto {
    protected String nome;
    protected int estoque;
    protected double preco;

    public Produto(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente.");
        } else {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso.");
        }
    }
}