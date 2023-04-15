package aula3.carros;

public class Carro {
    private String modelo;
    private String placa;
    private double precoDiaria;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public Carro (String modelo, String placa, double preco) {
        this.modelo = modelo;
        this.placa = placa;
        this.precoDiaria = preco;

    }


}
