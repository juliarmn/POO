package lista1;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of lines: ");
        int linesA = scan.nextInt();
        System.out.println("\nNumber of columns: ");
        int columnsA = scan.nextInt();

        int[][] matrixA = new int[linesA][columnsA];

        for (int i = 0; i < linesA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.println("Value [" + i + "][" + j + "]");
                matrixA[i][j] = scan.nextInt();
            }
        }

        System.out.println("Number of lines: ");
        int linesB = scan.nextInt();
        System.out.println("\nNumber of columns: ");
        int columnsB = scan.nextInt();

        int[][] matrixB = new int[linesB][columnsB];

        for (int i = 0; i < linesB; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.println("Value [" + i + "][" + j + "]: ");
                matrixB[i][j] = scan.nextInt();
            }
        }

        boolean ok;
        ok = multiply(linesA, columnsA, matrixA, linesB, columnsB, matrixB);
    }
    static boolean multiply ( int lineA, int columnA, int matrixA[][], int lineB, int columnB, int matrixB[][])  {
        if (columnA != lineB) {
            System.out.println("\nNot possible");
            return false;
        }
        int matrixC[][] = new int[lineA][columnB];

        for (int i  = 0; i < lineA; i ++) {
            for (int j = 0; j < columnB; j ++) {
                for (int k = 0; k < columnA; k ++) {
                    matrixC[i][j] = matrixC[i][j] + (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        //Printa a matriz
        for (int i = 0; i < lineA; i ++) {
            for (int j = 0; j < columnB; j ++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
        return true;
    }

}