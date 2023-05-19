package aulaheranca.Lista.ExerciciosExtras.exercicio2;

public class Circulo extends FormaGeometrica{
    private double raio;
    public static final double PI = 3.1415;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return this.raio * this.raio * PI;
    }

    @Override
    public double perimetro() {
        return this.raio * 2 * PI;
    }
    @Override
    public String toString() {
        return "Círculo";
    }
}
