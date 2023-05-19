package exceçoes;

import java.util.Scanner;

public class Calculator {
    private static double calcular(double a, double b, char op) throws Exceptions {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return divisao(a, b);
        } else {
            throw new Exceptions("Operador não existe");
        }
    }

    private static double divisao(double a, double b) throws Exceptions {
        if (b == 0) {
            throw new Exceptions("Divisão por 0 não pode");
        }
        return a / b;
    }

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.println("Digite os operandos: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        System.out.println("Digite o operador");
        char op = scan.next().charAt(0);
        try {
            System.out.println(a + " " + op + " " + b + " = " + calcular(a, b, op));
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        }

    }
}
