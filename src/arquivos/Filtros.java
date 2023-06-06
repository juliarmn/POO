package arquivos;

import java.io.*;

public class Filtros {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        InputStreamReader filterIn = null;
        FileOutputStream out = null;
        OutputStreamWriter filterOut = null;
        try {
            in = new FileInputStream("/home/jua/IdeaProjects/POO/src/arquivos/x.txt");
            filterIn = new InputStreamReader(in);
            out = new FileOutputStream("/home/jua/IdeaProjects/POO/src/arquivos/out.txt");
            filterOut = new OutputStreamWriter(out);

            int c;

            while ((c = filterIn.read()) != -1) {

                filterOut.write(Character.toUpperCase(c));


            }
        } finally {

            if (filterIn != null) filterIn.close();
            if (filterOut != null) filterOut.close();

            if (in != null) in.close();
            if (out != null) out.close();

        }
    }
}
