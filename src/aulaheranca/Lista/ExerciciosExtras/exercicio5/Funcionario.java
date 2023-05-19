package aulaheranca.Lista.ExerciciosExtras.exercicio5;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public final String getNome() {
        return nome;
    }

    public abstract double calcularBonus();
}
