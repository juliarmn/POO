package fundamentos.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        //byte
        Byte b = 110;
        //tipo short
        Short s = 1000;
        //int
        Integer i = 10000;
        //tipo long
        Long l = 1000000L;
        //Pode-se, então, aplicar métodos
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        //Interger.parseInt("10") -> passa de string para int
        System.out.println(l.compareTo(100L));
        //De string para booleano:
        Boolean value = Boolean.parseBoolean("true");
        //De booleano para string:
        System.out.println(value.toString().toUpperCase());

        Character c = '@';
        System.out.println(c + "><><");
    }
}
