/*Escreva um programa que estima o valor da constante e pela fórmula*/

package lista1;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de termos:");
        int termos = scan.nextInt();
        System.out.println("Aproximação do exponencial: " + exponencial(termos));
    }

    public static int fatorial (int num) {
        int fat = 1;
        for (int i = 1; i <= num; i ++) {
            fat = i * fat;
        }
        return fat;
    }

    public static double exponencial(int termos) {
        double e = 0;
        for (int i = 0; i < termos; i ++) {
            e += (1.0 / fatorial(i));
        }
        return e;
    }
}
