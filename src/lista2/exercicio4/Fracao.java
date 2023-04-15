package lista2.exercicio4;
import java.util.Scanner;
public class Fracao {
    private int denominador;
    private int numerador;
    public Fracao (int denominador, int numerador) {
        this.numerador = numerador;
        if (denominador > 0) {
            this.denominador = denominador;
        } else {
            do {
                System.out.println("Valor incorreto, digite novamente");
                Scanner scan = new Scanner(System.in);
                denominador = scan.nextInt();
                if (denominador > 0) {
                    this.denominador = denominador;
                }
            } while(denominador <= 0);
        }
    }

    public void soma (int num1, int num2, int den1, int den2) {
        int den;
        den = mmc(den1, den2);
        int numSoma = ((num1 * (den / den1) )+ num2 * (den / den2));
        simplificar(numSoma, den);
    }

    public void multiplica (int num1, int num2, int den1, int den2) {
        int novoNum = num1 * num2;
        int novoDen = den1 * den2;
        simplificar(novoNum, novoDen);
    }

    public void divide (int num1, int num2, int den1, int den2) {
        int novoNum = num1 * den2;
        int novoDen = den1 * num2;
        simplificar(novoNum, novoDen);
    }

    public void subtracao (int num1, int num2, int den1, int den2) {
        int den;
        den = mmc(den1, den2);
        int numSoma = ((num1 * (den / den1) ) - num2 * (den / den2));
        simplificar(numSoma, den);
    }
    private int mmc (int denominador1, int denominador2) {
        return denominador1 * denominador2;
    }

    private int mdc(int a, int b) {
        int resto;
        while(b != 0){
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    private void simplificar (int num, int den) {
        int mdc;
        if (num < den) {
            mdc = mdc(den, num);
        } else {
            mdc = mdc(num, den);
        }
        num /= mdc;
        den /= mdc;
        formatar(num, den);
    }

    private void formatar(int num, int den) {
        System.out.println(num + "/" + den);
    }

    public int getDenominador() {
        return denominador;
    }
}
