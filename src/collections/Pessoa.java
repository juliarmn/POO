package collections;

import generics.ComComparable;

public class Pessoa implements Comparable<Pessoa> {
    String nome;
    public Pessoa (String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }
    public String toString() {
        return this.nome;
    }
}
