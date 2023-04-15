package lista1.exercicio12;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    boolean serTriangulo() {
        return !(lado1 > (lado2 + lado3)) && !(lado2 > (lado1 + lado3)) && !(lado3 > (lado2 + lado1));
    }

    double calculaPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
