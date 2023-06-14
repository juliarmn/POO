package generics;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Par<Integer, String> p1 = new Par<>("oi", 1);
        Par<String, String> p2 = new Par<>("2", "oi");
//
        boolean same = ParUtil.compare(p1, p2);
        System.out.println(same);


//        Integer[] array = {1, 2, 3};
//        System.out.println(ComComparable.<Integer>greaterThan(array, 1));

//        ListaGenerica<Integer> lista = new ListaGenerica<>();
//        lista.adiconarElemento(1);
//        lista.adiconarElemento(2);
//        lista.adiconarElemento(3);
//
//        lista.removerElemento(2);
//
//        lista.obterElementos();

//        Calculadora calculadora = new Calculadora();
//        List<Integer> lista = new ArrayList<>();
//        lista.add(1);
//        lista.add(1);
//        lista.add(1);
//        lista.add(1);
//
//        System.out.println(calculadora.<Integer>somarElementos(lista));



    }
}
