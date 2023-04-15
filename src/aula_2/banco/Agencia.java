package aula_2.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
    private String nome;
    private int numero;
    ArrayList<Conta> contas = new ArrayList<>();

    public ArrayList<Conta> getConta() {
        return contas;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Conta buscarConta (int num) {
        for(Conta item : this.contas) {
            if (item.getId() == num) {
                return item;
            }
        }
        return null;
    }

    public void criarContas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do cliente");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF:");
        long cpf  = scan.nextLong();
        System.out.println("Digite seu saldo");
        double saldo = scan.nextDouble();
        Conta conta = new Conta(nome, cpf, saldo);
        System.out.println("Crie uma senha: ");
        conta.setSenha(scan.nextLine());
        this.contas.add(conta);
    }
}
