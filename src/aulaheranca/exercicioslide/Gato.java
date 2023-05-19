package aulaheranca.exercicioslide;

public class Gato extends Animal {
    String cor;
    int idade;
    String raca;

    public Gato(String nome, int numeroPatas, String cor, int idade, String raca) {
        super(nome, numeroPatas);
        this.cor = cor;
        this.idade = idade;
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public void emitirSom() {
        System.out.println("Miauuuu");
    }

    @Override
    public String toString() {
        return "gato";
    }
}