package trabalho1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Classe <code>Banco</code> que guarda os dados do banco e a lista de agência, permitindo o acesso às contas em cascata
 * (pelo banco acessa a agência e depois a conta). Cadastra a Agência e permite meios mais seguros de acessar os dados da conta.
 * Conta logada é um campo de Banco que permite acessar a conta e por meio das operações, modificar o saldo do cliente.
 */
public class Banco {
    protected int numeroBanco;
    protected String nome;
    protected String cnpj;
    protected String endereco;
    protected Conta contaLogada;
    protected ArrayList<Agencia> agencias = new ArrayList<>();

    /**
     * Construtor
     * @param nome do banco
     * @param numeroBanco tipo int
     * @param cnpj tipo String
     * @param endereco tipo String
     */
    public Banco(String nome, int numeroBanco, String cnpj, String endereco) {
        this.nome = nome;
        this.numeroBanco = numeroBanco;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

   /* public Conta getContaLogada() {
        return contaLogada;
    }*/

    /**
     * Conseguir acessar os objetos do tipo Agência na lista dentro do banco.
     * @return lista de agências
     */

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    /**
     * Adiciona uma nova agência na lista, mas criando um objeto agência da classe Agencia dentro do método add()
     * @param nome da agência (String)
     * @param codigo da agência (int)
     * @param endereco da agência (String)
     */
    public void cadastrarAgencias(String nome, int codigo, String endereco) {
        agencias.add(new Agencia(nome, codigo, endereco));
    }

    /**
     * Método void que adiciona uma agência já criada posteriormente, não cria dentro do método
     * add() um objeto do tipo Agência.
     * @param agencia objeto da classe Agência
     */
    public void cadastrarAgencias(Agencia agencia) {
        agencias.add(agencia);
    }

    public void cadastrarConta(Conta conta, Agencia agencia) {
        agencia.cadastrarConta(conta);
    }


    //Tentar usar o hash set -> sugestão

    /**
     * Método que retorna uma valor boolean (lógico) que encontra a conta e permite o login nela. Valida pela senha
     * @param numAgencia int que indica quais das agências da lista que possui a conta que se deseja acessar
     * @param numConta int que indica o número da conta, para localizá-la na lista de contas
     * @param senha String que permite a segurança da conta -> ela que permite acessar os dados da conta e fazer as operações
     * @return true se encontrou a conta e false se não encontrou
     */
    public boolean logarCliente(int numAgencia, int numConta, String senha) {
        for (Agencia item : agencias) {
            if (item.getCodigo() == numAgencia) {
                Conta conta = item.buscarConta(numConta, senha);
                if (conta != null) {
                    contaLogada = conta;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método para ver o saldo -> acessa o getSaldo da classe Conta
     * @return double -> valor do saldo
     */

    public double verSaldo() {
        return this.contaLogada.getSaldo();
    }

    /**
     * Acessa o método de depósito na conta requerida
     * @param valor que deseja depositar
     */
    public void depositarValor(double valor) {
        this.contaLogada.depositar(valor);
        contaLogada.getExtrato().adicionarTransacao(1, valor);
    }

    /**
     * Acessa o método sacar na conta logada
     * @param valor double que quer sacar
     * @return boolean para ver se foi possível sacar
     */
    public void sacarValor(double valor) {
        if (this.contaLogada.sacar(valor)) {
            contaLogada.getExtrato().adicionarTransacao(2, valor);
        }
    }

    /**
     * Buscar a Agência pelo número, para posteriormente, em outro método, achar a conta para qual se quer transferir algum valor
     * @param numAgencia indica o número da agẽncia que queremos acessar na lista de agências
     * @return um objeto da classe Agência
     */

    public Agencia buscarAgencia(int numAgencia) {
        for (Agencia item : agencias) {
            if (item.getCodigo() == numAgencia) {
                return item;
            }
        }
        return null;
    }

    /**
     * Método para realizar a transferência entre as contas: dentro dele temos o input do valor e validamos.
     * Faz um depósito da conta que está transferindo e um saque para a conta a qual a transferência é realizada.
     * @param numAgencia número da agência da conta que o cliente quer transferir
     * @param numConta número da conta  para qual o cliente quer transferir o valor
     * @return boolean true se deu certo e false se deu errado
     */
    public boolean realizarTransferencia(int numAgencia, int numConta) {
        Scanner scan = new Scanner(System.in);
        double valor;
        Agencia agenciaBuscar = buscarAgencia(numAgencia);
        if (agenciaBuscar != null) {
            //Usar sobrecarga
            Conta contaBuscar = agenciaBuscar.buscarConta(numConta);
            if (contaBuscar != null) {
                System.out.println("Digite o valor de transferencia para " + contaBuscar.getNomeCliente());
                valor = scan.nextDouble();
                if (valor >= 0 && contaLogada.sacar(valor)) {
                    contaBuscar.depositar(valor);
                    contaLogada.getExtrato().adicionarTransacao(3, valor);
                    contaBuscar.getExtrato().adicionarTransacao(4, valor);
                    return true;
                } else {
                    System.out.println("Valor inválido");
                }
            } else {
                System.out.println("Conta inválida");
            }
        } else {
            System.out.println("Agência inválida");
        }

        return false;
    }

    /**
     * Método que faz a transferência por pix, usando o cpf digitado.
     * A ideia é como o método de transferência:
     * Faz um depósito da conta que está transferindo e um saque para a conta a qual a transferência é realizada.
     * @param cpf é uma String e representa o CPF da conta que queremos transferir
     * @return boolean true se deu certo e false se deu errado
     */

    public boolean transferirPix(String cpf) {
        Scanner scan = new Scanner(System.in);
        for (Agencia item : agencias) {
            Conta conta = item.buscarConta(cpf);
            if (conta != null) {
                System.out.println("Digite o valor para fazer o pix");
                double valor = scan.nextDouble();
                if (contaLogada.sacar(valor)) {
                    conta.depositar(valor);
                    contaLogada.getExtrato().adicionarTransacao(5, valor);
                    conta.getExtrato().adicionarTransacao(6, valor);
                    System.out.println("Pix realizado com sucesso para " + conta.getNomeCliente());
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Chama o método de imprimir extrato em conta.
     */
    public void imprimirExtrato() {
        contaLogada.imprimirExtrato();
    }

    /**
     * Coloca o contaLogada como null, tirando a referênciqa do objeto anterior.
     */
    public void deslogarConta() {
        this.contaLogada = null;
    }
}
