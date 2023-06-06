package arquivos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class xanadu {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        FileInputStream in = null;

        try {
            in = new FileInputStream("/home/jua/IdeaProjects/POO/src/arquivos/x.txt");
            out = new FileOutputStream("y.txt");

            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(in!= null) in.close();
            if(out!= null) out.close();
        }
    }
}
