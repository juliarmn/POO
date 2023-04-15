package aula3.elevador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Predio predio = new Predio();
        System.out.println("Digite o número de andares");
        predio.setNumAndar(scan.nextInt());
        System.out.println("Digite o número de elevadores");
        predio.setNumElevador(scan.nextInt());

        for (int i = 0; i < predio.getNumElevador(); i ++) {
            predio.criarElevador();
        }
        int op;
        do {
            System.out.println("Você quer usar o elevador? Digite 0 para não");
            op = scan.nextInt();
            if (op != 0) {
                System.out.println("Digite o  andar atual");
                int andar = scan.nextInt();
                Pessoa pessoa = new Pessoa(andar, predio);
                pessoa.chamarElevador();
                System.out.println("Seu andar atual é: " + pessoa.getAndarAtual());
            }
        } while(op != 0);
    }
}
