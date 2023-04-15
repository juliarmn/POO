package aula3.carros;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private static int num = 0;
    Carro carro;
    Cliente cliente;
    LocalDateTime dataIn = LocalDateTime.now();
    LocalDateTime dataFim;
    public Locacao (Carro carro, Cliente cliente) {
        this.carro = carro;
        this.cliente = cliente;
        num ++;
    }

    public void finalizarLocacao() {
        dataFim = LocalDateTime.now();
    }

    public int calcularTempoTotal () {
        int diferencaDias = (int) ChronoUnit.DAYS.between(dataIn, dataFim);
        return diferencaDias;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Locacao.num = num;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataIn() {
        return dataIn;
    }

    public void setDataIn(LocalDateTime dataIn) {
        this.dataIn = dataIn;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }
}
