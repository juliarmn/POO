package lista1.exercicio13;

public class Conta {
    private String nome;
    private long cpf;
    private double saldo;
    private int agencia;
    private static int count = 0;

    public Conta () {
        count++;
    }
    public Conta (String nome, long cpf, double saldo, int agencia) {
        this.nome = nome;
        this. agencia = agencia;
        this.saldo = saldo;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public double depositarSaldo (double valorDeposito) {
        this.saldo += valorDeposito;
        return saldo;
    }
    public double sacarSaldo (double valorSaque) {
        this.saldo -= valorSaque;
        return saldo;
    }
}
