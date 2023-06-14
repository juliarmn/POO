package generics;

import java.util.List;

public class Calculadora {
    public static <T extends Number> double somarElementos(List<T> numeros) {
        double soma = 0;
        for (T num : numeros) {
            soma += num.doubleValue();
        }
        return soma;
    }
}
