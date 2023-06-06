package exceçoes.lista.exercicio1;

public class Circulo implements FormaGeometrica{
    double raio;
    static final double PI = 3.1415;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return this.raio * this.raio * PI;
    }

    @Override
    public double calcularPerimetro() {
        return this.raio * PI * 2;
    }
}
