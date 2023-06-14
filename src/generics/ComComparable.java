package generics;

public class ComComparable {
    public static <T extends Comparable<T>> int greaterThan (T[] anArray, T element) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(element) > 0)
                count ++;
        }
        return count;
    }
}
