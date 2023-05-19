package aulaheranca.Lista.Exercicio2;

public class Apartamento {
    private int numero;
    private int andar;
    private int numQuartos;

    public Apartamento(int numero, int andar, int numQuartos) {
        this.numero = numero;
        this.andar = andar;
        this.numQuartos = numQuartos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
}
