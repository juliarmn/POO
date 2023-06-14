package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> conj = new HashSet<>();
        conj.add("Júlia");
        conj.add("Bianca");
        conj.add("Júlia");//Duplicado não será adicionado
        conj.add("Ana");

        System.out.println("Tamanho: " + conj.size());
        System.out.println("Contém 'Júlia'? " + conj.contains("Júlia"));

        for(String elem : conj) {
            if(elem.equals("Ana")) {
                System.out.println("Achei a Ana!");
            }
        }
    }
}
