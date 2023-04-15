package lista1.exercicio10;
//import java.util.HashSet;
public class Matriz {
    private int dimensao;

    private int[][] matriz;


    public Matriz (int[][] valores, int dimensao) {
        this.matriz = valores;
        this.dimensao = dimensao;
    }


    boolean temRepetido() {
        /*HashSet<Integer> duplicado = new HashSet<Integer>();
        for (int i = 0; i < dimensao; i ++) {
            for (int j = 0; j < dimensao; j ++) {
                if (!duplicado.add(matriz[i][j])) {
                    return true;
                }
            }
        }*/
        int verifica;
        for (int i = 0; i < dimensao; i ++) {
            for (int j = 0; j < dimensao; j ++) {
                verifica = matriz[i][j];
                for (int k = 0; k < dimensao; k++) {
                    for (int l = j + 1; l < dimensao; l++) {
                        if(verifica == matriz[k][l]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    boolean QuadradoMagico() {
        int[] somaLinha = new int[dimensao];
        int[] somaColuna = new int[dimensao];
        int somaDiagPrinc = 0, somaDiagSec = 0;

        for (int i = 0; i < dimensao;  i ++) {
            somaColuna[i] = 0;
            somaLinha[i] = 0;
           for (int j = 0; j < dimensao; j ++) {
               somaColuna[i] += matriz[i][j];
               somaLinha[i] += matriz[j][i];
               if (i == j) {
                   somaDiagPrinc += matriz[i][j];
               }
               if (i + j == dimensao - 1) {
                   somaDiagSec += matriz[i][j];
               }
           }
        }

        for (int i = 0; i < dimensao; i ++) {
            if(somaLinha[i] != somaColuna[i]) {
                return false;
            }
        }

        return somaDiagSec == somaLinha[0] && somaDiagPrinc == somaDiagSec;
    }
}
