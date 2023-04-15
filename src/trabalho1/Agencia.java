package trabalho1;
import java.util.ArrayList;

/**
 * A classe Agencia serve para acessar os campos de agência e guardar uma lista de contas da agência correspondente.
 * Ademais, é por essa classe que cadastramos a conta e fazemos buscas por contas de modos diferentes (usei sobrecarga de operadores).
 */
public class Agencia {
    protected int codigo;
    protected String nome;
    protected String endereco;
    protected ArrayList<Conta> contas = new ArrayList<>();

    /**
     * Constructor
     * @param nome recebe a String que representa o nome da Agência
     * @param codigo recebe o inteiro que representa o código da Agência
     * @param endereco recebe a String com endereço da Agência
     */
    public Agencia (String nome, int codigo, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    /**
     * Método get para conseguir pegar a string nome
     * @return String nome da agência
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método get para conseguir acessa o código da agẽncia
     * @return int código da agência
     */

    public int getCodigo() {
        return codigo;
    }

    /**
     * Adiciona a conta na lista de Agências
     * @param conta é um objeto do tipo Conta, que será adicionado na lista de agências
     */
    public void cadastrarConta(Conta conta) {
        contas.add(conta);
    }

    /**
     * Primeira forma de busca
     * @param numConta usa o número da conta
     * @param senha usa uma senha para validar se a senha inserida é a da conta mesmo (Usa um método de Contas)
     * @return a conta correta
     */
    public Conta buscarConta(int numConta, String senha) {
        for (Conta item : contas) {
            if (item.getNumeroConta() == numConta && item.validarSenha(senha)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Busca a conta apenas pelo número da conta para realizar transferências -> não acessa a conta em si
     * @param numConta indica a conta para transferir
     * @return a conta requerida
     */
    public Conta buscarConta(int numConta) {
        int i, tam;
        tam = contas.toArray().length;
        for (i = 0; i < tam; i ++) {
            if (contas.get(i).getNumeroConta() == numConta) {
                return contas.get(i);
            }
        }
        return null;
    }

    /**
     * Busca a conta pelo CPF para realizar o pix
     * @param cpf indica o CPF da conta que queremos acessar
     * @return a conta requerida
     */
    public Conta buscarConta(String cpf) {
        for (Conta item : contas) {
            if (item.getCpf().equals(cpf)) {
                return item;
            }
        }
        return null;
    }
}
