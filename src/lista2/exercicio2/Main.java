package lista2.exercicio2;
import java.util.Scanner;
import java.util.ArrayList;
//import lista2.exercicio1.Tempo;
public class Main {
    public static void main(String[] args) {
        ArrayList<Estacionamento> carro = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int op;
        do {
            System.out.println("Quer inserir mais um carro?");
            System.out.println("Digite qualquer valor para sim e 0 para não");
            op = scan.nextInt();
            scan.nextLine();
            if (op != 0) {
                Estacionamento carroNovo = new Estacionamento();
                System.out.println("Digite a placa do carro: ");
                carroNovo.setPlaca(scan.nextLine());
                System.out.println("Digite o modelo do carro: ");
                carroNovo.setModelo(scan.nextLine());
                System.out.println("Digite o tempo de entrada (hora minutos segundos) e de saída (hora minutos segundos):");
                carroNovo.tempoEntrada.setHoras(scan.nextInt());
                carroNovo.tempoEntrada.setMinutos(scan.nextInt());
                carroNovo.tempoEntrada.setSegundos(scan.nextInt());
                carroNovo.tempoSaida.setHoras(scan.nextInt());
                carroNovo.tempoSaida.setMinutos(scan.nextInt());
                carroNovo.tempoSaida.setSegundos(scan.nextInt());
                System.out.println("O id dessse carro é: " + Estacionamento.getId());
                carro.add(carroNovo);
            }
        } while (op != 0);
        if (carro.toArray().length != 0) {
            do {
                System.out.println("Quer ver os dados de mais um carro?");
                System.out.println("Digite qualquer valor para sim e 0 para não");
                op = scan.nextInt();
                if (op != 0) {
                    int id;
                    do {
                        System.out.println("Digite o id do carro que deseja verificar: ");
                        id = scan.nextInt();
                        if (id > carro.toArray().length) {
                            System.out.println("Digite um id válido!");
                        }
                    } while (id > carro.toArray().length);
                    carro.get(id - 1).imprimirDadosCarro(id);
                }
            } while (op != 0);
        }
        System.out.println("Programa encerrado");
    }
}
