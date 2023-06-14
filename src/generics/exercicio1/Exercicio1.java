package generics.exercicio1;

import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class Exercicio1 {
    public static void imprimeAlfabetica (String x) {
        Map<String, Integer> contador = new TreeMap<>(CASE_INSENSITIVE_ORDER);
        String[] palavras = x.split("\\s+");
        for (String pal : palavras) {
            contador.put(pal, contador.getOrDefault(pal, 0) + 1);
        }
        System.out.println("Ordem alfabética: ");
        for(Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void imprime10MaisFrequentes(String x) {
        Map<String, Integer> contador = new TreeMap<>(CASE_INSENSITIVE_ORDER);
        String[] palavras = x.split("\\s+");
        for (String palavra : palavras) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(contador.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("As dez palavras mais frequentes:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count >= 10) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite:");
        String x = scan.nextLine();
        imprimeAlfabetica(x);
        imprime10MaisFrequentes(x);
    }

}
