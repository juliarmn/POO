package iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colecao {

    static void filterSafe(List<Integer> lista) {
        for(Iterator<Integer> it = lista.iterator(); it.hasNext(); ) {
            if (it.next() > 50)
                it.remove();
        }
    }
    static void filterUnsafe(List<Integer> lista) {
        for(int i = 0; i < lista.size(); i ++) {
            if (lista.get(i) > 50)
                lista.remove(i);
        }
    }
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(9);
        lista.add(12);
        lista.add(18);
        lista.add(25);
        lista.add(55);
        lista.add(67);
        lista.add(81);
        lista.add(83);

        filterSafe(lista);
        System.out.println(lista);
    }
}
