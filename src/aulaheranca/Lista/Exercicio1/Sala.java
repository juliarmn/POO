package aulaheranca.Lista.Exercicio1;

import java.util.ArrayList;

public class Sala {
    int numMaxCadeira;
    int xMax;
    int yMax;
    ArrayList<Cadeira> cadeiras = new ArrayList<>();

    public Sala(int numMaxCadeira, int xMax, int yMax) {
        this.numMaxCadeira = numMaxCadeira;
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public Sala(int numMaxCadeira) {
        this.numMaxCadeira = numMaxCadeira;
    }
    public boolean adicionarCadeira (Cadeira cadeira) {
        if (this.numMaxCadeira == cadeiras.size()) {
            return false;
        } else {
            cadeiras.add(cadeira);
            return true;
        }
    }

    public boolean removerCadeira (int id) {
        if (cadeiras.size() == 0) {
            return false;
        } else {
            for (Cadeira cadeira : cadeiras) {
                if (id == cadeira.numeracao) {
                    System.out.println("Foi removida a cadeira de (x, y): (" + cadeira.posicaoX + ", " + cadeira.posicaoY + ")");
                    cadeiras.remove(cadeira);
                    return true;
                }
            }
            return false;
        }
    }

    public boolean moverCadeira (int x, int y, int id) {
        if(x > this.xMax || y > this.yMax) {
            return false;
        } else {
            for (Cadeira cadeira : cadeiras) {
                if (cadeira.posicaoY == y && cadeira.posicaoX == x) {
                    return false;
                }
            }
            for (Cadeira cadeira : cadeiras) {
                if (id == cadeira.numeracao) {
                    cadeira.moverCadeira(x, y);
                    return true;
                }
            }
            return false;
        }
    }
}
