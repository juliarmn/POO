package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> p = new ArrayList<>();
        p.add(new Pessoa("Júlia"));
        p.add(new Pessoa("Lucas"));
        p.add(new Pessoa("Rubens"));
        p.add(new Pessoa("Amanda"));

        System.out.println("Antes de ordenar: " + p);
        Collections.sort(p);
        System.out.println("Depois de ordenar: " + p);

//        Collections.shuffle(p);
//        System.out.println("Aleatório: " + p);

//        Collections.reverse(p);
//        System.out.println("Invertendo elementos: " + p);
//
//        Collections.swap(p, 1, 2);
//        System.out.println("Com swap: " + p);

        p.add(new Pessoa("Amanda"));
        System.out.println(p);
        System.out.println("Frequência: " + Collections.frequency(p, p.get(0)));

        Collections.fill(p, new Pessoa("Pedro"));
        System.out.println("Trocando todos: " + p);

        Collections.binarySearch(p, p.get(1));
    }
}
