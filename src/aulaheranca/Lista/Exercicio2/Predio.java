package aulaheranca.Lista.Exercicio2;

import java.util.ArrayList;

public class Predio {
    int numero;
    String endereco;
    int andares;
    ArrayList<Apartamento> apartamentos = new ArrayList<>();

    public Predio(int numero, String endereco, int andares) {
        this.numero = numero;
        this.endereco = endereco;
        this.andares = andares;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public boolean adicionarApt(int num, int andar, int numQuartos) {
        if (numQuartos > 3) {
            return false;
        }
        if (andar > this.andares) {
            return false;
        }
        for (Apartamento apt : apartamentos) {
            if (apt.getNumero() == num) {
                return false;
            }
        }
        apartamentos.add(new Apartamento(num, andar, numQuartos));
        return true;
    }
}
