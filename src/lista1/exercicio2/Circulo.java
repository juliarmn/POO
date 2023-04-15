/*Escreva um programa que leia o raio de um círculo e imprima o diˆametro,  ́area e circunferˆencia do
círculo. Os resultados devem ser escritos com duas casas decimais.*/

package lista1.exercicio2;

public class Circulo {
    static final double PI = 3.1415;
    private double raio;
    private double area;
    private double diametro;

    public Circulo (double raio) {
        this.raio = raio;
        this.area = raio * raio * PI;
        this.diametro = 2 * raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double getDiam() {
        return this.diametro;
    }

    public double getArea() {
        return this.area;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }
}
