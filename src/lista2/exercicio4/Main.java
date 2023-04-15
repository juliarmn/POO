package lista2.exercicio4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numerador e denominador");
        int num1 = scan.nextInt();
        int den1 = scan.nextInt();
        Fracao frac1 = new Fracao(den1, num1);
        if (den1 == 0) {
            den1 = frac1.getDenominador();
        }
        System.out.println("Digite o segundo numerador e denominador");
        int num2 = scan.nextInt();
        int den2 = scan.nextInt();
        Fracao frac2 = new Fracao(den2, num2);
        if (den2 == 0) {
            den2 = frac2.getDenominador();
        }
        System.out.println("Operações com frações:");
        System.out.println("Adição: ");
        frac1.soma(num1, num2, den1, den2);
        System.out.println("Subtração: ");
        frac2.subtracao(num1, num2, den1, den2);
        System.out.println("Multiplicação: ");
        frac1.multiplica(num1, num2, den1, den2);
        System.out.println("Divisão: ");
        frac2.divide(num1, num2, den1, den2);
    }
}
