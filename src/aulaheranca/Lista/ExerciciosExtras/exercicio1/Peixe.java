package aulaheranca.Lista.ExerciciosExtras.exercicio1;

public class Peixe extends Animal{
    private String tipo;

    public Peixe(String tipo) {
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
        System.out.println("bolhas");
    }

    @Override
    public void seMovimentar() {
        System.out.println("Nadar");
    }
    @Override
    public String toString() {
        return "Peixe";
    }
}
