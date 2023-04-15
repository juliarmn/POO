package trabalho1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe para leitura dos arquivos e depois permitir o login e realização de operações pelo usuário.
 * Tem a tela do usuário: opções de operações.
 * O único campo é do tipo Banco.
 */
public class DisplayBanco {
    private Banco meuBanco;

    /**
     * Faz a leitura do arquivo de bancos usando os métodos para leitura de arquivos.
     * Chama outros métodos para ler os arquivos de agẽncia (dentro dele lê o de contas) e o de login() após ler os arquivos.
     * @param bancos caminho do arquivo "bancos.txt"
     * @param agencias caminho do arquivo "agencias.txt"
     * @param contas caminho do arquivo "contas.txt"
     */
    public DisplayBanco(String bancos, String agencias, String contas) throws RuntimeException{
        File arquivo = new File(bancos);
        Scanner scan;
        try {
            scan = new Scanner(arquivo);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Sem arquivo de Banco");
        }

        while (scan.hasNextLine()) {
            //Ler a linha
            String linha = scan.nextLine();
            //Separar os elementos pelo #
            String[] campos = linha.split("#");
            //Shadowing:
            String nome = campos[0];
            int valorNum = Integer.valueOf(campos[1]);
            String cnpj = campos[2];
            String endereco = campos[3];
            //Imprimir para ver se está correto
            // for (String campo : campos) {
            //    System.out.println(campo + "|");
            //}
            //System.out.println();
            this.meuBanco = new Banco(nome, valorNum, cnpj, endereco);
        }
        File arquivoAgencia = new File(agencias);
        File arquivoContas = new File(contas);
        lerArquivoAgencia(arquivoAgencia, arquivoContas);
    }

    /**
     * Leitura do arquivo de agências.
     * Chama o método para  ler o arquivo de contas.
     * @param arquivoAgencia caminho do arquivo de agências
     * @param arquivoContas caminho do caminho de contas para passar de parâmetro para o próximo método
     */

    public void lerArquivoAgencia(File arquivoAgencia, File arquivoContas) throws RuntimeException{
        Scanner scan;
        try {
            scan = new Scanner(arquivoAgencia);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Sem arquivo de Agência");
        }

        while (scan.hasNextLine()) {
            //Ler a linha
            String linha = scan.nextLine();
            //Separar os elementos pelo #
            String[] campos = linha.split("#");
            //Separar os valores para uma melhor vizualização  do código
            String nome = campos[0];
            int valorNum = Integer.valueOf(campos[1]);
            String endereco = campos[2];
            Agencia agencia = new Agencia(nome, valorNum, endereco);
            this.meuBanco.cadastrarAgencias(agencia);
        }
        lerArquivoContas(arquivoContas);
    }

    /**
     * Leitura do arquivo de contas.
     * @param arquivo caminho do arquivo de contas.
     */
    public void lerArquivoContas(File arquivo) throws RuntimeException{
        Scanner scan;
        try {
            scan = new Scanner(arquivo);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Sem arquivo de Conta");
        }

        while (scan.hasNextLine()) {
            //Ler a linha
            String linha = scan.nextLine();
            //Separar os elementos pelo #
            String[] campos = linha.split("#");
            String nome = campos[0];
            String data = campos[1];
            String endereco = campos[2];
            String cpf = campos[3];
            double saldo = Double.valueOf(campos[4]);
            int numAgencia = Integer.valueOf(campos[5]);
            int numConta = Integer.valueOf(campos[6]);
            String senha = campos[7];
            Conta conta = new Conta(numConta, saldo, nome, endereco, cpf, data, senha);
            for (Agencia item : meuBanco.agencias) {
                if (item.getCodigo() == numAgencia) {
                    meuBanco.cadastrarConta(conta, item);
                }
            }
        }
    }

    /**
     * Método para acessar a conta do cliente, ele tem 3 tentativas para acertar, caso erre, o login é travado.
     * Acesso ao método de Banco para logar o cliente pelos dados de número da agência, número da conta e senha.
     */

    public void login() {
        //Farei 3 tenativas
        int tentativas = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite o número da Agência: ");
            int numAgencia = scan.nextInt();
            System.out.println("Digite o número da conta: ");
            int numConta = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite a senha: ");
            String senha = scan.nextLine();
            if (meuBanco.logarCliente(numAgencia, numConta, senha)) {
                telausuario(scan);
            } else {
                System.out.println("Tente novamente");
            }
            tentativas++;
        } while (tentativas < 3);
        System.out.println("Não foi possível fazer o login");
        //Validação depois!!!
    }

    /**
     * Caso tenha logado, acessa a tela do usuário, que é um método de menu e escolha das opções das operações.
     * Pode consultar o saldo, depositar, sacar, trasnferir,realizar PIX ou sair (abre o login novamente).
     * @param scan tipo Scanner já aberto no método de login.
     */

    private void telausuario(Scanner scan) {
        int op;
        do {
            do {
                System.out.println("Bem vindo ao Banco Unesp");
                System.out.println("Selecione uma opção:");
                System.out.println("1) Consultar Saldo;");
                System.out.println("2) Depósito;");
                System.out.println("3) Saque;");
                System.out.println("4) Transferência;");
                System.out.println("5) Pix;");
                System.out.println("6) Ver extrato;");
                System.out.println("7) Sair;");
                op = scan.nextInt();
                if (op < 1 || op > 7) {
                    System.out.println("------------------");
                    System.out.println("Opção inválida!");
                    System.out.println("Tente novamente");
                    System.out.println("------------------");
                }
            } while (op < 1 || op > 7);
            switch (op) {
                case 1 -> verSaldo();

                case 2 -> depositarValor(scan);

                case 3 -> sacarValor(scan);

                case 4 -> realizarTransferencia(scan);

                case 5 -> transferirPorPix(scan);

                case 6 -> imprimirExtrato();

                case 7 -> deslogarConta();

            }
        } while (op != 7);
    }

    /**
     * De acordo com a opção 1 do menu, permite o usuário acessar seu saldo pelo método presente na classe Banco.
     */
    protected void verSaldo() {
        System.out.println("Seu saldo é: " + meuBanco.verSaldo());
    }

    /**
     * Permite o usuário escolher um valor para depósito, de acoerdo com a opção 2 do menu.
     * Chama o método depositar de Banco.
     * @param scan tipo Scanner já aberto anteriormente -> input de dados (valor a ser depositado)
     */
    protected void depositarValor(Scanner scan) {
        double valor;
        System.out.println("Digite o valor que deseja depositar: ");
        valor = scan.nextDouble();
        if (valor <= 0) {
            //Acho que dá para melhorar essa validação
            System.out.println("------------------");
            System.out.println("Valor inválido!");
            System.out.println("------------------");
            return;
        }
        meuBanco.depositarValor(valor);
        verSaldo();
    }

    /**
     * Método que chama outro método da classe Banco para depositar um valor que o usuário deseja sacar, de acordo com a opção 3 do menu.
     * @param scan tipo Scanner já aberto anteriormente -> input de dados (valor a ser sacado).
     */

    protected void sacarValor(Scanner scan) {
        double valor;
        System.out.println("Digite o valor que deseja sacar: ");
        valor = scan.nextDouble();
        meuBanco.sacarValor(valor);
        verSaldo();
    }

    /**
     * Permite chamar o método da classe Banco para realizar a transferência, dando 3 tentativas de acertar os dados digitados.
     * @param scan scan tipo Scanner já aberto anteriormente -> input de dados (valor a ser transferido).
     */

    protected void realizarTransferencia(Scanner scan) {
        int tentativas = 0;
        int numAgencia;
        int numConta;
        boolean transferencia;
        do {
            System.out.println("Digite o número da Agência: ");
            numAgencia = scan.nextInt();
            System.out.println("Digite o número da Conta: ");
            numConta = scan.nextInt();
            transferencia = meuBanco.realizarTransferencia(numAgencia, numConta);
            if (transferencia) {
                System.out.println("Operação realizada com sucesso");
                verSaldo();
            } else {
                System.out.println("------------------------------------");
                System.out.println("Digite novamente");
                System.out.println("------------------------------------");
                tentativas++;
            }
        } while (tentativas < 3 && !transferencia);
    }

    /**
     * Permite chamar o método em Banco para fazer o pix.
     * Só tem uma opção de digitar os dados.
     * @param scan scan tipo Scanner já aberto anteriormente -> input de dados (valor a ser trasnferido).
     */

    protected void transferirPorPix(Scanner scan) {
        scan.nextLine();
        System.out.println("Digite o CPF da conta para qual você deseja ralizar o PIX");
        String cpf = scan.nextLine();
        if (meuBanco.transferirPix(cpf)) {
            verSaldo();
        } else {
            System.out.println("Não foi possível completar a transferência");
        }
    }

    /**
     * Chama os métodos para inmprimir o extrato da conta
     */

    protected void imprimirExtrato() {
        System.out.println("\t\tExtrato");
        System.out.println("------------------------");
        meuBanco.imprimirExtrato();
    }

    /**
     * Método que permite deslogar da conta, chamando o método deslogarConta de Banco.
     * Depois de deslogar chama a tela de login novamente.
     */


    protected void deslogarConta() {
        System.out.println("Até a próxima");
        meuBanco.deslogarConta();
        login();
    }
}
