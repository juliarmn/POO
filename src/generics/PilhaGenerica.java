package generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Queue;

public class PilhaGenerica <T> {
    private List<T> pilha = new ArrayList<>();
    public void empilhar (T elem) {
        pilha.add(elem);
    }
    public T desempilhar () {
        if (pilha.isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.remove(pilha.size() - 1);
    }
}
