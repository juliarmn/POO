package arquivos;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharApplication {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("/home/jua/IdeaProjects/POO/src/arquivos/x.txt");
            out = new FileWriter("/home/jua/IdeaProjects/POO/src/arquivos/out.txt");
            int c;
            int count = 0;
            String leitura = "";
            while((c = in.read()) != -1) {
                if (c == ' ' || c == '\n') {
                    count++;

                    out.write(leitura + (char)c);
                    leitura = "";
                } else {
                    leitura += (char)c;
                }
                if(leitura.equals("amo")) {
                    leitura="sim";
                }
//                out.write(c);
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}
