package collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "o");
        map.put(4, "a");
        map.put(2, "s");
        map.put(66, "b");

        System.out.println("Tamanho do mapa: " + map.size());
        System.out.println("Valor associado à chave 4: " + map.get(2));

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}
