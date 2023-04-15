package aula_2.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private String nomeBanco;
    private int numeroBanco;
    private long cnpj;
    ArrayList<Agencia> agencias = new ArrayList<>();


    public int getNumeroBanco() {
        return numeroBanco;
    }

    public long getCnpj() {
        return cnpj;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }


    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }
    public void criarAgencia() {
        Scanner scan = new Scanner(System.in);
        Agencia agencia = new Agencia();
        System.out.println("Digite o nome");
        String nome = scan.nextLine();
        agencia.setNome(nome);
        int agenciaNum;
        do {
            System.out.println("Digite o número da agência");
            agenciaNum = scan.nextInt();
            if (agenciaNum <= 0) {
                System.out.println("Digite uma opção válida");
            }
        } while (agenciaNum <= 0);
        int op;
        do {
            System.out.println("Para adicionar contas digite 1");
            System.out.println("Para sair digite -1");
            op = scan.nextInt();
            if (op == 1) {
                agencia.criarContas();
            }
        } while (op != -1);
        this.agencias.add(agencia);
    }
}
