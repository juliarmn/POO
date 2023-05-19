package aulaheranca.Lista.ExerciciosExtras.exercicio4;

public class Principal {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 1000.0, 0.05);
        ContaCorrente contaCorrente = new ContaCorrente(456, 2000.0, 1000.0);

        ContaBancaria[] contas = new ContaBancaria[2];
        contas[0] = contaPoupanca;
        contas[1] = contaCorrente;

        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ContaPoupanca poupanca = (ContaPoupanca) conta;
                poupanca.aplicarRendimento();
                System.out.println("Saldo da Conta Poupança: " + poupanca.getSaldo());
            } else if (conta instanceof ContaCorrente) {
                ContaCorrente corrente = (ContaCorrente) conta;
                corrente.sacarValor(1500.0);
                corrente.adicionarSaldo(500.0);
                System.out.println("Saldo da Conta Corrente: " + corrente.getSaldo());
            }
        }
    }
}

