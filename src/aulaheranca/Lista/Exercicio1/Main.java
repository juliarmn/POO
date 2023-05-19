package aulaheranca.Lista.Exercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int y;
        Sala sala = new Sala(30, 5, 6);
        int i = 0;
        for (int x = 1; x <= 5; x ++) {
            y = 0;
            for (y = 1; y <= 6; y ++) {
                Cadeira cadeira = new Cadeira(i++, x, y);
                if (sala.adicionarCadeira(cadeira)) {
                    System.out.println("Adicionada com sucesso");
                } else {
                    System.out.println("Falha");
                }
            }
        }
        if(sala.removerCadeira(1)) {
            System.out.println("Removida");
        } else {
            System.out.println("Falha ao remover");

        }
        if (sala.adicionarCadeira(new Cadeira(31, 2, 3))) {
            System.out.println("Adicionada com sucesso");

        } else {
            System.out.println("sala cheia");
        }
        if (sala.moverCadeira(1, 2, 7)) {
            System.out.println("Movida com sucesso");
        } else {
            System.out.println("Falha ao mover");
        }
        if (sala.moverCadeira(4, 2, 7)) {
            System.out.println("Movida com sucesso");
        } else {
            System.out.println("Falha ao mover");
        }
    }
}
