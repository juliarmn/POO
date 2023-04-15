package fundamentos.conversoes;

public class TipoPrimitivo {
    public static void main(String[] args) {
        //Conversão implícita:
        double a = 1;
        //double é maior que int, então é ok
        //Foi convertido de double para int
        System.out.println(a);
        //Conversão explícita:
        float b = 1.0f;
        //Ou com casting:
        float c = (float)1.0;
        //No caso acima não houve perda de informação
        System.out.println(b);
        System.out.println(c);
    }
}
