package lista1.exercicio12;

public class Circulo {
    private double raio;
    final double PI = 3.1415;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calculaCircunferencia() {
        return 2 * PI * raio;
    }
    double calculaArea() {
        return PI * raio * raio;
    }
}
