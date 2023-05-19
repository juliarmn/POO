package interfaceaula;

public abstract class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public abstract double calcularCustoBeneficio();
    @Override
    public int compareTo(Produto outro) {
        double custoBeneficioEste = calcularCustoBeneficio();
        double custoBeneficioOutro = outro.calcularCustoBeneficio();

        if (custoBeneficioEste < custoBeneficioOutro) {
            return -1;
        } else if (custoBeneficioEste > custoBeneficioOutro) {
            return 1;
        } else {
            return 0;
        }
    }
}
