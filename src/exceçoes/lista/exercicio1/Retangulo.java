package exceçoes.lista.exercicio1;

public class Retangulo implements FormaGeometrica{
    double lado1, lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * lado1) + (2 * lado2);
    }
}
