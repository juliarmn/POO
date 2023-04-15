package lista2.exercicio5;

public class Vetor {
    int tam;
    int[] valores;
    public Vetor(int[]vet) {
        this.tam = vet.length;
        this.valores = new int[vet.length];
        for (int i = 0; i < vet.length; i ++) {
            valores[i] = vet[i];
        }
    }

    public int getTam() {
        return tam;
    }
    //Na próxima função poderia ter operado com as classes ao invés de com vetores:

    public int[] somarVetores(Vetor vet1, Vetor vet2) {
        if (podeOperar(vet1.getTam(), vet2.getTam())) {
            int[] vet3 = new int[vet1.getTam()];
            for (int i = 0; i < vet1.getTam(); i ++) {
                vet3[i] = vet1.valores[i] + vet2.valores[i];
            }
            return vet3;
        }
        System.out.println("Não pode operar: tamanhos diferentes");
        return null;
    }

    private boolean podeOperar(int tam1, int tam2) {
        return tam1 == tam2;
    }
}
