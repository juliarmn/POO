/*Escreva um programa que lê um caractere e retorna seu código na tabela ASCII (um número inteiro).*/

package lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        char c = scan.next().charAt(0);
        System.out.printf("O código ASCII de %c é %d", c, (int)c);
    }
}
