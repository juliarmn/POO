package aula3.elevador;

public class Pessoa {
    int andarAtual;
    Predio predio;
    public Pessoa(int andarAtual, Predio predio) {
        this.andarAtual = andarAtual;
        this.predio = predio;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void chamarElevador () {
        predio.getElevadores().get(0).moverPessoa(this);
    }

}
