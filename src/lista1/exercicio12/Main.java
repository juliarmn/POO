package lista1.exercicio12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado:");
        double lado = scan.nextDouble();
        Quadrado quad = new Quadrado(lado);
        System.out.println("Digite o valor do raio do círculo:");
        double raio = scan.nextDouble();
        Circulo circ = new Circulo(raio);
        System.out.println("Digite os 3 lados do triângulo:");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();
        Triangulo trig = new Triangulo(lado1, lado2, lado3);
        System.out.println("Perímetro quadrado: " + quad.calculaPerimetro() + "; área: " + quad.calculaArea());
        System.out.println("Tamanho circunferência: " + circ.calculaCircunferencia() + "; área: " + circ.calculaArea());
        System.out.println("É mesmo um triângulo? " + trig.serTriangulo());
        if (trig.serTriangulo()) {
            System.out.println("Esse triâhgulo tem diâmetro: " + trig.calculaPerimetro());
        }
    }
}
