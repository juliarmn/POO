package aulaheranca.Lista.ExerciciosExtras.exercicio2;

public class Retangulo extends FormaGeometrica{
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

    @Override
    public double perimetro() {
        return (2 * this.lado2) + (2 * this.lado1);
    }

    @Override
    public String toString() {
        return "Retângulo";
    }
}
