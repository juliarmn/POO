package lista1.exercicio12;

public class Quadrado {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    double calculaArea() {
        return lado * lado;
    }
    double calculaPerimetro()  {
        return lado * 4;
    }
}
