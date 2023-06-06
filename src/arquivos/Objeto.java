package arquivos;

import java.io.*;
import java.math.BigDecimal;

public class Objeto {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("out.dat"));
            BigDecimal n1 = new BigDecimal(1000);
            BigDecimal n2 = new BigDecimal(22000);
            out.writeObject(n1);
            out.writeObject(n2);
        } finally {
            out.close();
        }

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("out.dat"));
            BigDecimal n3 = (BigDecimal) in.readObject();
            BigDecimal n4 = (BigDecimal) in.readObject();
            System.out.format("%d e %d", n3.intValue(), n4.intValue());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            in.close();
        }
    }
}
