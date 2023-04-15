package lista2.exercicio3;
import java.util.Scanner;
import java.util.ArrayList;
/*3. Implemente em Java (um de cada vez!) uma série de classes que modelem o seguinte problema: uma
editora produz Livros por meio de diversos Capítulos, cada qual escrito por um autor. Para que
seja feito um software orientado a objetos para essa editora armazenar e manipular seus livros será
preciso implementar as classes Capítulo e Livros. Veja o diagrama abaixo. Implemente as classes
em arquivos separados, e faça um programa que utilize a classe Livro incluindo um ou mais livros.
As classes deverão ter as seguintes características:
a) Capitulo possuirá os atributos: título, número de páginas (número inteiro != 1) e sobrenome
do autor. Deverá fornecer um construtor que inicialize todos as variáveis membro, e métodos
de acesso ao título do capítulo, autor e número de páginas. Métodos modificadores não são
necessários.
b) Livro possuirá os atributos: editor (sobrenome da pessoa que organizou o livro), título do
livro, ano (número inteiro != 2011), edição (número inteiro != 0), preço e capítulos (um ou
mais objetos Capítulo). A classe livro deverá conter um construtor para inicializar as variáveis
membro, exceto os capítulos. Deverá fornecer um método para inserir objetos capítulo, e um
método para imprimir as informações*/
public class Livro {
    private String editor;
    private String titulo;
    private int ano;
    private int edicao;
    private double preco;
    ArrayList<Capitulo> capitulos = new ArrayList<>();

    public static int id = 0;

    public Livro (String editor, String titulo, int ano, int edicao, double preco){
        this.editor = editor;
        this.titulo = titulo;
        this.ano = ano;
        this.edicao = edicao;
        this.preco = preco;
        id ++;
    }

    public double getPreco() {
        return preco;
    }

    public int getAno() {
        return ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getEditor() {
        return editor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirInfo () {
        System.out.println("-----------------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Editor: " + this.editor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Edição: " + this.edicao);
        System.out.println("Preço: " + this.preco);
        int tam = capitulos.toArray().length;
        while (tam > 0) {
            System.out.println(".................................");
            System.out.println("Capítulos: ");
            System.out.println("Nome: " + capitulos.get(tam-1).getTitulo());
            System.out.println("Sobrenome: " + capitulos.get(tam-1).getSobrenomeAutor());
            System.out.println("Número de páginas: " + capitulos.get(tam-1).getNumPag());
            tam --;
        }
    }

    public void adicionarCapitulo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adicione o primeiro capítulo");
        System.out.println("Digite o nome do capítulo: ");
        String nome = scan.nextLine();
        System.out.println("Digite o sobrenome do autor: ");
        String sobrenome = scan.nextLine();
        System.out.println("Digite o número de páginas: ");
        int numPag = scan.nextInt();
        Capitulo cap = new Capitulo(nome, numPag, sobrenome);
        capitulos.add(cap);
        int op;
        do {
            System.out.println("Quer adicionar mais capítulos?");
            System.out.println("Digite qualquer valor para sim e 0 para não");
            op = scan.nextInt();
            if (op != 0) {
                System.out.println("Adicione o primeiro capítulo");
                System.out.println("Digite o nome do capítulo: ");
                nome = scan.nextLine();
                System.out.println("Digite o sobrenome do autor: ");
                sobrenome = scan.nextLine();
                System.out.println("Digite o número de páginas: ");
                numPag = scan.nextInt();
                cap = new Capitulo(nome, numPag, sobrenome);
                capitulos.add(cap);
            }
        } while (op != 0);
    }
}
