package exceçoes.lista.exercicio3;

public abstract class ProdutoAbstrato implements Produto{
    String nome;
    double preco;
    int quantidade;
    String id;

    public ProdutoAbstrato(String nome, double preco, int quantidade, String id) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = id;
    }

    abstract double calcularDesconto();
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getId() {
        return this.id;
    }

}
