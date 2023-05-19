package aulaheranca.Lista.ExerciciosExtras.exercicio2;

public class Triangulo extends FormaGeometrica{
    double base;
    double lado1;
    double lado2;
    double altura;

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.base;
    }

    @Override
    public double perimetro() {
        return this.lado1 + this.lado2 + this.base;
    }
    @Override
    public String toString() {
        return "Triângulo";
    }
}
