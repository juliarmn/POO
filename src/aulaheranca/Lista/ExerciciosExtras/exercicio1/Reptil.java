package aulaheranca.Lista.ExerciciosExtras.exercicio1;

public class Reptil extends Animal{
    String tipo;

    public Reptil(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void fazerSom() {
        System.out.println("sibilar");
    }

    @Override
    public void seMovimentar() {
        System.out.println("Se arrastar");
    }

    @Override
    public String toString() {
        return "Réptil";
    }
}
