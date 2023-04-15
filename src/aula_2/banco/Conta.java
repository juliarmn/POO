package aula_2.banco;

import java.util.Scanner;

public class Conta {
    private String nomeCliente;
    public static int id = 0;
    private long cpf;
    private double saldo;

    private String senha;

    public Conta(String nome, long cpf, double saldo) {
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        id ++;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getId() {
        return id;
    }
    public long getCpf() {
        return cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public static void setId(int id) {
        Conta.id = id;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarSaldo (double valorDeposito) {
            this.saldo += valorDeposito;
    }
    public void sacarSaldo (double valorSaque) {
            this.saldo -= valorSaque;
    }

    public void operacoes(Scanner scan) {
        System.out.println("Digite sua senha");
        String senha = scan.nextLine();
        if (senha.equals(this.senha)) {
            int op;
            do {
                System.out.println("Escolha:");
                System.out.println("1) Depositar");
                System.out.println("2) Saque");
                System.out.println("0) Sair");
                op = scan.nextInt();
                switch(op) {
                    case 0: break;
                    case 1: {
                        System.out.println("Digite quanto quer depositar");
                        double valor = scan.nextDouble();
                        if (valor <= 0) {
                            do {
                                System.out.println("Inválido, digite outro valor");
                                valor = scan.nextDouble();
                            } while (valor <= 0);
                        }
                        depositarSaldo(valor);
                        break;
                    }
                    case 2: {
                        System.out.println("Quanto quer sacar?");
                        double valor = scan.nextDouble();
                        if (valor < this.saldo) {
                            do {
                                System.out.println("Valor inválido, digite um valor novamente");
                                valor = scan.nextDouble();
                            } while (valor < this.saldo);
                        }
                        sacarSaldo(valor);
                    }
                    default: {
                        System.out.println("Opção inválida");
                        break;
                    }
                }
            } while (op > 2 || op <= 0);
        }
    }
}
