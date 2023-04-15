package trabalho1;

/**
 * <code>Main</code> serve para chamar a classe DisplayBanco e passar o caminho dos arquivos
 * @author Júlia Rodrigues
 */
public class Main {
    public static void main(String[] args) {
        /**
         *A String path é aquela que guarda a parte comum do caminho dos arquivos -> não repetir a escrita.
         * bancos, agencias e contas são Strings com o caminho dos arquivos.
         * Chama displayBanco e faz o login após a leitura dos arquivos.
         */
        String path = "src/trabalho1/";
        String bancos = path + "banco.txt";
        String agencias = path + "agencias.txt";
        String contas = path + "contas.txt";
        DisplayBanco displayBanco = new DisplayBanco(bancos, agencias, contas);
        displayBanco.login();
    }
}
