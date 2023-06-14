package collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class ExemploDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerLast(3);
        deque.offerLast(2);

        System.out.println("Tamanho do deque: " + deque.size());
        System.out.println("Primeiro elemento: " + deque.peekFirst());
        System.out.println("Último elemento: " + deque.peekLast());

        while (!deque.isEmpty()) {
            Integer elemento = deque.pollFirst();
            System.out.println("Removido: " + elemento);
        }
    }
}
