package aulaheranca.Lista.ExerciciosExtras.exercicio1;

public class Ave extends Animal{
    String tipo;

    public Ave(String tipo) {
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
        System.out.println("cantar");
    }

    @Override
    public void seMovimentar() {
        System.out.println("voar");
    }
    @Override
    public String toString() {
        return "Ave";
    }
}
