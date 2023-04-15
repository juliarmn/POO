package lista2.exercicio6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        Circulo circ = new Circulo(scan.nextDouble());
        circ.setDiametro(circ.getRaio());
        System.out.println("Diâmetro: " + circ.getDiametro());
        System.out.println("Área modo 1: " + circ.calcularArea(circ.getRaio()));
        System.out.println("Área modo 2: " + circ.calcularAreaDiam(circ.getDiametro()));
    }
}
