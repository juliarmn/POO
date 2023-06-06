package arquivos;
import java.io.*;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        BufferedReader inBuff = null;
        FileWriter out = null;
        BufferedWriter outBuff = null;

        try {
            in = new FileReader("/home/jua/IdeaProjects/POO/src/arquivos/x.txt");
            inBuff = new BufferedReader(in);
            out = new FileWriter("out.txt");
            outBuff = new BufferedWriter(out);
            int count = 0;

            String c;
            while((c = inBuff.readLine()) != null) {
                count ++;
                outBuff.write(c);
                outBuff.newLine();
            }
            System.out.println(count);
        } finally {
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}
