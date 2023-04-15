package trabalho1;
/**<p> O objetivo desta classe é armazenar os dados de cada cliente em uma classe <code>Cliente</code> que possui uma conta no banco.
 * Ademais, realiza as operações de saque e depósito em uma conta do banco.
 * Valida também a senha para ver a conta cuja senha passada é correspondente.
 * </p>
 * @author Júlia Rodrigues
 * */
public class Conta {
    protected int numeroConta;
    protected double saldo;
    protected String nomeCliente;
    protected String endereco;
    protected String cpf;
    protected String dataNascimento;
    protected String senha;

    protected Extrato extrato = new Extrato();

    /**
     * Constructor
     * @param num recebe o número da conta
     * @param saldo
     * @param nome
     * @param endereco
     * @param cpf
     * @param dataNascimento
     * @param senha
     */
    public Conta (int num, double saldo, String nome, String endereco, String cpf, String dataNascimento, String senha) {
        this.numeroConta = num;
        this.saldo = saldo;
        this.nomeCliente = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }


    /**
     * Método get para acessar o saldo da conta
     * @return double saldo
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * Acessar o CPF do cliente
     * @return String CPF
     */

    public String getCpf() {
        return cpf;
    }

    /**
     * Consegue acessar o nome do cliente
     * @return String nome
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Método para acessar o número da conta
     * @return int número da conta
     */

    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Método para cessar o extrato
     * @return objeto da classe Extrato da conta
     */
    public Extrato getExtrato() {
        return extrato;
    }

    /**
     * Função que faz o depósito, verifica se o valor digitado é válido para continuar a operação
     * @param valor para as comparações e operações
     * @return
     */


    public void depositar (double valor) {
        this.saldo += valor;
    }

    /**
     * Função para realizar o saque na conta
     * Verfifica se o valor para saque é maior que o saldo da conta (caso que não poderia sacar)
     * @param valor tipo double para decrementar da conta
     * @return boolean -> true se funcionou o saque e false se não foi realizado
     */
    public boolean sacar (double valor) {
        if (saldo < valor || valor < 0) {
            System.out.println("Saldo insuficiente ou valor inválido");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    /**
     * Função de validação de senha para que possa logar a conta
     * @param senhaComparacao é a string para comparar e ver se a senha é dessa conta
     * @return true se for a senha correta e false se não for
     */
    public boolean validarSenha(String senhaComparacao) {
        return (this.senha.equals(senhaComparacao));
    }
    public void setSenha (String senhaAtual, String novaSenha) {
        if(validarSenha(senhaAtual)) {
            this.senha = novaSenha;
        }
    }

    /**
     * Chama o método imprimirExtrato() da classe Extrato
     * Imprime dados adicionais sobre a conta.
     */

    public void imprimirExtrato() {
        System.out.println("Nome: " + getNomeCliente() + "\tNúmero da Conta: " + getNumeroConta());
        this.extrato.imprimirExtrato();
        System.out.println("Saldo final: " + getSaldo());
    }
}
