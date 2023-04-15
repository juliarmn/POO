package trabalho1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Classe cuja função é armazenar os históricos de transações.
 * Lista de strings que vai armazenando todos os dados.
 */

public class Extrato {
    private String data = LocalDate.now().toString();
    private String hora = LocalTime.now().toString();
    private String tipo;
    private String valor;
    private ArrayList<String> linhaExtrato = new ArrayList<>();
    String dados;

    /**
     * Função que trata os dados para armazená-los na lista de Strings com os dados.
     * @param tipo para conseguirmos saber o tipo de transação realizada.
     * @param valor para indicar o quanto de dinheiro entrou ou saiu da conta.
     */

    public void adicionarTransacao (int tipo, double valor)  {
        if (tipo == 1) {
            this.tipo = "Depósito";
        } else if (tipo == 2) {
            this.tipo = "Saque";
            valor = -valor;
        } else if (tipo == 3) {
            this.tipo = "Transferência";
            valor = -valor;
        } else if (tipo == 4) {
            this.tipo = "Depósito transferência";
        } else if (tipo == 5){
            this.tipo = "Pix";
            valor = -valor;
        } else {
            this.tipo = "Recebido por pix";
        }
        this.valor =  String.valueOf(valor);
        dados = data + "\t" + hora + "\t" + this.tipo + "\t" + this.valor;
        linhaExtrato.add(dados);
    }

    /**
     * Imprime os itens da lista;.
     */

    public void imprimirExtrato () {
        for (String item : linhaExtrato) {
            System.out.println(item);
        }
    }
}
