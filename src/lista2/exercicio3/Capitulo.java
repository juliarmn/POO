package lista2.exercicio3;
/*a) Capitulo possuirá os atributos: título, número de páginas (número inteiro != 1) e sobrenome
do autor. Deverá fornecer um construtor que inicialize todos as variáveis membro, e métodos
de acesso ao título do capítulo, autor e número de páginas. Métodos modificadores não são
necessários.*/
public class Capitulo {
    private String titulo;
    private int numPag;
    private String sobrenomeAutor;
    public Capitulo (String titulo, int numPag, String sobrenomeAutor) {
        this.titulo = titulo;
        this.numPag = numPag;
        this.sobrenomeAutor = sobrenomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public String getSobrenomeAutor() {
        return sobrenomeAutor;
    }
}
