package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Ana");
        fila.offer("Marcos");
        fila.offer("Gabriel");

        System.out.println("Tamanho: " + fila.size());
        System.out.println("Próximo elemento: " + fila.peek());

        while (!fila.isEmpty()) {
            String elemento = fila.poll();
            System.out.println("Removido: " + elemento);
            System.out.println("Próximo elemento: " + fila.peek());
        }
    }
}
