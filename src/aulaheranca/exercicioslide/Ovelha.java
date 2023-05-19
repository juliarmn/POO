package aulaheranca.exercicioslide;

public class Ovelha extends Animal {
    String raca;
    int idade;
    String corDaLa;

    public Ovelha(String nome, int numeroPatas, String raca, int idade, String cor) {
        super(nome, numeroPatas);
        this.raca = raca;
        this.idade = idade;
        corDaLa = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDaLa() {
        return corDaLa;
    }

    public void setCorDaLa(String corDaLa) {
        this.corDaLa = corDaLa;
    }

    @Override
    public void emitirSom() {
        System.out.println("Méééé");
    }
}
