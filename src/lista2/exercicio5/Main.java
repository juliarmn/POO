package lista2.exercicio5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do primeiro  vetor");
        int tam = scan.nextInt();
        int[] vet = new int[tam];
        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < tam; i ++) {
            vet[i] = scan.nextInt();
        }
        Vetor vetor1 = new Vetor(vet);
        System.out.println("Digite o tamanho do segundo  vetor");
        tam = scan.nextInt();
        vet = new int[tam];
        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < tam; i ++) {
            vet[i] = scan.nextInt();
        }
        Vetor vetor2 = new Vetor(vet);
        System.out.println("Soma de vetores: ");
        int[]vet3 = new int[vetor1.getTam()];
        vet3 =  vetor1.somarVetores(vetor1, vetor2);
        for (int i = 0; i < vet3.length; i ++) {
            System.out.print("[" + vet3[i] + "] ");
        }
    }
}
