package interfaceaula;

public class Leite extends  Produto{
    private int dias;

    public Leite(String nome, double preco, int dias) {
        super(nome, preco);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    @Override
    public double calcularCustoBeneficio() {
        return getPreco() / dias;
    }
}
