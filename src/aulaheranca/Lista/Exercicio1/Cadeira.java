package aulaheranca.Lista.Exercicio1;

public class Cadeira {
    int numeracao;
    int posicaoX;
    int posicaoY;

    public Cadeira(int numeracao, int posicaoX, int posicaoY) {
        this.numeracao = numeracao;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }


    public void moverCadeira(int x, int y) {
        posicaoX = x;
        posicaoY = y;
    }
}
