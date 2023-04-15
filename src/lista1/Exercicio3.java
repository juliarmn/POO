/*Crie um programa que leia dois números inteiros e determine se um  é múltiplo do outro.*/

package lista1;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.println("São múltiplos? " + multiplos(num1, num2));
    }

    public static boolean multiplos(int num1, int num2) {
        if (num1 > num2) {
            return (num1 % num2 == 0);
        }
        return (num2 % num1 == 0);
    }

}
