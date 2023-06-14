package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T> {
    List<T> lista = new ArrayList<>();
    public void adiconarElemento(T elemento) {
        lista.add(elemento);
    }

    public void removerElemento(T elemento) {
        lista.remove(elemento);
    }
    public void obterElementos() {
        for (T e : lista) {
            System.out.println(e);
        }
    }
}
