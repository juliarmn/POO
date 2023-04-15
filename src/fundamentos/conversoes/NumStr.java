package fundamentos.conversoes;

public class NumStr {
    public static void main(String[] args) {
        Integer firstNum = 98569;
        //Transforma em string para conseguir realizar as funções de string
        System.out.println(Integer.toString(firstNum).length());
        //Segundo modo:
        int secondNum = 123;
        System.out.println(Integer.toString(secondNum).length());
        //Terceira forma (pouco eficiente):
        System.out.println(("" + secondNum).length());
    }
}
