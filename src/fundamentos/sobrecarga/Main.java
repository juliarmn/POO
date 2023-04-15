package fundamentos.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(1, 2, 3);
        Vetor v2 = new Vetor(4, 5, 6);

        Vetor soma = v1.add(v2); // uso do operador sobrecarregado +
        Vetor subtracao = v2.subtract(v1);

        System.out.println("Soma: (" + soma.getX() + ", " + soma.getY() + ", " + soma.getZ() + ")");
        System.out.println("Subtração: (" + subtracao.getX() + ", " + subtracao.getY() + ", " + subtracao.getZ() + ")");
    }
}
