package lista2.exercicio6;

public class Circulo {
    public static final double PI = 3.1415;
    private double raio;
    private double diametro;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRaio() {
        return raio;
    }

    public void setDiametro(double raio) {
        this.diametro = raio * 2;
    }

    public double calcularArea(double raio) {
        return raio * raio * PI;
    }

    public double calcularAreaDiam(double diametro) {
        double raio = diametro / 2;
        return (raio * raio * PI);
    }
}
