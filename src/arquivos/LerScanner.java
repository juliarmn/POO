package arquivos;
import java.io.*;
import java.util.Scanner;
public class LerScanner {
    public static void main(String[] args) throws IOException{
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("/home/jua/IdeaProjects/POO/src/arquivos/x.txt")));
            while(s.hasNext()) {
                String linha = s.nextLine();
                if (linha.toUpperCase().contains("EU")) System.out.println(linha);
            }
        } finally {
            if (s != null) s.close();
        }
    }
}
