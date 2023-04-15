/*11. Escreva um programa que leia uma string do usuário e verifique se ela contém apenas caracteres
 únicos.*/

package lista1;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a string:");
        String str = scan.nextLine();
        System.out.println("Contém apenas caracteres únicos? " + verificaStr(str) );
    }

    public static boolean verificaStr(String str) {
        int tam = str.length();
        char carac;
        int [] vet = new int[127];
        for (int i  = 0; i < tam; i ++) {
            carac = str.charAt(i);
            vet[carac] ++;
            if (vet[carac] > 1) {
                return false;
            }
        }
        return true;
    }
}
