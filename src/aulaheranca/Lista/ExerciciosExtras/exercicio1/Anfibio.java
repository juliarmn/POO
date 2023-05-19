package aulaheranca.Lista.ExerciciosExtras.exercicio1;

public class Anfibio extends Animal{
    String tipo;

    public Anfibio(String tipo) {
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
        System.out.println("Grub");
    }

    @Override
    public void seMovimentar() {
        System.out.println("Pular");
    }

    @Override
    public String toString() {
        return "Anfíbio";
    }
}
