/*Crie um programa que armazene 12 números em um array e determine qual a porcentagem de
números menores que 8 e qual a porcentagem de números maiores que 10.*/

package lista1;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[12];
        System.out.println("Digite os 12 valores:");
        for (int i  = 0; i < 12; i ++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Porcentagem de números menores que 8: " + ((double)(quantidadeMenor(array)) / 12.0) * 100 +  "%");
        System.out.println("Porcentagem de números maiores que 10: " + ((double)(quantidadeMaior(array)) / 12.0) * 100 +  "%");
    }

    public static int quantidadeMenor (int[] array) {
        int quantidade = 0;
        for (int i = 0; i < 12; i ++) {
            if (array[i] <= 8) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int quantidadeMaior (int[] array) {
        int quantidade = 0;
        for (int i = 0; i < 12; i ++) {
            if (array[i] > 10) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
