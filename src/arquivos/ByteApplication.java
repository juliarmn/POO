package arquivos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteApplication {
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
    int count  = 0;
        try{
            in = new FileInputStream("/home/jua/IdeaProjects/POO/src/arquivos/x.txt");
            out = new FileOutputStream("/home/jua/IdeaProjects/POO/src/arquivos/out.txt");
            int c;
            while((c = in.read()) != -1) {
                out.write(c);
                count += c;
            }
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
        System.out.println(count);
    }
}
