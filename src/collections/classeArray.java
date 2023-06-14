package collections;

import java.util.Arrays;
import java.util.List;

public class classeArray {
    public static void main(String[] args) {
        String[] array = {"Júlia", "Amanda", "Bianca"};
        List<String> lista = Arrays.asList(array);
        System.out.println(lista);
        array[0] = "Ana";
        System.out.println(lista);
    }
}
