package generics;

public class Box <T>{
    private T elem;

    public Box(T elem) {
        this.elem = elem;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public void add(Number elem) {
        System.out.println("Vai tomar no cu " + elem);
    }

    public void boxTest(Box<? extends Number> n) {
        System.out.println(n.getElem());
    }
}
