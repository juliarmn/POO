package fundamentos.variaveiseconst;

public class InferirTipoDeDado {
    public static void main(String[] args) {
        double A = 2.4;
        System.out.println(A);
        //A linguagem consegue inferir o tipo da variável
        var B = 2.4;
        System.out.println(B);
        //Pode mudar a variável ao longo do programa para outro valor do mesmo tipo

        float j = 2.3f;//Colocar o float
        double k = 2_567.08;// Uso do _

        //Dados não primitivos:
        String s = "Bom dia!!!";
        s = s.toUpperCase();
        System.out.println(s);
    }
}
