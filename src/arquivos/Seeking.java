package arquivos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Seeking {
    public static void main(String[] args) throws IOException {
        File fRand = new File("random.txt");
        RandomAccessFile raf = new RandomAccessFile(fRand, "rw");
        String [] books = new String[5];
        books[0] = "a\n";
        books[1] = "b\n";
        books[2] = "c\n";
        books[3] = "d\n";
        books[4] = "e\n";

        for (int  i = 0; i < books.length; i ++) {
            raf.writeUTF(books[i]);
        }

        raf.seek(0);
        raf.writeUTF("Oi\n");
        raf.seek(raf.length());
        raf.writeUTF("Oi\n");
        raf.seek(0);
    }
}
