package fundamentos.inputoutput;
import java.util.Scanner;
public class Nome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        //Por conta do tipo int temos que limpar o buffer
        //ALgo para pegar o \n
        int idade = input.nextInt();
        input.nextLine();//Lê esse \n
        System.out.println("Qual seu nome?");
        String nome = input.nextLine();
        System.out.println("Qual seu sobrenome?");
        String sobrenome = input.nextLine();
        System.out.println("Olá, " + nome + " " + sobrenome + ". Você tem " + idade + " anos");
        input.close();
    }
}
