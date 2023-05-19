package aulaheranca.Lista.ExerciciosExtras.exercicio4;

public class ContaPoupanca extends ContaBancaria{
    private double taxaDeJuros;
    public ContaPoupanca(int numConta, double saldo, double taxa) {
        super(numConta, saldo);
        this.taxaDeJuros = taxa;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaDeJuros;
        setSaldo(getSaldo() + rendimento);
    }

}
