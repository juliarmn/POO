package aulaheranca.Lista.ExerciciosExtras.exercicio1;

public class Mamiferos extends Animal{
    private String tipo;

    public Mamiferos(String tipo) {
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
        System.out.println("Faz sons diversos");
    }

    @Override
    public void seMovimentar() {
        System.out.println("Andar ou correr");
    }
    @Override
    public String toString() {
        return "Mamífero";
    }
}
