package aula_2.banco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco();
        System.out.println("Bem vindo ao banco:");
        System.out.println("Digite o nome do banco");
        banco.setNomeBanco(scan.nextLine());
        System.out.println("Digite o CNPJ");
        banco.setCnpj(scan.nextLong());
        //Validar depois:
        System.out.println("Digite o número do banco:");
        banco.setNumeroBanco(scan.nextInt());
        int op;
        do {
            System.out.println("Para adicionar agências digite 1");
            System.out.println("Para sair digite -1");
            op = scan.nextInt();
            if (op == 1) {
                banco.criarAgencia();
            }
        } while (op != -1);
    }

    public void printarBanco(Banco banco) {
        System.out.println("Nome do banco: " + banco.getNomeBanco());
        System.out.println("Número do banco: " + banco.getNumeroBanco());
        System.out.println("CNPJ do banco: " + banco.getCnpj());
        for (Agencia item : banco.getAgencias()) {
            System.out.println("Nome da agência: " + item.getNome());
            System.out.println("Número da agência: " + item.getNumero());
            for (Conta conta : item.getConta()) {
                System.out.println("Nome: " + conta.getNomeCliente());
                System.out.println("CPF: " + conta.getCpf());
                System.out.println("Saldo: " + conta.getSaldo());
            }
        }
    }
}
