package fundamentos.variaveiseconst;

public class ConverteTemp {
    public static void main(String[] args) {
        float fahrenheit = 98;
        final int CONSTANTE = 32;
        float celsius;

        System.out.println("A temperatura em Celsius é: " + ((fahrenheit - CONSTANTE) *  5) / 9.0);
    }

}
