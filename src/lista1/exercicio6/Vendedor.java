package lista1.exercicio6;

public class Vendedor {
    static int codigo = 0;
    private String nome;
    private int numVendas;
    private double salario;

    public Vendedor(String nome, int numVendas) {
        this.nome = nome;
        this.numVendas = numVendas;
        codigo ++;
        this.salario = 0.09 * numVendas + 200;
    }

    public double getSalario() {
        return this.salario;
    }
    public String getNome() {
        return this.nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public int getNumVendas() {
        return this.numVendas;
    }
}
