package aula3.elevador;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevador {
    public static int id = 0;

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    public int andarAtual;
    public Elevador () {
        id ++;
        this.andarAtual = 0;
    }
    private void embarcarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    private void desembarcarPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
    public void moverPessoa(Pessoa pessoa) {
        Scanner scan = new Scanner(System.in);
        embarcarPessoa(pessoa);
        System.out.println("Digite o andar de destino");
        int andar = scan.nextInt();
        int tempo = Math.abs(andar - pessoa.getAndarAtual());
        try {
            Thread.sleep(10000L * tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pessoa.setAndarAtual(andar);
        desembarcarPessoa(pessoa);
    }
}
