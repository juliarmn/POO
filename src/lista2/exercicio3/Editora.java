package lista2.exercicio3;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.ArrayList;
public class Editora {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int op;
        ArrayList<Livro> livros = new ArrayList<>();
        System.out.println("Insira o primeiro livro: ");
        System.out.println("Título: ");
        String titulo = scan.nextLine();
        System.out.println("Editor: ");
        String editor = scan.nextLine();
        System.out.println("Ano: " );
        int ano = scan.nextInt();
        int edicao;
        do {
            System.out.println("Edição:");
            edicao = scan.nextInt();
        } while(edicao <= 0);
        double preco;
        do {
            System.out.println("Preço: ");
            preco = scan.nextDouble();
        } while(preco < 0);
        Livro livro = new Livro(titulo, editor, ano, edicao, preco);
        livros.add(livro);
        do {
            System.out.println("Deseja adicionar mais livros?");
            System.out.println("Digite qualquer valor para sim e 0 para não");
            op = scan.nextInt();
            if (op != 0) {
                System.out.println("Título: ");
                titulo = scan.nextLine();
                System.out.println("Editor: ");
                editor = scan.nextLine();
                System.out.println("Ano: " );
                ano = scan.nextInt();
                do {
                    System.out.println("Edição:");
                    edicao = scan.nextInt();
                } while(edicao <= 0);
                do {
                    System.out.println("Preço: ");
                    preco = scan.nextDouble();
                } while(preco < 0);
                livro = new Livro(titulo, editor, ano, edicao, preco);
                livro.adicionarCapitulo();
                livros.add(livro);
            }
        } while (op != 0);
        int tam = livros.toArray().length;
        while (tam > 0) {
            livros.get(tam-1).imprimirInfo();
        }
    }

}
