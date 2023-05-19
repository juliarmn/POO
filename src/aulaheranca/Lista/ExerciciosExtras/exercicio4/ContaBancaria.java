package aulaheranca.Lista.ExerciciosExtras.exercicio4;

public class ContaBancaria {
    private int numConta;
    private double saldo;

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void adicionarSaldo(double valor) {
        if (valor < 0) {
            System.out.println("Erro");
        } else {
            setSaldo(getSaldo() + valor);
        }
    }

    public void sacarValor(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Erro");
        } else {
            setSaldo(getSaldo() - valor);
        }
    }
}
