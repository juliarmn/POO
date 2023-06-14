package generics;

public class ParUtil {
    public static <K,V> boolean compare(Par<Integer, String> p1, Par<String, String> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
