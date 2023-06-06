package generics;

public class Main {
    public static void main(String[] args) {
        Box<Number> box = new Box<>(10);
        box.add(10);
        box.add(10.2);

    }
}
