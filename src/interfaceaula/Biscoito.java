package interfaceaula;

public class Biscoito extends  Produto{
    private int componentesCancerigenos;

    public Biscoito(String nome, double preco, int componentesCancerigenos) {
        super(nome, preco);
        this.componentesCancerigenos = componentesCancerigenos;
    }

    public int getComponentesCancerigenos() {
        return componentesCancerigenos;
    }

    public void setComponentesCancerigenos(int componentesCancerigenos) {
        this.componentesCancerigenos = componentesCancerigenos;
    }
    @Override
    public double calcularCustoBeneficio() {
        return getPreco() / componentesCancerigenos;
    }
}
