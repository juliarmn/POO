package interfaceaula;

public class Shampoo extends  Produto{
    private int irritabilidade;

    public Shampoo(String nome, double preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }


    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }
    @Override
    public double calcularCustoBeneficio() {
        return getPreco() / irritabilidade;
    }
}
