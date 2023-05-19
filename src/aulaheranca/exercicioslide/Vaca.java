package aulaheranca.exercicioslide;

public class Vaca extends Animal{
    String cor;
    int idade;
    int qualidadeDoLeite;

    public Vaca(String nome, int numeroPatas, String cor, int idade, int leite) {
        super(nome, numeroPatas);
        this.cor = cor;
        this.idade = idade;
        qualidadeDoLeite = leite;
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

    public int getQualidadeDoLeite() {
        return qualidadeDoLeite;
    }

    public void setQualidadeDoLeite(int qualidadeDoLeite) {
        this.qualidadeDoLeite = qualidadeDoLeite;
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuuu");
    }
}
