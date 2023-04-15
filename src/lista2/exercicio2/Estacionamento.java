/*Crie uma classe Estacionamento para armazenar dados de um estacionamento. Os atributos devem
representar a placa e modelo do carro além da hora de entrada e saída do estacionamento. Utilize
dois objetos da classe Tempo criada no exercício anterior. Crie métodos para:
a. Funcionar como getter e setter;
b. Inicializar os dados com vazio ou zero;
c. Imprimir os dados de um carro estacionado;
d. Calcular e retornar o valor a ser pago pelo carro estacionado. Considere o preço de R$1,50 por
hora. Utilize o método da classe Tempo.*/

package lista2.exercicio2;
import lista2.exercicio1.Tempo;

public class Estacionamento {
    Tempo tempoEntrada = new Tempo();
    Tempo tempoSaida = new Tempo();
    private String placa;
    private String modelo;

    private static int id = 0;

    public Estacionamento () {
        id ++;
        placa = null;
        modelo = null;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Tempo getTempoEntrada() {
        return tempoEntrada;
    }

    public Tempo getTempoSaida() {
        return tempoSaida;
    }

    public static int getId() {
        return id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTempoEntrada(Tempo tempoEntrada) {
        this.tempoEntrada = tempoEntrada;
    }

    public void setTempoSaida(Tempo tempoSaida) {
        this.tempoSaida = tempoSaida;
    }

    public static Double calculaValor (Tempo tempoEntrada, Tempo tempoSaida, Tempo diferenca) {
        diferenca = diferenca.subtrairTempo(tempoSaida, tempoEntrada, diferenca);
        return (diferenca.getHoras() * 1.5);
    }

    public void imprimirDadosCarro (int id) {
        Tempo diferenca = new Tempo();
        System.out.println("-----------------------------------------");
        System.out.println("Dados do carro " + id + ":");
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tempo de entrada: ");
        tempoEntrada.formataTempo(tempoEntrada.getHoras(), tempoEntrada.getMinutos(), tempoEntrada.getSegundos());
        System.out.println("Tempo de saída: ");
        tempoSaida.formataTempo(tempoSaida.getHoras(), tempoSaida.getMinutos(), tempoSaida.getSegundos());
        System.out.println("Valor a ser pago: " + Estacionamento.calculaValor(tempoEntrada, tempoSaida, diferenca));
        System.out.println("-----------------------------------------");
    }
}
