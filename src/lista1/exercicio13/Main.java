package lista1.exercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 1;
        while (op != 0) {
            do {
                System.out.println("Menu:");
                System.out.println("1)Inserir cliente;");
                System.out.println("2)Depositar;");
                System.out.println("3)Sacar;");
                System.out.println("0)Sair");
                op = scan.nextInt();
            } while (op < 0 || op > 3);
            if (op == 1) {
                System.out.println("Digite o nome:");
                String nome = scan.next();
                System.out.println("Digite o CPF: ");
                long cpf = scan.nextLong();
                System.out.println("Digite o saldo: ");
                double saldo = scan.nextDouble();
                System.out.println("Digite a agência: ");
                int agencia = scan.nextInt();
                Conta pessoa = new Conta(nome, cpf, saldo, agencia);
                contas.add(pessoa);
            } else if (op == 2) {
                if (contas.isEmpty()) {
                    System.out.println("Não há conta");
                } else {
                    System.out.println("Qual o número da conta?");
                    int numConta = scan.nextInt();
                    Conta pessoa = contas.get(numConta - 1);
                    System.out.println("Saldo atual: " + pessoa.getSaldo());
                    double mais;
                    do {
                        System.out.println("Quanto que adicionar?");
                         mais = scan.nextDouble();
                        if (mais <= 0) {
                            System.out.println("Digite um valor válido!");
                        }
                    } while (mais <= 0);
                    System.out.println("O novo saldo é: " + pessoa.depositarSaldo(mais));
                }
            } else if (op == 3) {
                if (contas.isEmpty()) {
                    System.out.println("Não há conta");
                } else {
                    System.out.println("Qual o número da conta?");
                    int numConta = scan.nextInt();
                    Conta pessoa = contas.get(numConta - 1);
                    System.out.println("Saldo atual: " + pessoa.getSaldo());
                    double menos;
                    do {
                        System.out.println("Quanto deseja retirar?");
                        menos = scan.nextDouble();
                        if (menos <= 0) {
                            System.out.println("Digite um valor válido");
                            menos = scan.nextDouble();
                        }
                        if (menos > pessoa.getSaldo()) {
                            System.out.println("Saldo  insuficiente");
                            menos = scan.nextDouble();
                        }

                    } while (menos <= 0 && menos > pessoa.getSaldo());

                    System.out.println("O novo saldo é: " + pessoa.sacarSaldo(menos));
                }
            }
        }
    }
}
