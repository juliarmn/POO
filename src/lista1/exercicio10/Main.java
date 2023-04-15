package lista1.exercicio10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a dimensão da matriz: ");
        int dimensao = scan.nextInt();
        int[][] valores = new int[dimensao][dimensao];
        System.out.println("Valores da matriz: ");
        for (int i = 0; i < dimensao; i ++) {
            for (int j = 0; j < dimensao; j ++) {
                valores[i][j] = scan.nextInt();
            }
        }
        Matriz matrix = new Matriz(valores, dimensao);
        if (matrix.temRepetido()) {
            System.out.println("Há valores repetidos!");
        } else {
            if (matrix.QuadradoMagico()) {
                System.out.println("É quadrado mágico");
            } else {
                System.out.println("Não é quadrado mágico");
            }
        }
    }
}
