package collections;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<Integer> conj = new TreeSet<>();
        conj.add(1);
        conj.add(134);
        conj.add(54);
        conj.add(3);
        conj.add(134);//Repetido não insere

        System.out.println("Tamanho: " + conj.size());
        System.out.println("Contém 3? " + conj.contains(3));

        for (Integer num : conj)
            System.out.println(num);
    }
}
