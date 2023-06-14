package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Double> lista2 = new ArrayList<>();
        List<Number> lista3 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);

        lista2.add(1.1);
        lista2.add(1.3);
        lista3 = Util.<Number>concatenarListas(lista1, lista2);
        for(Number n : lista3) {
            System.out.println(n);
        }
    }
}
