package aulaheranca.Lista.ExerciciosExtras.exercicio4;

public class ContaCorrente extends ContaBancaria{
        private double limite;

        public ContaCorrente(int numeroDaConta, double saldo, double limite) {
            super(numeroDaConta, saldo);
            this.limite = limite;
        }

        @Override
        public void sacarValor(double valor) {
            if (valor <= getSaldo()) {
                super.sacarValor(valor);
            } else if (valor <= (getSaldo() + limite)) {
                double saldoAtual = getSaldo();
                double limiteUtilizado = valor - saldoAtual;
                super.sacarValor(saldoAtual);
                setSaldo(getSaldo() - limiteUtilizado);
            } else {
                System.out.println("Saldo insuficiente e limite ultrapassado.");
            }
        }

        public double getLimite() {
            return limite;
        }
}
