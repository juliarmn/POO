package fundamentos.aninhadas;
import  java.util.ArrayList;
public class Livros {
    private String autor;
    private String nome;
    private int edicao;

    private ArrayList<Copia> copias = new ArrayList<>();

    public Livros(String autor, String nome, int edicao) {
        this.autor = autor;
        this.nome = nome;
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public ArrayList<Copia> getCopias() {
        return copias;
    }

    public class Copia {
        public static int numCopia = 0;
        private boolean emprestado;

        public Copia(boolean emprestado) {
            this.numCopia ++;
            this.emprestado = emprestado;
        }

        public Copia () {
            numCopia++;
        }

        public int getNumCopia() {
            return numCopia;
        }

        public boolean isEmprestado() {
            return emprestado;
        }

        public void setEmprestado(boolean emprestado) {
            this.emprestado = emprestado;
        }
    }

    public void novaCopia() {
        copias.add(new Copia());
    }

    public void emprestarCopia(Copia copia) {
        copia.setEmprestado(true);
    }

    public void devolverCopia(Copia copia) {
        copia.setEmprestado(false);
    }

    public void consultarCopiaDisponivel(Copia copia) {
        copia.isEmprestado();
    }

    public int numCopiasDisp () {
        int numDispo = 0;
        for (Copia copia : this.getCopias()) {
            if(!copia.isEmprestado()) {
                numDispo++;
            }
        }
        return numDispo;
    }
}

//Depois fazer a main

