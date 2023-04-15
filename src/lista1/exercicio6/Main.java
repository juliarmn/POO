package lista1.exercicio6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op = 1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Quer adicionar um novo vendedor?");
            System.out.println("-1 para não e qualquer valor para sim");
            op = scan.nextInt();
            scan.nextLine();
            if (op != -1) {
                System.out.println("Nome: ");
                String nome = scan.nextLine();
                System.out.println("Número de vendas: ");
                int numVendas = scan.nextInt();
                Vendedor vendedor  = new Vendedor(nome, numVendas);
                System.out.println("Informações do vendedor de código " + vendedor.getCodigo());
                System.out.println("Nome: " + vendedor.getNome());
                System.out.println("Número de vendas: " + vendedor.getNumVendas());
                System.out.printf("Salário final: %.2f\n", vendedor.getSalario());
            } else {
                System.out.println("Programa encerrado.");
            }
        } while (op != -1);
    }
}
