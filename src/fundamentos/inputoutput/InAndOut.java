package fundamentos.inputoutput;
import java.util.Scanner;
public class InAndOut {
    public static void main(String[] args) {
        //Fica na mesma linha a não ser que use o \n
        System.out.print("Bom ");
        System.out.print("Dia\n");
        //O println faz a quebra de linha automaticamente
        int x = 3;
        int y = 5;
        System.out.printf("Soma entre %d e %d: %d %n", x, y, x + y);
        //Entrada de dados:
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = enter.nextLine();
        System.out.println("Oi, " + nome);
    }
}
