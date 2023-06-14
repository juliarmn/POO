package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <T> List<T> concatenarListas(List<? extends T> lista1, List<? extends T> lista2) {
        List<T> listaConcatenada = new ArrayList<>();
        listaConcatenada.addAll(lista1);
        listaConcatenada.addAll(lista2);
        return listaConcatenada;
    }
}
