/*Escreva um programa que leia três inteiros e imprima a soma, a m ́edia, o produto e o maior e o
menor elemento lido.*/

package aulas.lista1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("A soma entre os números é " + soma(num1, num2, num3));
        System.out.printf("A média é %.2f\n", media(num1, num2, num3));
        System.out.println("O produto entre os números é " + produto(num1, num2, num3));
        System.out.println("O maior número é " + maior(num1, num2, num3) + " e o menor é " +menor(num1, num2, num3));
    }

    static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static double media (int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    static int produto(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    static int maior(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    static int menor (int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

}

