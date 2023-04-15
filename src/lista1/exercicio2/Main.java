package lista1.exercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        Circulo circ = new Circulo(raio);
        System.out.println("Dados da circunferência de raio " + circ.getRaio());
        System.out.println("O diâmetro é: " + circ.getDiam());
        System.out.println("A área é: " + circ.getArea());
    }
}
