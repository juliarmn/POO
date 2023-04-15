/*Escreva um programa que lê 15 números double e através de uma funçâo determine quais s ̃ao os
dois maiores deles, que não devem ser repetidos.*/

package lista1;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] array = new double[15];
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + i + "º valor");
            array[i] = scan.nextDouble();
        }
        if (igual(array)) {
            System.out.println("Tudo igual, não há maior");
        } else {
            achaMaior(array);
        }
    }

    public static void achaMaior(double[] array) {
        double maior1 = array[0];
        double maior2 = array[0];
        for (int i = 0; i < 15; i++) {
            if (maior1 < array[i]) {
                maior2 = maior1;
                maior1 = array[i];
            } else if (maior2 < array[i] && array[i] != maior1) {
                maior2 = array[i];
            }
        }
        System.out.println("Os dois maiores são: " + maior1 + " " + maior2);
    }

    public static boolean igual(double[] array) {
        for(int i = 0; i < 15; i ++) {
            if (array[i] != array[0]) {
                return false;
            }
        }
        return true;
    }

}
