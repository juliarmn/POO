package aula3.carros;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Locacao> locacao = new ArrayList<>();
    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Locacao> getLocacao() {
        return locacao;
    }

    public void setLocacao(ArrayList<Locacao> locacao) {
        this.locacao = locacao;
    }

    public void adicionarLocacao(Locacao locacao) {
        this.locacao.add(locacao);
    }
}
