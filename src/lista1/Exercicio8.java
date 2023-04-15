/*Crie um programa que leia 12 números inteiros em qualquer ordem e imprima uma listagem contendo
o número lido e uma mensagem “PAR” ou “ ́IMPAR” conforme o número.*/

package lista1;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] array = new int[12];
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita os os 12 números: ");
        for (int i = 0; i < 12; i ++) {
            array[i] = scan.nextInt();
        }
        parOuImpar(array);
    }

    public static void parOuImpar(int[] array) {
        for(int i = 0; i < 12; i ++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + ": par");
            } else {
                System.out.println(array[i] + ": ímpar");
            }
        }
    }
}
